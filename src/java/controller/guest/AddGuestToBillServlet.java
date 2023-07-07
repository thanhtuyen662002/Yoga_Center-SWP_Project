package controller.guest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.BillDAO;
import model.dao.GuestDAO;

@WebServlet(name = "AddGuestToBillServlet", urlPatterns = {"/addGuestToBill"})
public class AddGuestToBillServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String phone = request.getParameter("phone");
        String courseID = request.getParameter("chooseCourse");
        GuestDAO dao = new GuestDAO();
        BillDAO bdao = new BillDAO();
        boolean check;
        String message = "";
        try {
            check = dao.insertUserCourse1(phone, courseID);
            if (check) {
                message = "Tạo tài khoản thành công!";
                check = bdao.insertUserToBill(phone);
                if (check) {
                    System.out.println("Thêm vào hóa đơn thành công!");
                } else {
                    System.out.println("Không thể thêm vào hóa đơn!");
                }
            } else {
                message = "Tạo tài khoản thất bại!";
            }
        } catch (Exception e) {
        } 
        request.setAttribute("message", message);
        request.getRequestDispatcher("guest").forward(request, response);
    }

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
