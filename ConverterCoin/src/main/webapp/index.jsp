<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Welcome to Java EE World</title>
</head>
<body>
	<h1>Hello! This is a JSP page!</h1>
	<h1>Coin Converter</h1>
	<form action="getCentsServlet" method="post">
		Enter the number of cents you have in a whole number: <input
			type="text" name="userCents" size="10"> <input type="submit"
			value="Calculate Coins">
	</form>
</body>
</html>