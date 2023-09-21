<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Name Length Calculator</title>
</head>
<body>
	<nav>
		<a href="index.jsp"> Calculate an Age</a>
		<a href="get_name.jsp"> Compare Two Name Lengths</a>
	</nav>
    <h1>Welcome to the Name Length Calculator!</h1>
    <form action="GetNameServlet" method="post">
        Enter the first name: <input
            type="text" name="nameOne" size="20">
            Enter the second name: <input
            type="text" name="nameTwo" size="20">
        <input type="submit" value="Calculate Length">
    </form>
</body>
</html>