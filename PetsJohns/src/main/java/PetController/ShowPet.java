package PetController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import helpers.PetHelper;
import model.Pet;
/**
 * Servlet implementation class ShowPet
 */
@WebServlet("/showPet")
public class ShowPet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ShowPet() {
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PetHelper helper = new PetHelper();
        List<Pet> PetList = helper.showAllPet();
        request.setAttribute("allPet", PetList);
        String path = "/showPet.jsp";
        getServletContext().getRequestDispatcher(path).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PetHelper helper = new PetHelper();
        List<Pet> PetList = helper.showAllPet();
        request.setAttribute("allPet", PetList);
        String path = "/showPet.jsp";
        getServletContext().getRequestDispatcher(path).forward(request, response);
    }
}