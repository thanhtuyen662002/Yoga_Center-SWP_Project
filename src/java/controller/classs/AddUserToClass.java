package controller.classs;

import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClassDAO;
import model.dto.ClassDTO;

@WebServlet(name = "AddUserToClass", urlPatterns = {"/addUserToClass"})
public class AddUserToClass extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String cusPhone = request.getParameter("cus");
        String id = request.getParameter("id");
        String classID = request.getParameter("classID");
        String message = "";
        int countTT = 0;
        int total = 0;
        ClassDAO dao = new ClassDAO();
        try {
            boolean checkInsert = dao.insertUserToClass(classID, cusPhone);
            if (checkInsert) {
                message = "Add student to class successfully!";
                ClassDTO list = dao.getClassTotalSession(classID);
                countTT = list.getCountTT();
                total = list.getCapacity();
            } else {
                message = "Add student to class fail!";
            }
        } catch (Exception e) {
        }
        String encodedMessage = URLEncoder.encode(message, "UTF-8");
        String redirectUrl = "showLearner?id=" + id + "&classID=" + classID + "&countTT=" + countTT + "&total=" + total + "&message=" + encodedMessage;
        response.sendRedirect(redirectUrl);
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
