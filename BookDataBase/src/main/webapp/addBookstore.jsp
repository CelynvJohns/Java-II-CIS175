<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Bookstore</title>
</head>
<body>
    <form action="addBookstore" method="post">
        Book Title: <input type="text" name="title" size="25" /><br>
        Book Author: <input type="text" name="author" size="25" /><br>
        Year Book was Published: <input type="number" name="publishedYear" min="1000" max="9999" /><br>
        Book Genre: <input type="text" name="genre" size="25" /><br>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>