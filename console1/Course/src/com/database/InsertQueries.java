package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class InsertQueries
{
    private static Connection connection;

    static {
        try {
            connection = SqlConnection.connectionInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static PreparedStatement preparedStatement;

    static final String REGISTRATION = "insert into registration (name, phone_no, email, password, confirmpassword) values (?,?,?,?,?)";
    static final String STUDENTPERSONAL = "insert into student_personal_details (first_name, last_name, father_name, age, date_of_birth, gender, primary_mobile_no, secondary_mobile_no, current_address, current_pincode, current_pincode, current_state, religion, nationality, student_id, user_id) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    static final String STUDENTACADEMIC = "insert into student_academic_details (cut_off_marks, school_name, mathematics_marks, chemistry_marks, physics_marks, student_id, user_id) values (?,?,?,?,?,?,?)";
    public static int insertRegistration(String name, long phoneNo, String email, String password, String confirmPassword) throws Exception
    {
        preparedStatement = connection.prepareStatement(REGISTRATION);

        preparedStatement.setString(1, name);
        preparedStatement.setLong(2, phoneNo);
        preparedStatement.setString(3, email);
        preparedStatement.setString(4, password);
        preparedStatement.setString(5, confirmPassword);

        return preparedStatement.executeUpdate();
    }
    public static int insertStudentPersonal(String firstName, String lastName, String fatherName, int age, Long dateOfBirth, String gender, long primaryMobileNo, long secondaryMobileNo, String address, int pinCode, String city, String state, String religion, String nationality, long studentId, String userId) throws SQLException
    {

        preparedStatement = connection.prepareStatement(STUDENTPERSONAL);

        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setString(3, fatherName);
        preparedStatement.setInt(4, age);
        preparedStatement.setDate(5, new Date(dateOfBirth));
        preparedStatement.setString(6, gender);
        preparedStatement.setLong(7, primaryMobileNo);
        preparedStatement.setLong(8, secondaryMobileNo);
        preparedStatement.setString(9, address);
        preparedStatement.setInt(10, pinCode);
        preparedStatement.setString(11, city);
        preparedStatement.setString(12, state);
        preparedStatement.setString(13, religion);
        preparedStatement.setString(14, nationality);
        preparedStatement.setLong(15, studentId);
        preparedStatement.setString(16, userId);

        return preparedStatement.executeUpdate();

    }

    public static int insertStudentAcademic(float cutOff, String schoolName, int maths, int chemistry, int physics, long studentId, String userId) throws SQLException
    {

        preparedStatement = connection.prepareStatement(STUDENTACADEMIC);

        preparedStatement.setFloat(1, cutOff);
        preparedStatement.setString(2, schoolName);
        preparedStatement.setInt(3, maths);
        preparedStatement.setInt(4, chemistry);
        preparedStatement.setInt(5, physics);
        preparedStatement.setLong(6, studentId);
        preparedStatement.setString(7, userId);

        return preparedStatement.executeUpdate();
    }
}
