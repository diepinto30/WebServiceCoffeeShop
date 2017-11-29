/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import webservice.WSSeller_Service;

/**
 *
 * @author diego
 */
@WebServlet(name = "SellerSrt", urlPatterns = {"/SellerSrt"})
public class SellerSrt extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8081/WebServiceCoffeeShop/WSSeller.wsdl")
    private WSSeller_Service service;

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
        
        String idCedula = request.getParameter("txtCedula");
        String Name = request.getParameter("txtNombre");
        String LastName = request.getParameter("txtApellido");
        String phoneNumber = request.getParameter("txtPhoneNumbre");
        
        insertSeller(idCedula, Name, LastName, phoneNumber);
        
        String idCedulaM = request.getParameter("txtCedulaM");
        String NameM = request.getParameter("txtNombreM");
        String LastNameM = request.getParameter("txtApellidoM");
        String phoneNumberM = request.getParameter("txtPhoneNumbreM");
        
        updateSeller(idCedulaM, NameM, LastNameM, phoneNumberM);
        
        String idCedulaE = request.getParameter("txtCedulaE"); 
        deleteSeller(idCedulaE);
        
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

    private String deleteSeller(java.lang.String idSeller) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSSeller port = service.getWSSellerPort();
        return port.deleteSeller(idSeller);
    }

    private String insertSeller(java.lang.String idSeller, java.lang.String name, java.lang.String lastName, java.lang.String phoneNumber) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSSeller port = service.getWSSellerPort();
        return port.insertSeller(idSeller, name, lastName, phoneNumber);
    }

    private String updateSeller(java.lang.String idSeller, java.lang.String name, java.lang.String lastName, java.lang.String phoneNumber) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSSeller port = service.getWSSellerPort();
        return port.updateSeller(idSeller, name, lastName, phoneNumber);
    }

    
    
}
