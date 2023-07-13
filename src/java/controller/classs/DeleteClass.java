package controller.classs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClassDAO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "DeleteClass", urlPatterns = {"/deleteClass"})
public class DeleteClass extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name =  request.getParameter("name");
        boolean check;
        String message = "";
        try {
            ClassDAO dao = new ClassDAO();
            check = dao.checkDeleteClass(name);
            if (check) {
                message = "Can not delete! The classes still have students attending!";
            } else {
                check = dao.deleteClass(name);
                if (check) {
                    message = "Delete class successfully!";
                } else {
                    message = "Can't delete class!";
                }
            }
        } catch (Exception e) {
        }
        response.sendRedirect("showclass?message=" + message);
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
