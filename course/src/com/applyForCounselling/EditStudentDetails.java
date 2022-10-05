package com.applyForCounselling;
import com.database.UpdateQueries;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class EditStudentDetails extends ApplyForCounselling {

    public void updateStudentDetails(Scanner scanner, String userId) throws SQLException, ParseException
    {
        System.out.println("\nEnter the details to Update");
        System.out.println("School com.registrationAndLogInPackage.Register Number");
        registerNumber = scanner.nextLong();
        System.out.println("First Name");
        firstName = scanner.next();
        System.out.println("Last Name");
        lastName = scanner.next();
        System.out.println("Father Name");
        fatherName = scanner.next();
        System.out.println("Age");
        age = scanner.nextInt();
        System.out.println("Date Of Birth in (yyyy-mm-dd) format");
        dateOfBirth = (new SimpleDateFormat("yyyy-MM-dd").parse(scanner.next())).getTime();
        System.out.println("Gender");
        gender = scanner.next();
        System.out.println("Primary Mobile Number");
        primaryMobileNo = scanner.nextLong();
        System.out.println("Secondary Mobile Number");
        secondaryMobileNo = scanner.nextLong();
        System.out.println("Address");
        address = scanner.next();
        System.out.println("Pin Code");
        pinCode = scanner.nextInt();
        System.out.println("City");
        city = scanner.next();
        System.out.println("State");
        state = scanner.next();
        System.out.println("Religion");
        religion = scanner.next();
        System.out.println("Nationality");
        nationality = scanner.next();


        boolean checkMarks = false;
        while ( ! checkMarks )
        {
            System.out.println("School Name");
            schoolName = scanner.next();
            System.out.println("Mathematics Marks (70 to 200)");
            maths = scanner.nextInt();
            System.out.println("Chemistry Marks (70 to200)");
            chemistry = scanner.nextInt();
            System.out.println("Physics Marks (70 to200)");
            physics = scanner.nextInt();
            checkMarks = ( (maths >= 70 && maths <=200) && (chemistry >= 70 && chemistry <=200) && (physics >= 70 && physics <=200) );
        }

        cutOffMarks = calculateCutOff(maths, chemistry, physics);

        int row1 = UpdateQueries.updateStudentPersonal(firstName, lastName, fatherName, age, dateOfBirth, gender, primaryMobileNo, secondaryMobileNo, address, pinCode, city, state, religion, nationality, userId);
        int row2 = UpdateQueries.updateStudentAcademic(cutOffMarks, schoolName, maths, chemistry, physics, userId);

        System.out.println((row1+row2) / 2 + " Row Updated Successfully.....\n");
        System.out.println("Your User Id is  " + userId);
        System.out.println(displayInfo(cutOffMarks));
    }

}
