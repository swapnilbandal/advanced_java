<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
<h2>CRM- Customer Relationship Manager </h2>
<input type="button" value="Add Customer" onClick="window.location.href='showFormForAdd'; return false;" />
<table>
<tr><th>First Name</th><th>Last Name</th><th>Email</th></tr>
<c:forEach var="tempCustomer" items="${customers}" >
<c:url var="updateLink" value="/customer/showFormForUpdate" >
<c:param name="customerId" value="${tempCustomer.id }" />
</c:url>
<c:url var="deleteLink" value="/customer/showFormForUpdate" >
<c:param name="customerId" value="${tempCustomer.id }" />
</c:url>
<tr><td>${tempCustomer.firstName }</td><td>${tempCustomer.lastName }</td><td>${tempCustomer.email }</td>
<td><a href="${updateLink}">Update</a></td><td><a href="${deleteLink}">Delete</a></td></tr>

</c:forEach>
</table>
</body>
</html>