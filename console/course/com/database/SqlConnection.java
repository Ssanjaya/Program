package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SqlConnection {
	   private static final String URL = "jdbc:postgresql://localhost:5432/Online_Counselling";
	    private static final String USERNAME = "postgres";
	    private static final String PASSWORD = "password";
	    protected static Connection connectionInstance() throws ClassNotFoundException, SQLException
	    {

	        Class.forName("org.postgresql.Driver");
	        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

	        return conn;
	    }
}
