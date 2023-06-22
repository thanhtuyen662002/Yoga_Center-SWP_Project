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
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "InsertCourseServlet", urlPatterns = {"/insertCourse"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class InsertCourseServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("insertCourse.jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("insertCourse.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
        String price = new String(request.getParameter("price").getBytes("ISO-8859-1"), "UTF-8");
        String des = new String(request.getParameter("description").getBytes("ISO-8859-1"), "UTF-8");
        String numberOfMonths = request.getParameter("numberOfMonths");

        boolean checkDuplicate;
        try {
            //Kiểm tra tên khóa học đã có trong database hay chưa
            CoursesDAO dao = new CoursesDAO();
            checkDuplicate = dao.checkCourseDuplicate(name);
            if (!checkDuplicate) {
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
                    boolean checkInsertCourse = saveInforToDatabase(name, price, des, numberOfMonths, fileName, data);
                    if (checkInsertCourse) {
                        saveCourseTypeToDatabase(name);
                    }
                }
            } else {
                //response.getWriter().println("Error: Course name already exists in Database!");
                request.setAttribute("ErrorMessage", "Error: Course name already exists in Database!");
                request.getRequestDispatcher("insertCourse.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            response.getWriter().println("ERROR: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("courses");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean saveCourseTypeToDatabase(String name) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ptm = null;
        CoursesDAO dao = new CoursesDAO();
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                CoursesDTO list = dao.getCourseByName(name);
                if (list != null) {
                    int id = list.getCourseID();
                    int numberOfMonths = list.getNumberOfMonths();
                    int week = numberOfMonths * 4;

                    String query = "INSERT INTO CourseType (courseID, name, week)\n"
                            + "VALUES (" + id + ",N'" + name + "'," + week + ")";
                    ptm = conn.prepareStatement(query);
                    int row = ptm.executeUpdate();
                    if (row > 0) {
                        return check = true;
                    } else {
                        return check = false;
                    }
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
        return check;
    }

    private boolean saveInforToDatabase(String name, String price, String description, String numberOfMonths, String image, String data) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ptm = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "INSERT INTO Courses (name, description, numberOfMonths, image, data, price, status) "
                        + "VALUES (N'" + name + "', N'" + description + "'," + numberOfMonths + ",N'" + image + "','" + data + "'," + price + ", 1)";
                ptm = conn.prepareStatement(query);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return check = true;
                } else {
                    return check = false;
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
        return check;
    }

}
