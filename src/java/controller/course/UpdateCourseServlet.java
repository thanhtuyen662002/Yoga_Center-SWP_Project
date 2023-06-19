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
import model.dao.CoursesDAO;
import model.dto.CoursesDTO;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "UpdateCourseServlet", urlPatterns = {"/updateCourse"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class UpdateCourseServlet extends HttpServlet {

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
            CoursesDAO dao = new CoursesDAO();
            CoursesDTO course = dao.getCourseByName(name);
            request.setAttribute("c", course);
            request.getRequestDispatcher("updateCourse.jsp").forward(request, response);
        } catch (SQLException ex) {
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("id");
        String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
        String price = new String(request.getParameter("price").getBytes("ISO-8859-1"), "UTF-8");
        String des = new String(request.getParameter("description").getBytes("ISO-8859-1"), "UTF-8");
        String numberOfMonths = request.getParameter("numberOfMonths");

        try {
            //Kiểm tra tên khóa học đã có trong database hay chưa
            CoursesDAO dao = new CoursesDAO();
            boolean checkDuplicate = dao.checkCourseDuplicate(name);
            boolean checkDuplicate2 = dao.checkCourseDuplicate2(id, name);

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
                        updateInforToDatabase(name, price, des, numberOfMonths, fileName, data, id);

                    }
                } else {
                    response.getWriter().println("Error: Course name already exists in Database!");
                    request.setAttribute("ErrorMessage", "Error: Course name already exists in Database!");
                    CoursesDTO list = dao.getCourseByName(name);
                    request.setAttribute("c", list);
                    request.getRequestDispatcher("updateCourse.jsp").forward(request, response);
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
                    updateInforToDatabase(name, price, des, numberOfMonths, fileName, data, id);

                }

            }
        } catch (SQLException ex) {
            response.getWriter().println("ERROR: " + ex.getMessage());
        }
        response.sendRedirect("courses");
    }

    public void updateInforToDatabase(String name, String price, String des, String numberOfMonths, String fileName, String data, String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "UPDATE Courses SET name = N'" + name + "', description= N'" + des + "', numberOfMonths= " + numberOfMonths + ", image= N'"
                        + fileName + "', data= '" + data + "', price= " + price + " WHERE courseID= " + id;
                ptm = conn.prepareStatement(query);
                ptm.executeUpdate();
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
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
