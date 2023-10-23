<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Bookstore</title>
</head>
<body>
    <form action="updateBookstore" method="post">
        <label for="newTitle">New Title:</label>
        <input type="text" id="newTitle" name="newTitle" size="25"><br>

        <label for="author">New Author:</label>
        <input type="text" id="author" name="author" size="25"><br>

        <label for="publishedYear">New Year the Book was Published:</label>
        <input type="number" id="publishedYear" name="publishedYear" min="1000" max="9999"><br>

        <label for="genre">New Genre:</label>
        <input type="text" id="genre" name="genre" size="25"><br>

        <label for="oldTitle">Enter the current Title:</label>
        <input type="text" id="oldTitle" name="oldTitle" size="25"><br>

        <input type="submit" value="Update">
    </form>
</body>
</html>
