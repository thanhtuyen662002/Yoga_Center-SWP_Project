/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.news;

import java.sql.Connection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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
import model.dto.NewsDTO;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import java.sql.PreparedStatement;
import utils.DBUtils;


/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "UpdateNewsServlet", urlPatterns = {"/updatenews"})
public class UpdateNewsServlet extends HttpServlet {

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
    private NewsDAO newsDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        newsDAO = new NewsDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //        processRequest(request, response);
            String id = request.getParameter("newsID");
            NewsDAO dao = new NewsDAO();
            NewsDTO n = dao.getNewsByID(id);
            request.setAttribute("ns", n);
            request.getRequestDispatcher("updateNews.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        NewsDAO dao = new NewsDAO();
        String rootPath = getServletContext().getRealPath("/");
        String imagePath = "image";
        String filePath = rootPath + imagePath;
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String categoryID = request.getParameter("categoryID");
        String fileName = "";
        String partName = "";
        String data = "";
        InputStream fileContent;
        boolean checkDuplicate;
        //Kiểm tra tên khóa học đã có trong database hay chưa
        checkDuplicate = dao.checkDuplicateNewsID(newsID);
        if (!checkDuplicate) {
            List<Part> fileParts = new ArrayList<>();
            for (Part part : request.getParts()) {
                partName = new String(part.getName().getBytes("iso-8859-1"), "UTF-8");
                if (partName.startsWith("image")) {
                    fileParts.add(part);
                }
            }

            for (Part filePart : fileParts) {
                fileName = filePart.getSubmittedFileName();
                fileContent = filePart.getInputStream();

//                    File file = new File(filePath + File.separator + fileName);
                Path file = Paths.get(filePath + File.separator + fileName);
                byte[] imageBytes = IOUtils.toByteArray(fileContent);
                data = Base64.getEncoder().encodeToString(imageBytes);
                Files.copy(fileContent, file, StandardCopyOption.REPLACE_EXISTING);

            }

            try {
                saveInforToDatabase(title, content, categoryID, fileName, data);
            } catch (SQLException ex) {
                Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //response.getWriter().println("Error: Course name already exists in Database!");
            request.setAttribute("ErrorMessage", "Error: Course name already exists in Database!");
            request.getRequestDispatcher("updateNews.jsp").forward(request, response);
        }
        response.sendRedirect("news");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
       private void saveInforToDatabase(String newsID, String title, String content, String image, String categoryID) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "UPDATE News SET title= '" + title + "' ,image= '" + image + "', content='" + content + "' ,categoryID= " + categoryID + "WHERE newsID= " + newsID;
                ptm = conn.prepareStatement(query);
                ptm.executeUpdate();
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {ptm.close();
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
