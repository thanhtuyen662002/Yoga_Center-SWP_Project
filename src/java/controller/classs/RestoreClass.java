package controller.classs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClassDAO;

@WebServlet(name = "restoreClass", urlPatterns = {"/restoreClass"})
public class RestoreClass extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String message = "";
        try {
            ClassDAO dao = new ClassDAO();
            boolean check = dao.restoreClass(id);
            if (check) {
                message = "Success recovery!";
            } else {
                message = "Can't recovery!";
            }
        } catch (Exception e) {
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("showDeleteClass").forward(request, response);
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
