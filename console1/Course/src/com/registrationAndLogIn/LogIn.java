package com.registrationAndLogIn;

import java.sql.*;
import java.util.Scanner;

import com.database.SelectQueries;

public class LogIn
{
    public String loginUser(Scanner scanner) throws Exception
    {
        String userId;
        String password;

        System.out.println("Enter Details to Login");
        System.out.println("User Id");
        userId = scanner.next();
        System.out.println("Password");
        password = scanner.next();

        ResultSet resultSet;
        resultSet = SelectQueries.selectEmailPasswordQuery(userId);

        String isPassword = null;
        if (resultSet.next())
        {
            isPassword  = (resultSet.getString("password")).trim();
        }

        if(isPassword == null)
        {
            System.out.println("Wrong User Name :(\nTry Again......");
            return null;
        }

        if(! (isPassword.equals(password)))
        {
            System.out.println("Wrong Password :(\nTry Again ......");
            return null;
        }

        System.out.println("Login Successful");

            return userId;
    }
}
