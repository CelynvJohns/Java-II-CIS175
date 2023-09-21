package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NameLengthCalculator;

@WebServlet("/GetNameServlet")
public class GetNameServlet extends HttpServlet {
    private static final long serialVersionUID = 2L;

    public GetNameServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nameOne = request.getParameter("nameOne"); // Correct the parameter names
        String nameTwo = request.getParameter("nameTwo"); // Correct the parameter names

        NameLengthCalculator length = new NameLengthCalculator(nameOne, nameTwo);

        request.setAttribute("userIs", length);
        getServletContext().getRequestDispatcher("/length_result.jsp").forward(request, response);
    }
}
