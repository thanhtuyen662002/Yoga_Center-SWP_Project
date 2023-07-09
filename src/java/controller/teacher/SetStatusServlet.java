package controller.teacher;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.TeacherDAO;
import model.dto.UserDTO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "SetStatusServlet", urlPatterns = {"/setStatus"})
public class SetStatusServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String phone = request.getParameter("phone");
        String status = request.getParameter("status");
        TeacherDAO dao = new TeacherDAO();
        boolean check;
        String message = "";
        try {
            switch (status) {
                case "true":
                    check = dao.setDeactive(phone);
                    if (check) {
                        message = "Block account successfully!";
                    } else {
                        message = "Can't block account!";
                    }
                    break;
                case "false":
                    check = dao.setActive(phone);
                    if (check) {
                        message = "Unblock account successfully!";
                    } else {
                        message = "Can't unblock account!";
                    }
                    break;
                default:
                    message = "Have a problem! Please try again!";
                    break;
            }
        } catch (Exception e) {
        }
        response.sendRedirect("showListTeacher?message=" + message);
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
