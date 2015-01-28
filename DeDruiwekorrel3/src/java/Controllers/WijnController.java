/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import ViewModels.LijstWijnenViewModel;
import Services.WijnServices;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Christel
 */
@WebServlet(name = "WijnController", urlPatterns = {"/WijnController"})
public class WijnController extends HttpServlet {

    private String qString;
    private String wijnhuis;
    private String wijntype;
    private String prijs;

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

        System.out.println("WijnController");

        wijnhuis = (request.getParameter("wijnhuis"));
        System.out.println("wijnhuis : " + wijnhuis);

        wijntype = (request.getParameter("wijntype"));
        System.out.println("wijntype : " + wijntype);

        prijs = (request.getParameter("prijs"));
        System.out.println("prijs : " + prijs);

        response.setContentType("text/html;charset=UTF-8");

        qString = "";

        if (wijnhuis != null) {
            System.out.println("wijnhuis niet null " + wijnhuis);
            qString = "wijnhuisId = " + wijnhuis;
        }

        if (wijntype != null) {
            System.out.println("wijntype niet null " + wijntype);
            if (!"".equals(qString)) {
                qString = qString + " and ";
            }
            qString = qString + "wijntypeId = " + wijntype;
        }

        if (prijs != null) {
            System.out.println("prijs niet null " + prijs);
            if (!"".equals(qString)) {
                qString = qString + " and ";
            }
            qString = qString + "prijs " + prijs;
        }

        if ("".equals(qString)) {
            qString = "from Wijntbl";
        } else {
            qString = "from Wijntbl where " + qString;
        }

        System.out.println(
                "qString : " + qString);
        LijstWijnenViewModel vm
                = new LijstWijnenViewModel(
                        WijnServices.GetAllWijnen(qString));

        System.out.println(
                "na getallwijnen");

        HttpSession session = request.getSession();

        session.setAttribute(
                "ViewModel", vm);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("lijstWijnen.jsp");

        dispatcher.forward(request, response);
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
