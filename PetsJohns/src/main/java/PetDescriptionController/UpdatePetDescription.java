package PetDescriptionController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PetDescription;
import helpers.PetDescriptionHelper;

/**
 * Servlet implementation class UpdatePetDescription
 */
@WebServlet("/updatePetDescription")
public class UpdatePetDescription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePetDescription() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PetDescriptionHelper helper = new PetDescriptionHelper();

		String oldName = request.getParameter("oldName");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String pattern = request.getParameter("pattern");
		String temperament = request.getParameter("temperament");
		int size  = Integer.parseInt(request.getParameter("size"));

		PetDescription petDescriptionToUpdate = helper.searchByPetDescriptionName(oldName);
		petDescriptionToUpdate.setName(name);
		petDescriptionToUpdate.setAge(age);
		petDescriptionToUpdate.setPattern(pattern);
		petDescriptionToUpdate.setTemperament(temperament);
		petDescriptionToUpdate.setSize(size);
		helper.update(petDescriptionToUpdate);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
