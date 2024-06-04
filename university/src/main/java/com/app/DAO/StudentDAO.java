package com.app.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Student;

public class StudentDAO {
 public static Connection getConnection() throws ClassNotFoundException, SQLException {
	 Connection con=null;
	 System.out.println("Driver Not Found");
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Driver Found");
	 con=DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group046","group046","welcome");
	 System.out.println("Connection Established!!!");
	 return con;
 }
 public static int save(Student s) throws ClassNotFoundException, SQLException {
	 Connection con=null;
	 
	 
	 return 0;
 }
 public static ResultSet result(Student s) throws ClassNotFoundException, SQLException {
	 Connection con=getConnection();
	 PreparedStatement ps=con.prepareStatement("select * from student1 where prn=?");
	 ps.setString(1,s.getPrn());
	 ResultSet rs=ps.executeQuery();
	 return rs;
	 
 }
}
