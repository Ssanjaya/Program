package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseConnection {
	Connection con;
	DataBaseConnection(){
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Manoj@somu1723");
			System.out.println("Connection Created ");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}