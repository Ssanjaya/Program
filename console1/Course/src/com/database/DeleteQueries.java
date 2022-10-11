package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQueries
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

    static final String DELETESTUDENTPERSONAL = "delete from student_personal_details where user_id = ?";
    static final String DELETESTUDENTACDAMIC = "delete from student_academic_details where user_id = ?";

    public static int deleteStudentAcademicDetails(String userId) throws SQLException
    {
        preparedStatement = connection.prepareStatement(DELETESTUDENTACDAMIC);

        preparedStatement.setString(1, userId);

        return preparedStatement.executeUpdate();
    }

    public static int deleteStudentPersonalDetails(String userId) throws SQLException
    {
        preparedStatement = connection.prepareStatement(DELETESTUDENTPERSONAL);

        preparedStatement.setString(1, userId);

        return preparedStatement.executeUpdate();
    }
}
