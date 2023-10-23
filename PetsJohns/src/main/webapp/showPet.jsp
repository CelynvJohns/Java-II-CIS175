<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pets</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ccc;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        ul {
            list-style: none;
            padding-left: 0;
        }
        li {
            margin-bottom: 5px;
        }
    </style>
</head>
<body>
    <h1>List of all Pets and Pet Descriptions</h1>
    <table>
        <tr>
            <th>Type</th>
            <th>Breed</th>
            <th>Descriptions</th>
        </tr>
        <c:forEach items="${requestScope.allPet}" var="currentPet">
            <tr>
                <td>${currentPet.type}</td>
                <td>${currentPet.breed}</td>
                <td>
                    <ul>
                        <c:forEach items="${currentPet.petDescription}" var="currentPetDescription">
                            <li>
                                ${currentPetDescription.name} - 
                                Age: ${currentPetDescription.age} - 
                                Pattern: ${currentPetDescription.pattern} - 
                                Temperament: ${currentPetDescription.temperament} - 
                                Size: ${currentPetDescription.size}
                            </li>
                        </c:forEach>
                    </ul>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br />
    <a href="index.jsp">Home</a>
</body>
</html>
