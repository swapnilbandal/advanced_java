<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
<body>
<h2>CRM- Customer Relationship Manager</h2>
<h3>Save Customer </h3>
<form:form action="saveCustomer" modelAttribute="customer" method="post">
<table>
<tbody>
<tr>
<td><label> First Name: </label></td>
<td><form:input path="firstName"/></td>
</tr>
<tr>
<td><label> Last Name: </label></td>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<td><label> Email: </label></td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td><label></label></td>
<td><input type="submit" value="Save" class="Save"/></td>
</tr>
</tbody>
</table>
</form:form>
<p>
<a href="${page.Context.request.contextPath}/customer/list">Back to list</a>
</p>
</body>
</html>