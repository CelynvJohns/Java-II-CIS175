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
 * Servlet implementation class AddPetDescription
 */
@WebServlet("/addPetDescription")
public class AddPetDescription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPetDescription() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PetDescription pd = new PetDescription();
		PetDescriptionHelper helper = new PetDescriptionHelper();
		
		String petBreed = request.getParameter("petBreed");
		System.out.println("Pet Breed: " + petBreed);

		
		pd.setName(request.getParameter("name"));
		pd.setAge(Integer.parseInt(request.getParameter("age")));
		pd.setPattern(request.getParameter("pattern"));
		pd.setTemperament(request.getParameter("temperament"));
		pd.setSize(Integer.parseInt(request.getParameter("size")));
		pd.getPet().setBreed(request.getParameter("petBreed"));
		helper.add(pd);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
