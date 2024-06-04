<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*, java.sql.*, com.app.DAO.BookDAO, com.app.model.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Book</title>
<link rel="stylesheet" type="text/css"
	href="resources/css/adminHome.css">
<script>
function displayPopup() {
    alert("Book borrowed successfully!");
}
</script>
</head>
<body>
	<h1>Search Results</h1>
	 	
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
    String name = request.getParameter("name");
    ResultSet rs = null;
    try {
        rs = BookDAO.searchBook(name);
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
			<td><a href="#" onclick="displayPopup()">Borrow</a></td>
			<td><a href="returnBook.jsp?id=<%= id %>">Return</a></td>
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
