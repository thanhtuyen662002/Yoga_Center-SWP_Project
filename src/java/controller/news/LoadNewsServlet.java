/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.news;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.NewsDAO;
import model.dto.NewsDTO;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name="LoadNewsServlet", urlPatterns={"/loadnews"})
public class LoadNewsServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, NamingException, SQLException, ClassNotFoundException {
   
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            int newsID = Integer.parseInt(request.getParameter("newsID"));
            
            NewsDAO dao = new NewsDAO();
            NewsDTO news = dao.getNews(newsID);
            if (news != null){
                request.setAttribute("NEWS", news);                
                List<NewsDTO> recommendList = dao.getRandomRecommendNews(newsID);
                if(recommendList != null) request.setAttribute("RECOMMEND_NEWS", recommendList);
                List<NewsDTO> relatedList = dao.getRalativeNews(newsID);
                if(relatedList != null) request.setAttribute("RELATED_NEWS", relatedList);
                request.getRequestDispatcher("newsDetails.jsp").forward(request, response);
            }

        } catch (NamingException ex) {
            Logger.getLogger(LoadNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoadNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
