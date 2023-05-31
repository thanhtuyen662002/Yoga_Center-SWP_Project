/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yogacenter.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hd
 */
public class MainController_Nhat extends HttpServlet {

    private static final String ERROR = "error.jsp";
    private static final String ViewSchedule = "ViewSchedule";
    private static final String ListSchedule_CONTROLLER = "listSchedule";
    private static final String ViewDetails = "ViewDetails";
    private static final String ViewSchedule_CONTROLLER = "viewSchedule";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action = request.getParameter("action");//Search
            if (ViewSchedule.equals(action)) {
                url = ListSchedule_CONTROLLER;
            }
            if (ViewDetails.equals(action)) {
                url = ViewSchedule_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action is not support!");
            }
        } catch (Exception e) {
            log("Error at MainController" + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
