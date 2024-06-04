package com.app.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Flight;
import com.app.model.User;

public class flightsDAO {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found!");
		con=DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group046","group046","welcome");
		System.out.println("Connection Established...");
		return con;
	}
	public static int addFlight(User u) throws ClassNotFoundException, SQLException {
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
	public static ResultSet displayFlights() throws ClassNotFoundException, SQLException {
		Connection con= getConnection();
		PreparedStatement ps=con.prepareStatement("select *from flights");
		ResultSet rs=ps.executeQuery();
		return rs;
	}
	public static ResultSet searchFlights(Flight f) throws ClassNotFoundException, SQLException {
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from flights where flightNumber like ? or departure like ? or destination like ? or Ddate like ? or Adate like ?");
		ps.setString(1, "%"+f.getNumber()+"%");
		ps.setString(2, "%"+f.getDeparture()+"%");
		ps.setString(3, "%"+f.getDestination()+"%");
		ps.setDate(4, f.getAdate());
		ps.setDate(5, f.getAdate());
		ResultSet rs= ps.executeQuery();
		return rs;
	}
}
