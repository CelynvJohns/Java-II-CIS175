<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pet Description</title>
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
    <h1>List of all Pet Descriptions</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Pattern</th>
            <th>Temperament</th>
            <th>Size</th>
            <th>Breed</th>
        </tr>
        <c:forEach items="${requestScope.allPetDescription}" var="currentPetDescription">
            <tr>
                <td>${currentPetDescription.name}</td>
                <td>${currentPetDescription.age}</td>
                <td>${currentPetDescription.pattern}</td>
                <td>${currentPetDescription.temperament}</td>
                <td>${currentPetDescription.size}</td>
                <td>${currentPetDescription.pet.breed}</td>
            </tr>
        </c:forEach>
    </table>
    <br />
    <a href="index.jsp">Home</a>
</body>
</html>
