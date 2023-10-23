package PetController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.PetHelper;
import model.Pet;

/**
 * Servlet implementation class UpdatePet
 */
@WebServlet("/updatePet")
public class UpdatePet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PetHelper helper = new PetHelper();

        String oldBreed = request.getParameter("oldBreed");
        String breed = request.getParameter("newBreed");
        String type = request.getParameter("type");
        Pet PetToUpdate = helper.searchPetByBreed(oldBreed);
        PetToUpdate.setType(type);
        PetToUpdate.setBreed(breed);
        
        helper.update(PetToUpdate);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
