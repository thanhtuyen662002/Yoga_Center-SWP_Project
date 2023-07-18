package controller.guest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.BillDAO;
import model.dao.CoursesDAO;
import model.dao.EventDAO;
import model.dao.GuestDAO;
import model.dto.CoursesDTO;

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
        String phoneTrim = request.getParameter("phone");
        String phone = phoneTrim.replace(" ", "");
        String courseID = request.getParameter("chooseCourse");
        String name = new String(request.getParameter("fullName").getBytes("ISO-8859-1"), "UTF-8");
        GuestDAO dao = new GuestDAO();
        BillDAO bdao = new BillDAO();
        CoursesDAO cdao = new CoursesDAO();
        EventDAO edao = new EventDAO();
        boolean check;
        String message = "";
        try {
            check = dao.insertUserCourse1(phone, courseID);
            if (check) {
                message = "Create account successfully!";
                check = bdao.insertUserToBill(phone);
                if (check) {
                    System.out.println("Sử dụng dữ liệu điền form! Thêm vào hóa đơn thành công!");
                } else {
                    System.out.println("Sử dụng dữ liệu điền form! Không thể thêm vào hóa đơn!");
                    CoursesDTO listC = cdao.getCourseDetail(courseID);
                    int coursePrice = (int) listC.getPrice();
                    int numberOfMonths = (int) listC.getNumberOfMonths();
                    int discount = (int) edao.getDiscountByCourseID(courseID);
                    int price = coursePrice * numberOfMonths - (numberOfMonths * coursePrice * discount/100);
                    check = bdao.makeBill(phone, courseID, name, price);
                    if (check) {
                        System.out.println("Khách hàng đến trực tiếp cửa hàng! Thêm vào hóa đơn thành công!");
                    } else {
                        System.out.println("Khách hàng đến trực tiếp cửa hàng! Thêm vào hóa đơn thất bại!");
                    }
                }
            } else {
                message = "Can't create account!";
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
