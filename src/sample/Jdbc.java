package sample;

import java.sql.*;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/student";
		String name="root";
		String password= "Manoj@somu1723";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection(url,name ,password);	
				Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("SELECT * FROM student_details;");
				while(rs.next()) { 
				String str = rs.getInt(1)+"  :  "+rs.getString(2);
				System.out.println(str);}
				st.close();
				cn.close();
	
	}
	}