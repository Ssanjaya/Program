package com.applyForCounselling;

import java.text.SimpleDateFormat;
import java.util.*;

import com.database.InsertQueries;
import com.mysql.cj.xdevapi.Schema.Validation;
import com.validation.Validations;

public class ApplyForCounselling extends Validation {
protected static long registerNumber;
protected static String firstName;
protected static String lastName;
protected static String fatherName;
protected static int age;
protected static long dateOfBirth;
protected static String gender;
protected static long prinmaryPhoneNumber;
protected static long secondaryPhoneNumber;
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

public void applyingForCounselling(Scanner sc , String userId )throws  Exception{
	System.out.println("\nWelcome To Online Counselling");
	System.out.println("\nEnter the details to apply for counselling");
	System.out.println("School register number");
	registerNumber = sc.nextLong();
	System.out.println("first Name");
	firstName = sc.next();
	System.out.println("Last Nme");
	lastName = sc.next();
	System.out.println("Father Name");
	fatherName = sc.next();
	System.out.println("Age");
	age = sc.nextInt();
	System.out.println("Date Of Birth in (yyyy-mm-dd) format");
    dateOfBirth = (new SimpleDateFormat("yyyy-MM-dd").parse(sc.next())).getTime();
    System.out.println("Gender");
    gender = sc.next();
//    System.out.println("Primary Mobile Number");
//    System.out.println("Date Of Birth in (yyyy-mm-dd) format");
//    dateOfBirth = (new SimpleDateFormat("yyyy-MM-dd").parse(sc.next())).getTime();
//    System.out.println("Gender");
//    gender = sc.next();
    System.out.println("Primary Mobile Number");
    prinmaryPhoneNumber = sc.nextLong();
    System.out.println("Secondary Mobile Number");
    secondaryPhoneNumber = sc.nextLong();
    System.out.println("Address");
    address = sc.next();
    System.out.println("Pin Code");
    pinCode = sc.nextInt();
    System.out.println("City");
    city = sc.next();
    System.out.println("State");
    state = sc.next();
    System.out.println("Religion");
    religion = sc.next();
    System.out.println("Nationality");
    nationality = sc.next();


    boolean checkMarks = false;
    while ( ! checkMarks )
    {
        System.out.println("School Name");
        schoolName = sc.next();
        System.out.println("Mathematics Marks (70 to 200)");
        maths = sc.nextInt();
        System.out.println("Chemistry Marks (70 to200)");
        chemistry = sc.nextInt();
        System.out.println("Physics Marks (70 to200)");
        physics = sc.nextInt();
        checkMarks = ( (maths >= 70 && maths <=200) && (chemistry >= 70 && chemistry <=200) && (physics >= 70 && physics <=200) );
    }

    cutOffMarks = Validations.calculateCutOff(maths, chemistry, physics);

    int row1 = InsertQueries.insertStudentPersonal(firstName, lastName, fatherName, age, dateOfBirth, gender, prinmaryPhoneNumber, secondaryPhoneNumber, address, pinCode, city, state, religion, nationality, registerNumber, userId);
    int row2 = InsertQueries.insertStudentAcademic(cutOffMarks, schoolName, maths, chemistry, physics, registerNumber, userId);

    System.out.println((row1+row2) / 2 + " Row inserted.....\nSuccessfully Applied for Counselling\n");
    System.out.println("Your User Id is  " + userId);
    System.out.println(Validations.displayInfo(cutOffMarks));
}

}


