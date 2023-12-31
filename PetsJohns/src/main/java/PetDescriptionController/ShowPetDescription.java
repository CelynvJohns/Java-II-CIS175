package PetDescriptionController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.PetDescriptionHelper;
import model.PetDescription;
/**
 * Servlet implementation class ShowPetDescription
 */
@WebServlet("/showPetDescription")
public class ShowPetDescription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPetDescription() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PetDescriptionHelper helper = new PetDescriptionHelper();
        List<PetDescription> PetDescriptionList = helper.showAllPetDescription();
        request.setAttribute("allPetDescription", PetDescriptionList);
        String path = "/showPetDescription.jsp";
        getServletContext().getRequestDispatcher(path).forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PetDescriptionHelper helper = new PetDescriptionHelper();
		List<PetDescription> PetDescriptionList = helper.showAllPetDescription();
		request.setAttribute("allPetDescription", PetDescriptionList);
        String path = "/showPetDescription.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
