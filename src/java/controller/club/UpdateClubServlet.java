package controller.club;

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
import model.dao.ClubDAO;
import model.dto.ClubDTO;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

@WebServlet(name = "UpdateClubServlet", urlPatterns = {"/updateClub"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class UpdateClubServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String clubID = request.getParameter("clubID");
            ClubDAO dao = new ClubDAO();
            ClubDTO club = dao.getClubByID(clubID);
            request.setAttribute("c", club);
            request.getRequestDispatcher("updateClub.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String clubID = request.getParameter("clubID");
        String clubName = new String(request.getParameter("clubName").getBytes("ISO-8859-1"), "UTF-8");
        String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
        String district = new String(request.getParameter("district").getBytes("ISO-8859-1"), "UTF-8");
        String hotline = request.getParameter("hotline");
        String message = "";
        try {
            List<Part> fileParts = new ArrayList<>();
            for (Part part : request.getParts()) {
                String partName = new String(part.getName().getBytes("iso-8859-1"), "UTF-8");
                if (partName.startsWith("image")) {
                    fileParts.add(part);
                }
            }

            for (Part filePart : fileParts) {
                InputStream fileContent = filePart.getInputStream();

                InputStream content = fileContent;
                byte[] imageBytes = IOUtils.toByteArray(content);
                String dataImage = Base64.getEncoder().encodeToString(imageBytes);
                
                boolean checkUpdate = updateClub(clubID, clubName, address, district, hotline, dataImage);
                if (checkUpdate) {
                    message = "Update club " + clubName + " successfully!";
                } else {
                    message = "Can't update club " + clubName + " !";
                }
            }
        } catch (Exception e) {
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("club").forward(request, response);
    }

    public boolean updateClub(String clubID, String clubName, String address, String district, String hotline, String dataImage) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        int row;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Club SET name = N'" + clubName + "', district = N'" + district + "', address = N'" + address + "', "
                        + "hotline = '" + hotline + "', dataImage = '" + dataImage + "' "
                        + "WHERE clubID = " +clubID;
                ptm = conn.prepareStatement(sql);
                row = ptm.executeUpdate();
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
