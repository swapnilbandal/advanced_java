package com.app.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Admin;
import com.app.model.Student;

public class AdminDAO {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found At AdminDAO!");
		con=DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group046","group046","welcome");
		System.out.println("Connection Established...");
		return con;
	}
	public static int save(Admin a) throws ClassNotFoundException, SQLException {
		int i=0;
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("insert into libraryadmin(Name,Email,Designation,MobileNumber,Password) values (?,?,?,?,?)");
			ps.setString(1, a.getName());
			ps.setString(2, a.getEmail());
			ps.setString(3, a.getDesignation());
			ps.setString(4, a.getPhoneNo());
			ps.setString(5, a.getPassword());
			System.out.println(a.getEmail());
			System.out.println(a.getName());
			System.out.println(a.getPassword());
			System.out.println(a.getPhoneNo());
			i=ps.executeUpdate();
			System.out.println(i);
		return i;
	}
	
	public static boolean validateAdmin(Admin a) throws SQLException, ClassNotFoundException {
		Connection con=getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from libraryadmin where   email=? and password=?");
		pstmt.setString(1, a.getEmail());
		pstmt.setString(2, a.getPassword());
		System.out.println("emailis:"+a.getEmail());
		System.out.println("password Admin id:"+a.getPassword());
		ResultSet rs = pstmt.executeQuery();
		boolean b=rs.next();
		return b;
	}
	
	public static ResultSet show() throws ClassNotFoundException, SQLException {
		Connection con=getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from librarybooks");
		ResultSet rs = pstmt.executeQuery();
		
		return rs;
	}
}
