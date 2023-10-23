<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Update Pet Description</title>
</head>
<body>
    <form action="updatePetDescription" method="post">
        New Name: <input type="text" name="name" size="25" /><br>
        New Age: <input type="number" name="age" size="25" /><br>
        New Pattern: <input type="text" name="pattern" size="25" /><br>
        New Temperament: <input type="text" name="temperament" size="25" /><br>
        New Size: <input type="number" name="size" size="25" /><br>
        Enter the current pet's Name from Pet Description: <input type="text" name="oldName" size="25" /><br>
        <input type="submit" value="Update" />
    </form>
</body>
</html>