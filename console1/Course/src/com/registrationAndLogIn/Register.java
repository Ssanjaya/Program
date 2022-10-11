package com.registrationAndLogIn;

import java.util.Scanner;
import com.database.InsertQueries;


public class Register
{
    public void addData(Scanner scanner) throws Exception
    {

        String name, email, password, confirmPassword;
        long phoneNo;
        System.out.println("Enter the details for registration");
        System.out.println("Name");
        name = scanner.next();
        System.out.println("Phone Number");
        phoneNo = scanner.nextLong();
        System.out.println("User Id");
        email = scanner.next();
        System.out.println("Password");
        password = scanner.next();
        System.out.println("Confirm Password");
        confirmPassword = scanner.next();

        while (!password.equals(confirmPassword))
        {
            System.out.println("Please enter same password for password and confirm password");
            System.out.println("Password");
            password = scanner.next();
            System.out.println("Confirm Password");
            confirmPassword = scanner.next();
        }

        int row = InsertQueries.insertRegistration(name, phoneNo, email, password, confirmPassword);

        System.out.println(row + " Row inserted.....\nSuccessfully registered :)\n");
    }
}
