package controller.club;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClubDAO;

@WebServlet(name = "DeleteClubServlet", urlPatterns = {"/deleteClub"})
public class DeleteClubServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String clubID = request.getParameter("clubID");
        String message = "";
        try {
            ClubDAO dao = new ClubDAO();
            boolean checkDelete = dao.deleteClub(clubID);
            if (checkDelete) {
                message = "Delete club successfully!";
            } else {
                message = "Can't delete club!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteClubServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("club").forward(request, response);
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
