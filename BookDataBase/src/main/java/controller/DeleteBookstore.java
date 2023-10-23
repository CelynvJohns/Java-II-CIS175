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
 * Servlet implementation class DeleteBookstore
 */
@WebServlet("/deleteBookstore")
public class DeleteBookstore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteBookstore() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookstoreHelper helper = new BookstoreHelper();
		String title = request.getParameter("title");
		Bookstore deleteThis = helper.searchBookstoreByTitle(title);
		helper.delete(deleteThis);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

	}

}
