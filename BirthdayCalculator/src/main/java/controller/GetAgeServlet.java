package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AgeCalculator;

@WebServlet("/getAgeServlet")
public class GetAgeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public GetAgeServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userBirthYear = request.getParameter("userBirthYear");
        String userBirthMonth = request.getParameter("userBirthMonth");
        String userBirthDay = request.getParameter("userBirthDay"); // Fix the case here

        int birthYear = Integer.parseInt(userBirthYear);
        int birthMonth = Integer.parseInt(userBirthMonth);
        int birthDay = Integer.parseInt(userBirthDay);

        AgeCalculator userAgeCalculator = new AgeCalculator(birthYear, birthMonth, birthDay);

        request.setAttribute("userIs", userAgeCalculator);
        getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
