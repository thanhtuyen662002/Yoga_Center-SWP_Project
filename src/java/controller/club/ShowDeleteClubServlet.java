package controller.club;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClubDAO;
import model.dto.ClubDTO;

@WebServlet(name = "ShowDeleteClubServlet", urlPatterns = {"/showDeleteClub"})
public class ShowDeleteClubServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String message = (String) request.getAttribute("message");
            request.setAttribute("ErrorMessage", message);
            ClubDAO dao = new ClubDAO();
            List<ClubDTO> list = dao.getAllDelete();
            request.setAttribute("list", list);
            request.getRequestDispatcher("restoreClub.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
