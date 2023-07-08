package controller.feedback;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.FeedbackDAO;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "InsertFeedbackServlet", urlPatterns = {"/insertfb"})
public class InsertFeedbackServlet extends HttpServlet {

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
        String message = "";
        boolean insertFeedback;
        String cusPhone = request.getParameter("cusPhone");
        String courseID = request.getParameter("courseID");
        String comment = new String(request.getParameter("comment").getBytes("ISO-8859-1"), "UTF-8");
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dayup = dateFormat.format(currentDate);
        FeedbackDAO dao = new FeedbackDAO();
        try {

            boolean checkusercourse = dao.checkUserCourse(cusPhone, courseID);
            if (checkusercourse) {
                insertFeedback = dao.insertFeedback(cusPhone, courseID, comment, dayup);
                if (insertFeedback) {
                    message = "Đánh giá của bạn đã được ghi nhận!";
                    System.out.println("Đánh giá của bạn đã được ghi nhận!");
                } else {
                    message = "Đánh giá thất bại!";
                    System.out.println("Đánh giá thất bại!");
                }
            } else {
                // Nếu người dùng chưa học khóa học này, trả về thông báo lỗi
                message = "Bạn chưa học khóa học này!";
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertFeedbackServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("showFeedback?id="+courseID+"&Message="+message);
    }
}
