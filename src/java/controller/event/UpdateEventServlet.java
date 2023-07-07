/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.course;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
import model.dto.EventDTO;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "UpdateEventServlet", urlPatterns = {"/updateEvent"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class UpdateEventServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
//            String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
            EventDAO dao = new EventDAO();
            EventDTO event = dao.getEventByName(name);
            request.setAttribute("e", event);
            request.getRequestDispatcher("updateEvent.jsp").forward(request, response);
        } catch (SQLException ex) {
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String eventName = new String(request.getParameter("EventName").getBytes("ISO-8859-1"), "UTF-8");
        String discount = request.getParameter("Discount");
        String courseID = request.getParameter("Course");
        String daystart = request.getParameter("daystart");
        String dayend = request.getParameter("dayend");
        String eventID = request.getParameter("id");
        String message = "";
        boolean checkUpdate;

        try {
            //Kiểm tra tên khóa học đã có trong database hay chưa
            EventDAO dao = new EventDAO();
            boolean checkDuplicate = dao.checkEventDuplicate(eventName);
            boolean checkDuplicate2 = dao.checkEventDuplicate2(eventID, eventName);
            EventDTO event = dao.getEventByID(eventID);
            String rootEventName = event.getEventName();
            if (checkDuplicate) {
                if (checkDuplicate2) {
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
                        checkUpdate = updateInforToDatabase(eventID, eventName, courseID, discount, daystart, dayend, fileName, data);
                        if (checkUpdate) {
                            message = "Cập nhật sự kiện thành công!";
                        } else {
                            message = "Cập nhật sự kiện thất bại!";
                        }
                    }
                } else {
                    message = "Tên sự kiện " + rootEventName + " đã tồn tại! Vui lòng nhập tên sự kiện khác!";
                }

            } else {
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
                    checkUpdate = updateInforToDatabase(eventID, eventName, courseID, discount, daystart, dayend, fileName, data);
                    if (checkUpdate) {
                        message = "Cập nhật sự kiện thành công!";
                    } else {
                        message = "Cập nhật sự kiện thất bại!";
                    }
                }

            }
        } catch (SQLException ex) {
            response.getWriter().println("ERROR: " + ex.getMessage());
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("event").forward(request, response);
    }

    public boolean updateInforToDatabase(String eventID, String eventName, String courseID, String discount, String daystart, String dayend, String image, String data) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Event set eventName=  N'" + eventName + "', courseID=" + courseID + " , discount= " + discount + ",daystart='" + daystart + "',dayend='" + dayend + "',"
                        + "image='" + image + "', data='" + data + "' where eventID=" + eventID;
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

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
