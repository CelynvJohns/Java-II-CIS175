package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.BookstoreHelper;
import model.Bookstore;

/**
 * Servlet implementation class UpdateBookstore
 */
@WebServlet("/updateBookstore")
public class UpdateBookstore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateBookstore() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookstoreHelper helper = new BookstoreHelper();

		String oldTitle = request.getParameter("oldTitle");
		String title = request.getParameter("newTitle");
		String author = request.getParameter("author");
		int publishedYear =(Integer.parseInt(request.getParameter("publishedYear")));
		String genre = request.getParameter("genre");
		Bookstore BookstoreToUpdate = helper.searchBookstoreByTitle(oldTitle);
		BookstoreToUpdate.setTitle(title);
		BookstoreToUpdate.setAuthor(author);
		BookstoreToUpdate.setPublishedYear(publishedYear);
		BookstoreToUpdate.setGenre(genre);
		BookstoreToUpdate.setAuthor(author);

		helper.update(BookstoreToUpdate);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
