package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.BookstoreHelper;
import model.Bookstore;

/**
 * Servlet implementation class ShowBookstore
 */
@WebServlet("/showBookstore")
public class ShowBookstore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowBookstore() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookstoreHelper helper = new BookstoreHelper();
		List<Bookstore> BookstoreList = helper.showAllBookstore();
		request.setAttribute("allBookstore", BookstoreList);
		String path = "/showBookstore.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookstoreHelper helper = new BookstoreHelper();
		List<Bookstore> BookstoreList = helper.showAllBookstore();
		request.setAttribute("allBookstore", BookstoreList);
		String path = "/showBookstore.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}
}