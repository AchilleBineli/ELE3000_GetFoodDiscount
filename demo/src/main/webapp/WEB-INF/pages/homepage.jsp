<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
            "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="contentType" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		if (session.getAttribute("username") == null) {
			response.sendRedirect("home");
		}
	%>
	<h1>Welcome ${username}</h1>
</body>
</html>