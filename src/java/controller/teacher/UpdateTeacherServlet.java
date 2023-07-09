package controller.teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.TeacherDAO;
import model.dto.UserDTO;

@WebServlet(name = "UpdateTeacherServlet", urlPatterns = {"/updateTeacher"})
public class UpdateTeacherServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            TeacherDAO dao = new TeacherDAO();
            String phone = request.getParameter("phone");
            UserDTO list = dao.getTeacherByPhone(phone);
            request.setAttribute("x", list);
            request.getRequestDispatcher("updateTeacher.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String rootPhone = request.getParameter("rootPhone");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
        String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
        String message = "";
        boolean check;
        try {
            TeacherDAO dao = new TeacherDAO();
            check = dao.updateTeacher(rootPhone, name, phone, address, gender);
            if (check) {
                message = "Update account successfully!";
            } else {
                message = "Can't update account successfully!";
            }
        } catch (Exception e) {
        }
        response.sendRedirect("showListTeacher?message=" + message);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
