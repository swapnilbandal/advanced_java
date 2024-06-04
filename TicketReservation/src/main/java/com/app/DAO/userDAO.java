package com.app.DAO;
import com.app.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userDAO {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found!");
		con=DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group046","group046","welcome");
		System.out.println("Connection Established...");
		return con;
	}
	public static int saveUser(User u) throws ClassNotFoundException, SQLException {
		int i=0;
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("insert into user(Name,Email,MobileNumber,Password) values (?,?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPhoneNo());
			ps.setString(4, u.getPassword());
			i=ps.executeUpdate();
		return i;
	}
	
	public static boolean validateUser(User u) throws SQLException, ClassNotFoundException {
		Connection con=getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from libraryuser where   email=? and password=?");
		pstmt.setString(1, u.getEmail());
		pstmt.setString(2, u.getPassword());
		ResultSet rs = pstmt.executeQuery();
		boolean b=rs.next();
		return b;
	}
}
