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
 * Servlet implementation class AddPet
 */
@WebServlet("/addPet")
public class AddPet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pet p = new Pet();
		PetHelper helper = new PetHelper();
		p.setType(request.getParameter("type"));
		p.setBreed(request.getParameter("breed"));
		helper.add(p);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
	
}
