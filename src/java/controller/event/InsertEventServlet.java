package controller.event;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.dao.EventDAO;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

/**
 *
 * @author Nguye
 */
@WebServlet("/insertEvent")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class InsertEventServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        request.getRequestDispatcher("insertEvent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ename = new String(request.getParameter("EventName").getBytes("ISO-8859-1"), "UTF-8");
        String eCourseID = new String(request.getParameter("Course").getBytes("ISO-8859-1"), "UTF-8");
        String ediscount = new String(request.getParameter("Discount").getBytes("ISO-8859-1"), "UTF-8");
        String edaystart = new String(request.getParameter("daystart").getBytes("ISO-8859-1"), "UTF-8");
        String edayend = new String(request.getParameter("dayend").getBytes("ISO-8859-1"), "UTF-8");
        boolean checkDuplicate;
        String message = "";
        try {
            EventDAO dao = new EventDAO();
            checkDuplicate = dao.checkEventDuplicate(ename);
            if (!checkDuplicate) {
                // Specify that we expect a multipart request               
                List<Part> fileParts = new ArrayList<>();
                for (Part part : request.getParts()) {
                    String partName = new String(part.getName().getBytes("iso-8859-1"), "UTF-8");
                    if (partName.startsWith("image")) {
                        fileParts.add(part);

                    }

                }
                for (Part filePart : fileParts) {
                    String fileName = filePart.getSubmittedFileName();
                    InputStream fileContent = filePart.getInputStream();

                    InputStream content = fileContent;
                    byte[] imageBytes = IOUtils.toByteArray(content);
                    String data = Base64.getEncoder().encodeToString(imageBytes);
                    checkDuplicate = dao.checkDuplicateCourse(eCourseID);
                    if (checkDuplicate) {
                        checkDuplicate = dao.checkDayStart(edaystart  + " 00:00:00", edayend + " 00:00:00", eCourseID);
                        if (checkDuplicate) {
                            message = "The time the input event has existed. Please try again!";
                            
                        } else {
                            checkDuplicate = dao.checkDayEnd(edaystart  + " 00:00:00", edayend  + " 00:00:00", eCourseID);
                            if (checkDuplicate) {
                                message = "The time the input event has existed. Please try again!";
                            } else {
                                boolean check = saveInforToDatabase(ename, eCourseID, ediscount, edaystart, edayend, fileName, data);
                                if (check) {
                                    message = "Insert event successfully!";
                                } else {
                                    message = "Can't insert event!";
                                }
                            }
                        }

                    } else {
                        boolean check = saveInforToDatabase(ename, eCourseID, ediscount, edaystart, edayend, fileName, data);
                        if (check) {
                            message = "Insert event successfully!";
                        } else {
                            message = "Can't insert event!";
                        }
                    }

                }

            } else {
                message = "This event name " + ename + " alredy exist!";
            }

        } catch (SQLException ex) {
            response.getWriter().println("ERROR: " + ex.getMessage());
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("event").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean saveInforToDatabase(String eventName, String CourseID, String discount, String daystart, String dayend, String image, String data) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO Event (eventName, courseID, discount, daystart , dayend, image, data, status, flag)\n"
                        + "VALUES  (N'" + eventName + "'," + CourseID + "," + discount + ",'" + daystart + "','" + dayend + "','" + image + "', '" + data + "', 1, 0)";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
}
