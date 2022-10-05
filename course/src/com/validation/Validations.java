package com.validation;

import com.database.SelectQueries;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class Validations {
	 private float cutOff;
	    protected float calculateCutOff(float maths, float chemistry, float physics)
	    {

	        cutOff = (maths / 2) + (chemistry / 4) + (physics / 4);

	        return cutOff;
	    }
	    public static String displayInfo(float cutOff)
	    {
	        if (cutOff <= 200 && cutOff > 170)
	            return "You have allotted for Slot 1 based on your cut-off marks = "+ cutOff +"\nDate : 01/08/2022\nTime : 09:00am to 11:00am\n";

	        if (cutOff <= 170 && cutOff > 140)
	            return "You have allotted for Slot 2 based on cut-off marks = "+ cutOff +"\nDate : 01/08/2022\nTime : 11:00am to 01:00pm\n";

	        if (cutOff <= 140 && cutOff > 110)
	            return "You have allotted for Slot 3 based on cut-off marks = "+ cutOff +"\nDate : 01/08/2022\nTime : 01:00pm to 03:00pm\n";

	        if (cutOff <= 110 && cutOff > 70)
	            return "You have allotted for Slot 4 based on cut-off marks = "+ cutOff +"\nDate : 01/08/2022\nTime : 03:00pm to 05:00pm\n";

	        return "Sorry!, You don't have any slot " + cutOff ;
	    }

	    public static void displayStudentDetails(String userId) throws Exception
	    {
	        ResultSet studDetails = SelectQueries.studentDetails(userId);
	        ResultSetMetaData rsmd = studDetails.getMetaData();
	        if (studDetails.next()) {
	            for (int i = 1; i <= rsmd.getColumnCount(); i++)
	            {
	                String columnValue = studDetails.getString(i);
	                System.out.print(rsmd.getColumnName(i) + "             = " + columnValue);
	                System.out.println();
	            }
	        }
	    }

	    public static synchronized void viewTableData(ResultSet resultSet, ResultSetMetaData rsmd) throws Exception
	    {

	        int columnsNumber = rsmd.getColumnCount();
	        while (resultSet.next())
	        {
	            for (int i = 1; i <= columnsNumber; i++)
	            {
	                String columnValue = resultSet.getString(i);
	                System.out.print(columnValue + " ");
	            }
	            System.out.println();
	        }
	    }

}
