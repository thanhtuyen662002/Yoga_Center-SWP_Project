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
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
@WebServlet(name = "InsertNewsServlet", urlPatterns = {"/insertnews"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class InsertNewsServlet extends HttpServlet {


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
        request.getRequestDispatcher("insertNews.jsp").forward(request, response);

    }

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
        boolean checkDuplicate;
        String message = "";
        // Xử lý yêu cầu tải lên ảnh
         try { 
             NewsDAO dao = new NewsDAO();
            checkDuplicate = dao.checkDuplicateNewsID(0);
            if (!checkDuplicate) {
        List<Part> fileParts = new ArrayList<>();
        for (Part part : request.getParts()) {
            String partName = new String(part.getName().getBytes("iso-8859-1"), "UTF-8");
            if (partName.startsWith("image")) {
                fileParts.add(part);
            }
        }

        for (Part filePart : fileParts) {
                String filename = filePart.getSubmittedFileName();
                InputStream fileContent = filePart.getInputStream();

                InputStream content1 = fileContent;
                byte[] imageBytes = IOUtils.toByteArray(content1);
                String data = Base64.getEncoder().encodeToString(imageBytes);
                boolean checkinsert = insertNews(stPhone, title, postDate, filename, data, content, categoryID);
                if (checkinsert) {
                        message = "Create news successfully!";
                    } else {
                        message = "Can't create news!!";
                    }
                }

            } else {
                message = "This news name " + title + " alredy exist";
            }
        
            } catch (SQLException ex) {
            response.getWriter().println("ERROR: " + ex.getMessage());
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("news").forward(request, response);
    }

    private boolean insertNews(String stPhone, String title, String postDate, String image, String data, String content, String categoryID) throws SQLException {
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
