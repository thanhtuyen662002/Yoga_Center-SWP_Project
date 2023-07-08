/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.classs;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClassDAO;
import model.dto.ClassDTO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "ShowListLearner", urlPatterns = {"/showLearner"})
public class ShowListLearner extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        String classID = request.getParameter("classID");
        int countTT = Integer.parseInt(request.getParameter("countTT"));
        int total = Integer.parseInt(request.getParameter("total"));
        String message = new String(request.getParameter("message").getBytes("ISO-8859-1"), "UTF-8");
        try {
            ClassDAO dao = new ClassDAO();
            List<ClassDTO> list = dao.getUser(id);
            request.setAttribute("List", list);
            request.setAttribute("id", id);
            request.setAttribute("classID", classID);
            request.setAttribute("countTT", countTT);
            request.setAttribute("total", total);
            request.setAttribute("ErrorMessage", message);
            request.getRequestDispatcher("showClassUser.jsp").forward(request, response);
        } catch (Exception e) {
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
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        String classID = request.getParameter("classID");
        String countTT = (String) request.getAttribute("countTT");
        String total = (String) request.getAttribute("total");
        String encodedMessage = request.getParameter("message");
        String message = URLDecoder.decode(encodedMessage, "UTF-8");
        try {
            ClassDAO dao = new ClassDAO();
            List<ClassDTO> list = dao.getUser(id);
            request.setAttribute("List", list);
            request.setAttribute("id", id);
            request.setAttribute("classID", classID);
            request.setAttribute("countTT", countTT);
            request.setAttribute("total", total);
            request.setAttribute("ErrorMessage", message);
            request.getRequestDispatcher("showClassUser.jsp").forward(request, response);
        } catch (Exception e) {
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
