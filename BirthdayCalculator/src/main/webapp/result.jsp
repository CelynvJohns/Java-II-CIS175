<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Age!</title>
</head>
<body>
	<nav>
		<a href="index.jsp"> Calculate an Age</a>
		<a href="get_name.jsp"> Compare Two Name Lengths</a>
	</nav>
	<p>Your age is: ${userIs.calculateAge()}</p>
	<a href="index.jsp">Calculate another Age</a>
<body>
</html>
