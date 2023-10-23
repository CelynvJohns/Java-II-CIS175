package PetDescriptionController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.PetDescriptionHelper;
import model.PetDescription;

/**
 * Servlet implementation class DeletePetDescription
 */
@WebServlet("/deletePetDescription")
public class DeletePetDescription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePetDescription() {
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PetDescriptionHelper helper = new PetDescriptionHelper();
		String PetName = request.getParameter("name");
		PetDescription deleteThis = helper.searchByPetDescriptionName(PetName);
		helper.delete(deleteThis);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	
	
	}

}
