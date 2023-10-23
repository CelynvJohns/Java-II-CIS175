<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bookstore</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #B9CDDA;
        }
        h1 {
            background-color: #D7DAE5;
            color: white;
            padding: 20px;
        }
        .menu {
            display: flex;
            justify-content: center;
            gap: 20px;
            margin-top: 20px;
        }
        .menu a {
            text-decoration: none;
            background-color: #D7DAE5;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
        }
        .menu a:hover {
            background-color: #207ac9;
        }
        .full-width-link {
            width: 100%;
            display: block;
            text-decoration: none;
            background-color: #3498db;
            color: #fff;
            padding: 10px;
        }
        .full-width-link:hover {
            background-color: #207ac9;
        }
    </style>
</head>
<body>
    <h1>Bookstore</h1>
    <a class="full-width-link" href="showBookstore">Show Bookstore</a>
    <div class="menu">
        <a href="updateBookstore.jsp">Update Book</a>
        <a href="deleteBookstore.jsp">Delete Book</a>
        <a href="addBookstore.jsp">Add Book</a>
    </div>
</body>
</html>
