<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.*, java.sql.*, com.app.DAO.BookDAO, com.app.model.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
<link rel="stylesheet" type="text/css"
	href="resources/css/adminHome.css">

</head>
<body>
	<form action="searchBook.jsp" method="Get">
		<input type="text" name="name"
			placeholder="Enter book title or author"> <input
			type="submit" value="Search">
	</form>
	<form action="addBook.jsp" method="post">
		<input type="text" name="name"
			placeholder="Enter book title or author"> <input
			type="submit" value="Add">
	</form>
	<h1>Book List</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Genre</th>
			<th>Count</th>

		</tr>
		<% 
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