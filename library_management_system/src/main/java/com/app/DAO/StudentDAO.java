
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
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found at Student DAO!");
		con=DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group046","group046","welcome");
		System.out.println("Connection Established...");
		return con;
	}
	public static int save(Student e) throws ClassNotFoundException, SQLException {
		int i=0;
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("insert into libraryuser(Name,Email,PRN,MobileNumber,Password) values (?,?,?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getEmail());
			ps.setString(3, e.getPrn());
			ps.setString(4, e.getPhoneNo());
			ps.setString(5, e.getPassword());
			System.out.println(e.getEmail());
			System.out.println(e.getName());
			System.out.println(e.getPassword());
			System.out.println(e.getPhoneNo());
			i=ps.executeUpdate();
			System.out.println(i);
		return i;
	}
	
	public static boolean validateStud(Student s) throws SQLException, ClassNotFoundException {
		Connection con=getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from libraryuser where   email=? and password=?");
		pstmt.setString(1, s.getEmail());
		pstmt.setString(2, s.getPassword());
		System.out.println("Student email is:"+s.getEmail());
		System.out.println("Student password is:"+s.getPassword());
		ResultSet rs = pstmt.executeQuery();
		boolean b=rs.next();
		return b;
	}
}
