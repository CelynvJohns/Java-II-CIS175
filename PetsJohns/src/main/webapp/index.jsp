<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pet</title>
</head>
<body>
	<h1>Pet</h1>
	<form action="showPetDescription" method="get">
		<input type="submit" value="Show Pet Description" />
	</form>
	<a href="updatePetDescription.jsp">Update Pet Description</a>
	<a href="deletePetDescription.jsp">Delete Pet Description</a>
	<a href="addPetDescription.jsp">Add Pet Description</a>
	<form action="showPet" method="get">
		<input type="submit" value="Show Pet" />
	</form>
	<a href="updatePet.jsp">Update Pet</a>
	<a href="deletePet.jsp">Delete Pet</a>
	<a href="addPet.jsp">Add Pet</a>
</body>
</html>
