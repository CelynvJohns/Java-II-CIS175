<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Pet Description</title>
</head>
<body>
	<form action="addPetDescription" method="post">
		Breed Name:<input
			type="text" name="petBreed" size="25"/> 
		
		Name: <input
			type="text" name="name" size="25"/> 
		
		Age: <input
			type="number" name="age" size="25"/> 
		Pattern: <input
			type="text" name="pattern" size="25"/> 
		Temperament: <input
			type="text" name="temperament" size="25"/>
		Size in inches: <input
			type="number" name="size" size="25"/>
		
		<input type="submit"value="Submit" />
	</form>
</body>
</html>