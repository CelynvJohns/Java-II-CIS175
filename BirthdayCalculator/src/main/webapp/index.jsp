<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Age Calculator</title>
</head>
<body>
	<nav>
		<a href="index.jsp"> Calculate an Age</a>
		<a href="get_name.jsp">Compare Two Name Lengths</a>
	</nav>
	<h1>Welcome to the Birthday Calculator!</h1>
    <form action="getAgeServlet" method="post">
        Enter the year you were born: <input
            type="text" name="userBirthYear" size="4"> <br>
        Enter your birth month as a number: <input
            type="text" name="userBirthMonth" size="2"><br>
        Enter the day you were born: <input
            type="text" name="userBirthDay" size="2"><br>
        <input type="submit" value="Calculate Age">
    </form>
</body>
</html>
