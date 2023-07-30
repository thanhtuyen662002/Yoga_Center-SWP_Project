package controller.feedback;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.CoursesDAO;
import model.dao.EventDAO;
import model.dao.FeedbackDAO;
import model.dto.CoursesDTO;
import model.dto.EventDTO;
import model.dto.FeedbackDTO;

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
        String idcourse = courseID;
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
                    message = "Đánh giá của bạn đã được gửi đi!";
                    System.out.println("Đánh giá của bạn đã được ghi nhận!");
                } else {
                    message = "Đánh giá thất bại! Bạn đã đánh giá khóa học này!";
                    System.out.println("Bạn đã gửi đánh giá rồi!");
                }
            } else {
                // Nếu người dùng chưa học khóa học này, trả về thông báo lỗi
                message = "Bạn chưa học khóa này!";
            }
            if (message != null) {
                request.setAttribute("Message", message);
            }
           

            CoursesDAO dao1 = new CoursesDAO();
            EventDAO Edao = new EventDAO();
            String eventID = "";
            
            List<CoursesDTO> listCoursesID = dao1.getCourseIDByPhone(cusPhone);
            request.setAttribute("coursesID", listCoursesID);
            
            String id = idcourse;
            request.setAttribute("id", id);
            String ID = request.getParameter("ID");
            eventID = Edao.getEventByCourseID(id);
            if (eventID != null && ID == null) {
                request.setAttribute("d", Edao.getEventByID(eventID));
            } else {
                EventDTO discount = Edao.getEventByID(ID);
                request.setAttribute("d", discount);
            }
            CoursesDTO list = dao1.getCourseDetail(id);
            int price = (int) list.getPrice();
            request.setAttribute("price", price);
            request.setAttribute("c", list);

            CoursesDTO course = dao1.getCourses(id);
            request.setAttribute("course", course);
            List<FeedbackDTO> feedbackList = FeedbackDAO.getFeedbackByCourseID(id);
            request.setAttribute("feedbackList", feedbackList);
            request.getRequestDispatcher("view.customer/courseDetail.jsp").forward(request, response);
//            response.sendRedirect("showFeedback?id="+courseID+"&Message="+message);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertFeedbackServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
