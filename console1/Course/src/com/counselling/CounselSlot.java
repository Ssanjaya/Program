package com.counselling;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.database.SelectQueries;
import com.database.UpdateQueries;
import com.validation.Validations;

public class CounselSlot implements Runnable
{

    private String userId;
    private String[] usersList;
    private int collegeCode;
    private String deptCode;
    ResultSet resultSet;
    ResultSetMetaData rsmd;
    DisplayCollegeDetails displayCollegeDetails = new DisplayCollegeDetails();

    public CounselSlot(String userId, String[] usersList)
    {
        this.userId = userId;
        this.usersList = usersList;

    }

    public static String milliSecondsToTimer(long milliseconds) {
        String finalTimerString = "";
        String minutesString = "";
        String secondsString = "";

        int hours = (int) (milliseconds / (1000 * 60 * 60));
        int minutes = (int) (milliseconds % (1000 * 60 * 60)) / (1000 * 60);
        int seconds = (int) ((milliseconds % (1000 * 60 * 60))
                % (1000 * 60) / 1000);

        if (hours > 0)
            finalTimerString = hours + ":";
        else
            finalTimerString = "00" + ":";

        if(minutes < 10)
            minutesString = "0" + minutes;
        else

            minutesString ="" + minutes;
        if (seconds < 10)
            secondsString = "0" + seconds;
        else
            secondsString = "" + seconds;

        finalTimerString = finalTimerString + minutesString + ":" + secondsString;

        return finalTimerString;
    }

    @Override
    public void run()
    {

        for(int i = 0; i < usersList.length; i ++)
        {
            if(userId.equals(usersList[i]))
            {
                long sleep = (usersList.length - (i + 1)) * 30000L;
                if(! (sleep == 0))
                    System.out.println("You have to wait for = " + milliSecondsToTimer(sleep) + " seconds. Sorry for the delay");
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        collegeCode = displayCollegeDetails.selectCollege();
        deptCode = displayCollegeDetails.selectDepartment(collegeCode);

        try {
            UpdateQueries.updateCollegeCodeAndDeptCode(collegeCode, deptCode, userId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            UpdateQueries.updateDepartmentSeats(collegeCode, deptCode);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            UpdateQueries.updateCollegeSeats(collegeCode);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Your counselling process has been successfully completed :)");
        System.out.println("\n------Your college and department details------\n");

        try {
            resultSet = SelectQueries.finalResult(collegeCode, deptCode);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            rsmd = resultSet.getMetaData();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("Dear " + userId);
            Validations.viewTableData(resultSet, rsmd);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thank You:)");
    }
}
