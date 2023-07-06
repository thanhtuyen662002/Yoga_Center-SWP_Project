/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.club;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClubDAO;
import model.dto.ClubDTO;

/**
 *
 * @author HP Pro
 */
@WebServlet("/club")
public class ClubServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            request.getRequestDispatcher("clb.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ClubDAO dao = new ClubDAO();
            List<ClubDTO> list = dao.getAllClub();
            request.setAttribute("list", list);
            request.getRequestDispatcher("clubStaff.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String message = (String) request.getAttribute("message");
            request.setAttribute("ErrorMessage", message);
            ClubDAO dao = new ClubDAO();
            List<ClubDTO> list = dao.getAllClub();
            request.setAttribute("list", list);
            request.getRequestDispatcher("clubStaff.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
