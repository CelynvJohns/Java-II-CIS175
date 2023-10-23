package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.BookstoreHelper;  // Correct import statement
import model.Bookstore;

@WebServlet("/addBookstore")
public class AddBookstore extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddBookstore() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Bookstore b = new Bookstore();
        BookstoreHelper helper = new BookstoreHelper();
        b.setTitle(request.getParameter("title"));
        b.setAuthor(request.getParameter("author"));
        b.setPublishedYear(Integer.parseInt(request.getParameter("publishedYear")));
        b.setGenre(request.getParameter("genre"));  
        helper.add(b);  // Use the BookstoreHelper to add the object to the database
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
