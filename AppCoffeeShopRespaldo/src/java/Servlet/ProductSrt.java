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
import webservice.WSProduct_Service;

/**
 *
 * @author diego
 */
@WebServlet(name = "ProductSrt", urlPatterns = {"/ProductSrt"})
public class ProductSrt extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8081/WebServiceCoffeeShop/WSProduct.wsdl")
    private WSProduct_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        String Name = request.getParameter("txtNombre");
        String UDisponibles = request.getParameter("txtUDisponibles");
        String Precio = request.getParameter("txtPrecio");
        String Des = request.getParameter("txtDes");
        //int idPro = Integer.parseInt(idCedula);
        float dbPrecio = Float.parseFloat(Precio);

        insertProduct(-1, Name, UDisponibles, dbPrecio, Des);

        String idCedulaM = request.getParameter("txtproductoM");
        String NameM = request.getParameter("txtNombreM");
        String LastNameM = request.getParameter("txtUDisponiblesM");
        String PrecioM = request.getParameter("txtPrecioM");
        String DesM = request.getParameter("txtDesM");
        int idProM = Integer.parseInt(idCedulaM);
        float dbPrecioM = Float.parseFloat(PrecioM);
        
        udapteProduct(idProM, NameM, LastNameM, dbPrecioM, DesM);
        
        //String txtProE = request.getParameter("txtProdE"); 
        //int idProE = Integer.parseInt(txtProE);
        //deleteProduct(idProE);
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

    private String deleteProduct(int idProduct) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSProduct port = service.getWSProductPort();
        return port.deleteProduct(idProduct);
    }

    private String insertProduct(int idProduct, java.lang.String nameProduct, java.lang.String unitsAvailable, float price, java.lang.String description) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSProduct port = service.getWSProductPort();
        return port.insertProduct(idProduct, nameProduct, unitsAvailable, price, description);
    }

    private String udapteProduct(int idProduct, java.lang.String nameProduct, java.lang.String unitsAvailable, float price, java.lang.String description) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.WSProduct port = service.getWSProductPort();
        return port.udapteProduct(idProduct, nameProduct, unitsAvailable, price, description);
    }

    
}
