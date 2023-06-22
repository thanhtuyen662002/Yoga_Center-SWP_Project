/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.news;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.dao.NewsDAO;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "InsertNewsServlet", urlPatterns = {"/insertNews"})
public class InsertNewsServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {

        }
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
//        processRequest(request, response);
        request.getRequestDispatcher("insertNews.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String newsID = request.getParameter("newsID");
        String stPhone = "0123456789";
        String title = new String(request.getParameter("title").getBytes("ISO-8859-1"), "UTF-8");
        String categoryID = request.getParameter("categoryID");
        String content = new String(request.getParameter("content").getBytes("ISO-8859-1"), "UTF-8");

        // Xử lý yêu cầu tải lên ảnh
        List<Part> fileParts = new ArrayList<>();
        for (Part part : request.getParts()) {
            String partName = new String(part.getName().getBytes("iso-8859-1"), "UTF-8");
            if (partName.startsWith("image")) {
                fileParts.add(part);
            }
        }

        for (Part filePart : fileParts) {
            try {
                String filename = filePart.getSubmittedFileName();
                InputStream fileContent = filePart.getInputStream();

                InputStream content1 = fileContent;
                byte[] imageBytes = IOUtils.toByteArray(content1);
                String data = Base64.getEncoder().encodeToString(imageBytes);
                insertNews(newsID, title, filename, categoryID, content, data);

                {

                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        response.sendRedirect("news");
    }

    private void insertNews(String newsID, String title, String image, String categoryID, String content, String data) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO Event (eventName, courseID, discount, daystart , dayend, image, data, status)\n"
                        + "VALUES  (N'" + eventName + "'," + CourseID + "," + discount + ",'" + daystart + "','" + dayend + "','" + image + "', '" + data + "', 0" + " )";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    System.out.println("Success");
                } else {
                    System.out.println("Fail");
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
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
