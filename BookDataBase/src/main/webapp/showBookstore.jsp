<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            <th>Title</th>
            <th>Author</th>
            <th>Publishing Year</th>
            <th>Genre</th>
        </tr>
        <c:forEach items="${requestScope.allBookstore}" var="currentBookstore">
            <tr>
                <td>${currentBookstore.title}</td>
                <td>${currentBookstore.author}</td>
                <td>${currentBookstore.publishedYear}</td>
                <td>${currentBookstore.genre}</td>
            </tr>
        </c:forEach>
    </table>
    <br />
    <a href="index.jsp">Home</a>
</body>
</html>
