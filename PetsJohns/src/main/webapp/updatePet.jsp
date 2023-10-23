<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Pet</title>
</head>
<body>
    <form action="updatePet" method="post">
        New Breed: <input type="text" name="newBreed" size="25" /><br>
        New Type: <input type="text" name="type" size="25" /><br>
        Enter the current Pet Breed: <input type="text" name="oldBreed" size="25" /><br>
        <input type="submit" value="Update" />
    </form>
</body>
</html>
