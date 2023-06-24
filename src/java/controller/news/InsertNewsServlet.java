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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.dao.NewsDAO;
import model.dao.UserDAO;
import model.dto.UserDTO;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "InsertNewsServlet", urlPatterns = {"/insertnews"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50)   // 50MB
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
    //        processRequest(request, response);
//        UserDAO dao = new UserDAO();
//            UserDTO stphone = dao.getUserByPhone(stphone);
//        String stphone = (String) session.getAttribute("stphone");
//        String stphone = request.getParameter("stphone");
//        HttpSession session = request.getSession();
//        UserDTO user = (UserDTO) session.getAttribute("STAFF");
//        String stphone = user.getPhone();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String postDate = dateFormat.format(currentDate);
        String title = new String(request.getParameter("title").getBytes("ISO-8859-1"), "UTF-8");
        String content = new String(request.getParameter("content").getBytes("ISO-8859-1"), "UTF-8");
        String categoryID = request.getParameter("categoryID");

        String stPhone = "0123456788";
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
                insertNews(stPhone, title, postDate, filename, data, content, categoryID);

                {

                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        response.sendRedirect("news");
    }

    private void insertNews(String stPhone, String title, String postDate, String image, String data, String content, String categoryID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO News (stPhone, title, postDate, image , data, content, categoryID, status)\n"
                        + "VALUES  ('" + stPhone + "',N'" + title + "','" + postDate + "','" + image + "','" + data + "',N'" + content + "', '" + categoryID + "', 1 " + " )";
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
