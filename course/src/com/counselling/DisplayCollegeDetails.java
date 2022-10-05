package com.counselling;

import com.database.SelectQueries;
import com.validation.Validations;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
public class DisplayCollegeDetails {

    int collegeCode = 0;
    String deptCode = null;
    ResultSet resultSet;
    ResultSetMetaData rsmd;
    Scanner sc = new Scanner(System.in);
    boolean isCollegeExist = false;
    boolean isDepartmentExist = false;

    synchronized int selectCollege()
    {

        while (!isCollegeExist)
        {
            try {
                resultSet = SelectQueries.collegeDetails();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                rsmd = resultSet.getMetaData();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                Validations.viewTableData(resultSet, rsmd);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("\nChoose your college code");
            collegeCode = sc.nextInt();
            try {
                isCollegeExist = SelectQueries.isCollegeCodeExist(collegeCode);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            if (!isCollegeExist)
                System.out.println("\nYou entered wrong college code!!!!!\n");
        }
        return collegeCode;
    }

    synchronized String selectDepartment( int collegeCode)
    {
        while (!isDepartmentExist)
        {
            try {
                resultSet = SelectQueries.departmentDetails(collegeCode);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                rsmd = resultSet.getMetaData();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                Validations.viewTableData(resultSet, rsmd);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("\nChoose your department code");
            deptCode = sc.next();
            try {
                isDepartmentExist = SelectQueries.isDepartmentCodeExist(collegeCode, deptCode);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            if (!isDepartmentExist)
                System.out.println("\nYou entered wrong department code!!!!\n");
        }

        return deptCode;
    }

}
