<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Compare the two lengths!</title>
</head>
<body>
	<nav>
		<a href="index.jsp"> Calculate an Age</a>
		<a href="get_name.jsp"> Compare Two Name Lengths</a>
	</nav>
    <p>The longer name is: ${userIs.getLongerName()}</p>
    <a href="get_name.jsp">Compare another two lengths</a>
</body>
</html>
