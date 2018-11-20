<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<c:forEach var="employee" items="${employees}">
		<tr>
			<td>${employee.id}</td>
			<td>${employee.name}</td>
			<td>${employee.address}</td>
			
		</tr>
		<br>
	</c:forEach>
	</table>

</body>
</html>