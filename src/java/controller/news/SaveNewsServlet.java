/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.news;

import controller.error.NewsError;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.dao.NewsDAO;
import model.dto.NewsDTO;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "SaveNewsServlet", urlPatterns = {"/savenews"})
public class SaveNewsServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
//        String save = request.getParameter("savenews");
        int newsID = 0;
        String title = null;
        boolean status = true;
        String content = null;
        String image = null;
        NewsError error = new NewsError();
        boolean foundErr = false;
        try {
            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();

            // Configure a repository (to ensure a secure temp location is used)
            ServletContext servletContext = this.getServletConfig().getServletContext();
            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
            factory.setRepository(repository);

            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            // Parse the request
            List<FileItem> items = upload.parseRequest((RequestContext) request);

            // Process the uploaded items
            Iterator<FileItem> iter = items.iterator();
            while (iter.hasNext()) {
                FileItem item = iter.next();
                if (item.isFormField()) {
                    String fieldName = new String(item.getFieldName().getBytes("ISO-8859-1"), "utf-8");
                    String fieldValue = new String(item.getString().getBytes("ISO-8859-1"), "utf-8");
                    if (fieldName.equals("title")) {
                        title = fieldValue;
                        if (title.isEmpty()) {
                            error.setTitle("Nhập tiêu đề bài viết!");
                            foundErr = true;
                        }
                    } else if (fieldName.equals("content")) {
                        content = fieldValue;
                        if (content.isEmpty()) {
                            error.setContent("Nhập nội dung bài viết!");
                            foundErr = true;
                        }
                    } else if (fieldName.equals("newsID")) {
                        newsID = !fieldValue.isEmpty() ? Integer.parseInt(fieldValue) : 0;
                    }
                }else {
                    // file
                    String fileName = new String(item.getFieldName().getBytes("ISO-8859-1"), "utf-8");
                    String fileValue = new String(item.getName().getBytes("ISO-8859-1"), "utf-8");
                    if (!(fileValue == null || fileValue.equals(""))) {
                        if (fileName.equals("image")) {
                            image = fileValue;
                        }
                        Path path = Paths.get(fileValue);
                        String storePath = servletContext.getRealPath("/image");
                        File uploadFile = new File(storePath + "/" + path.getFileName());
                        Path checkPath = Paths.get(storePath + "/" + path.getFileName());
                        boolean exists = Files.exists(checkPath);
                        if (!exists) {
                            item.write(uploadFile);
                        }
                    }
                }
            }
            if (image.isEmpty()) {
                error.setImage("Nhập đường dẫn ảnh của bài viết!");
                foundErr = true;
            } else {
                image = "image/" + image;
            }           
        try {
            request.setAttribute("list", NewsDAO.getAllNews());
            request.getRequestDispatcher("updateNews.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SaveNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }   catch (Exception ex) {
            Logger.getLogger(SaveNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
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
