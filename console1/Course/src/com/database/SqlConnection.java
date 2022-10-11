package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection
{
    private static final String URL = "jdbc:mysql://localhost:3066/student";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Manoj@somu1723";
    protected static Connection connectionInstance() throws ClassNotFoundException, SQLException
    {

        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        return conn;
    }
}