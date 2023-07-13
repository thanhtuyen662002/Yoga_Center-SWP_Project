package controller.news;

import java.sql.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.dao.NewsDAO;
import model.dto.NewsDTO;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.MultipartConfig;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "UpdateNewsServlet", urlPatterns = {"/updatenews"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class UpdateNewsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newsID = request.getParameter("newsID");

        try {
            NewsDAO dao = new NewsDAO();
            NewsDTO news = dao.getNewsByID(newsID);
            if (news == null) {
                response.sendRedirect(request.getContextPath() + "/error");
                return;
            }

            request.setAttribute("ns", news);
            request.getRequestDispatcher("updateNews.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/error");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String newsID = request.getParameter("newsID");
        String title = new String(request.getParameter("title").getBytes("ISO-8859-1"), "UTF-8");
        String categoryID = request.getParameter("categoryID");
        String content = new String(request.getParameter("content").getBytes("ISO-8859-1"), "UTF-8");
        String message = "";

        try {
            NewsDAO dao = new NewsDAO();
            NewsDTO news = dao.getNewsByID(newsID);
            String dataRoot = news.getData();
            // Xử lý yêu cầu tải lên ảnh
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
                if (data == null || data.equals("")) {
                    data = dataRoot;
                }
                boolean checkUpdate = updateNews(newsID, title, filename, categoryID, content, data);
                if (checkUpdate) {
                    message = "Update news successfully!";
                } else {
                    message = "Can't update news!";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);

        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("news").forward(request, response);
    }

    private boolean updateNews(String newsID, String title, String image, String categoryID, String content, String data) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "UPDATE News SET title= N'" + title + "' ,image= '" + image + "', content=N'" + content + "' ,categoryID= " + categoryID + ", data = '" + data + "' WHERE newsID= " + newsID;
                ptm = conn.prepareStatement(query);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
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
    }

}
