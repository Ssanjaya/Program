package com.applyForCounselling;
import com.database.InsertQueries;
import com.validation.Validations;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ApplyForCounselling extends Validations{

    protected static long registerNumber;
    protected static String firstName;
    protected static String lastName;
    protected static String fatherName;
    protected static int age;
    protected static Long dateOfBirth;
    protected static String gender;
    protected static long primaryMobileNo;
    protected static long secondaryMobileNo;
    protected static String address;
    protected static int pinCode;
    protected static String city;
    protected static String state;
    protected static String religion;
    protected static String nationality;

    protected static float cutOffMarks;
    protected static String schoolName;
    protected static int maths;
    protected static int chemistry;
    protected static int physics;

    public void applyForCounselling(Scanner scanner, String userId) throws Exception
    {

        System.out.println("\nWelcome to Online Counselling");
        System.out.println("\nEnter the details to Apply for counselling ");
        System.out.println("School Register Number");
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

        int row1 = InsertQueries.insertStudentPersonal(firstName, lastName, fatherName, age, dateOfBirth, gender, primaryMobileNo, secondaryMobileNo, address, pinCode, city, state, religion, nationality, registerNumber, userId);
        int row2 = InsertQueries.insertStudentAcademic(cutOffMarks, schoolName, maths, chemistry, physics, registerNumber, userId);

        System.out.println((row1+row2) / 2 + " Row inserted.....\nSuccessfully Applied for Counselling\n");
        System.out.println("Your User Id is  " + userId);
        System.out.println(Validations.displayInfo(cutOffMarks));
    }

}
