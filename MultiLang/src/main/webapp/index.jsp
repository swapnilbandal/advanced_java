<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language Translate</title>
<c:set var="theLocale" value="${not empty param.theLocale? param.theLocale:pageContext.request.locale}"></c:set>
<fmt:setLocale value="${theLocale }"/>
<fmt:setBundle basename="com.app.MultiLang.i18n.resources.mylabels"/>
</head>
<body>
<a href="index.jsp?theLocale=en_US">English</a><br><br>
<a href="index.jsp?theLocale=hi_IN">Hindi</a><br><br>
<a href="index.jsp?theLocale=es_ES">Spanish</a><br><br>
<a href="index.jsp?theLocale=mr_IN">Marathi</a><br><br>
<hr><hr>
<fmt:message key="label.greeting"></fmt:message><br><br>
<fmt:message key="label.firstname"></fmt:message><br><br>
<fmt:message key="label.lastname"></fmt:message><br><br>
Selected Locale: ${thelocale }

</body>
</html>