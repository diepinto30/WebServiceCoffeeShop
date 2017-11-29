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
import webservice.WSGestrionUser;

/**
 *
 * @author diego
 */
@WebServlet(name = "ClienteStr", urlPatterns = {"/ClienteStr"})
public class ClienteStr extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8081/WebServiceCoffeeShop/WSGestrionUser.wsdl")
    private WSGestrionUser service;

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
        String Email = request.getParameter("txtEmail");
        String phoneNumber = request.getParameter("txtPhoneNumbre");
        String Address = request.getParameter("txtAddress");
        
        insertClient(idCedula, Name, LastName, Email, phoneNumber, Address);
        
        String idCedulaM = request.getParameter("txtCedulaM");
        String NameM = request.getParameter("txtNombreM");
        String LastNameM = request.getParameter("txtApellidoM");
        String EmailM = request.getParameter("txtEmailM");
        String phoneNumberM = request.getParameter("txtPhoneNumbreM");
        String AddressM = request.getParameter("txtAddressM");
        updateCliente(idCedulaM, NameM, LastNameM, EmailM, phoneNumberM, AddressM);
        
        String idCedulaE = request.getParameter("txtCedulaE"); 
        deleteCliente(idCedulaE);
        
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

    private String deleteCliente(java.lang.String idClient) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSGestrionCoffeeShop port = service.getWSGestrionCoffeeShopPort();
        return port.deleteCliente(idClient);
    }

    private String insertClient(java.lang.String idClient, java.lang.String name, java.lang.String lastName, java.lang.String email, java.lang.String phoneNumber, java.lang.String address) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSGestrionCoffeeShop port = service.getWSGestrionCoffeeShopPort();
        return port.insertClient(idClient, name, lastName, email, phoneNumber, address);
    }

    private String updateCliente(java.lang.String idClient, java.lang.String name, java.lang.String lastName, java.lang.String email, java.lang.String phone, java.lang.String address) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSGestrionCoffeeShop port = service.getWSGestrionCoffeeShopPort();
        return port.updateCliente(idClient, name, lastName, email, phone, address);
    }


    
}