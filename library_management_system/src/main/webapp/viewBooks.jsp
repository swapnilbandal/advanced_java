<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.*, java.sql.*"
	import="com.app.DAO.BookDAO"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
<link rel="stylesheet" type="text/css"
	href="resources/css/adminHome.css">

</head>
<body>
	<form action="searchBook.jsp" method="POST">
		<input type="text" name="name"
			placeholder="Enter book title or author"> <input
			type="submit" value="Search Book">
	</form>
	<a href="viewBooks.jsp">View Books</a>

	<h1>Book List</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Genre</th>
			<th>Count</th>
			<th>Borrow</th>
			<th>Return</th>

		</tr>
		<% 
		String a=request.getParameter("id");
		int b=Integer.parseInt(a);
		boolean b1 =BookDAO.updateCount(b);
        ResultSet rs = null;
        try {
            rs = BookDAO.show();
            while(rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("bookname");
                String author = rs.getString("author");
                String genre = rs.getString("genre");
                int count = rs.getInt("count");
        %>
		<tr>
			<td><%= id %></td>
			<td><%= title %></td>
			<td><%= author %></td>
			<td><%= genre %></td>
			<td><%= count %></td>
			<td><a href="viewBooks.jsp?id=<%= id %>" ><button type="button" >Borrow</button></a></td>
			<td><a href="returnBooks.jsp?id=<%= id %>" ><button type="button" >Return</button></a></td>


		</tr>
		<% 
            }
        } catch(Exception e) {
            e.printStackTrace();
        } 
        
        %>
	</table>
</body>
</html>