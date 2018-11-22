<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	List of Users
	<br>
	<table border="1">
	<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.username}</td>
			<td>${user.firstName}</td>
			<td>${user.lastName}</td>
			<td>${user.password}</td>
			<td>${user.email}</td>
			
		</tr>
		<br>
	</c:forEach>
	</table>
 
</body>
</html>