package com.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQueries {

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

    static final String UPDATESTUDENTPERSONAL = " update student_personal_details set first_name = ?, last_name = ?, father_name = ?,age = ?, date_of_birth = ?, gender = ?, primary_mobile_no = ?, secondary_mobile_no = ?, current_address = ?, current_pincode = ?, current_city = ?, current_state = ?, religion = ?, nationality = ? where user_id = ?";

    static final String UPDATESTUDENTACADEMIC = " update student_academic_details set cut_off_marks = ?, school_name = ?, mathematics_marks = ?, chemistry_marks = ?, physics_marks = ? where user_id = ?";

    static final String UPDATECOLLEGCODEDEPTCODE = "update student_academic_details set college_code = ?, dept_code = ? where user_id = ?";

    static final String UPDATEDEPARTMENTSEATS = "update department_details set seats_per_department = seats_per_department - 1 where college_code = ? and dept_code = ?";

    static final String UPDATECOLLEGESEATS =  "update college_details set total_seats = (select sum(seats_per_department) from department_details where college_code = ?) where college_code = ?";

    public static int updateStudentPersonal(String firstName, String lastName, String fatherName, int age, Long dateOfBirth, String gender, long primaryMobileNo, long secondaryMobileNo, String address, int pinCode, String city, String state, String religion, String nationality, String userId) throws SQLException
    {

        preparedStatement = connection.prepareStatement(UPDATESTUDENTPERSONAL);

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
        preparedStatement.setString(15, userId);

        return preparedStatement.executeUpdate();

    }

    public static int updateStudentAcademic(float cutOff, String schoolName, int maths, int chemistry, int physics, String userId) throws SQLException
    {

        preparedStatement = connection.prepareStatement(UPDATESTUDENTACADEMIC);

        preparedStatement.setFloat(1, cutOff);
        preparedStatement.setString(2, schoolName);
        preparedStatement.setInt(3, maths);
        preparedStatement.setInt(4, chemistry);
        preparedStatement.setInt(5, physics);
        preparedStatement.setString(6, userId);

        return preparedStatement.executeUpdate();
    }

    public static synchronized int updateCollegeCodeAndDeptCode(int college_code, String dept_code, String userId) throws SQLException
    {

        preparedStatement = connection.prepareStatement(UPDATECOLLEGCODEDEPTCODE);

        preparedStatement.setInt(1, college_code);
        preparedStatement.setString(2, dept_code);
        preparedStatement.setString(3, userId);

        return preparedStatement.executeUpdate();
    }

    public static synchronized int updateDepartmentSeats(int college_code, String dept_code) throws SQLException
    {

        preparedStatement = connection.prepareStatement(UPDATEDEPARTMENTSEATS);

        preparedStatement.setInt(1, college_code);
        preparedStatement.setString(2, dept_code);

        return preparedStatement.executeUpdate();

    }
    public static synchronized int updateCollegeSeats(int college_code) throws SQLException
    {

        preparedStatement = connection.prepareStatement(UPDATECOLLEGESEATS);

        preparedStatement.setInt(1, college_code);
        preparedStatement.setInt(2, college_code);

        return preparedStatement.executeUpdate();

    }
}
