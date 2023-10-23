package PetController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pet;
import helpers.PetHelper;

/**
 * Servlet implementation class DeletePet
 */
@WebServlet("/deletePet")
public class DeletePet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PetHelper helper = new PetHelper();
		String breed = request.getParameter("breed");
		Pet deleteThis = helper.searchPetByBreed(breed);
		helper.delete(deleteThis);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	
	}

}
