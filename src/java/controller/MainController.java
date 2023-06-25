/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "mainController", urlPatterns = {"/mainController"})
public class MainController extends HttpServlet {

    private String url = "errorpage.html";

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
            String action = request.getParameter("action");
            if (action == null || action.equals("") || action.equals("search")) {
                url = "home.jsp";
            } else if (action.equals("login")) {
                url = "login";
            } else if (action.equals("logout")) {
                url = "logout";
            } else if (action.equals("SignUp")) {
                url = "register";
            } else if (action.equals("courses")) {
                url = "courses";
            } else if (action.equals("club")) {
                url = "club";
            } else if (action.equals("news")) {
                url = "news";
            } else if (action.equals("updatenews")) {
                url = "updatenews";
            } else if (action.equals("deletenews")) {
                url = "deletenews";
            } else if (action.equals("insertnews")) {
                url = "insertnews";
            } else if (action.equals("event")) {
                url = "event";
            } else if (action.equals("guest")) {
                url = "guest";
            } else if (action.equals("updateguest")) {
                url = "updateguest";
            } else if (action.equals("learner")) {
                url = "customer";
            } else if (action.equals("schedule")) {
                url = "schedule";
            } else if (action.equals("insertCourse")) {
                url = "insertCourse";
            } else if (action.equals("updateCourse")) {
                url = "updateCourse";
            } else if (action.equals("listSchedule")) {
                url = "listSchedule";
            } else if (action.equals("showclass")) {
                url = "showclass";
            } else if (action.equals("InsertSchedule")) {
                url = "insertSchedule";
            } else if (action.equals("ViewDetails")) {
                url = "viewSchedule";
            } else if (action.equals("Staff")) {
                url = "courses";
            } else if (action.equals("bill")) {
                url = "showBill";
            }
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
