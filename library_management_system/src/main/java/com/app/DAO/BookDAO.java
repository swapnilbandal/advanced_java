package com.app.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.app.model.Book;
public class BookDAO {

		public static Connection getConnection() throws ClassNotFoundException, SQLException {
			Connection con=null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found Successfully at BOokDAO!");
			con=DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group046","group046","welcome");
			System.out.println("Connection Established...");
			return con;
		}
		public static int save(Book b) throws ClassNotFoundException, SQLException {
			int i=0;
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into librarybooks(bookName,author,genre,count) values (?,?,?,?)");
				ps.setString(1, b.getBookName());
				ps.setString(2, b.getAuthor());
				ps.setString(3, b.getGenre());
				ps.setInt(4, b.getCount());
				
				i=ps.executeUpdate();
				System.out.println(i);
			return i;
		}
		
		public static boolean updateCount(int b) throws SQLException, ClassNotFoundException {
			System.out.println("into update count");
			Connection con=getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from librarybooks where id=?");
			pstmt.setInt(1, b);
			ResultSet rs = pstmt.executeQuery();
			int a=0;
			while(rs.next()) {
				a=rs.getInt(5);
			}
			System.out.println(a);
			a--;
			PreparedStatement ps = con.prepareStatement("UPDATE librarybooks SET count=? WHERE id=?");
			ps.setInt(1,a);
			ps.setInt(2, b);
			boolean b1=ps.execute();
			System.out.println("updatwd"+b1);
			
			return b1;
		}
		
		public static boolean updateCount1(int b) throws SQLException, ClassNotFoundException {
			System.out.println("into update count");
			Connection con=getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from librarybooks where id=?");
			pstmt.setInt(1, b);
			ResultSet rs = pstmt.executeQuery();
			int a=0;
			while(rs.next()) {
				a=rs.getInt(5);
			}
			System.out.println(a);
			a++;
			PreparedStatement ps = con.prepareStatement("UPDATE librarybooks SET count=? WHERE id=?");
			ps.setInt(1,a);
			ps.setInt(2, b);
			boolean b1=ps.execute();
			System.out.println("updatwd"+b1);
			
			return b1;
		}
		
		
		public static ResultSet searchBook(String b) throws ClassNotFoundException, SQLException {
			Connection con=getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from librarybooks where bookname like ? or author like ? or genre like ?");
			pstmt.setString(1, "%"+b+"%");
			pstmt.setString(2, "%"+b+"%");
			pstmt.setString(3, "%"+b+"%");
			ResultSet rs = pstmt.executeQuery();
			System.out.println("hii");
			return rs;
		}
		
		public static ResultSet show() throws ClassNotFoundException, SQLException {
			Connection con=getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from librarybooks");
			ResultSet rs = pstmt.executeQuery();
			
			return rs;
		}
	}


