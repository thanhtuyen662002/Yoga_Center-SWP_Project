package controller.teacher;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.TeacherDAO;
import model.dto.UserDTO;

@WebServlet(name = "ShowListTeacherServlet", urlPatterns = {"/showListTeacher"})
public class ShowListTeacherServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String message = "";
            message = request.getParameter("message");
            request.setAttribute("ErrorMessage", message);
            TeacherDAO dao = new TeacherDAO();
            List<UserDTO> list = dao.getAllTeacher();
            request.setAttribute("list", list);
            request.getRequestDispatcher("teacherStaff.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
