
package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSInvoice", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSInvoice {


    /**
     * 
     * @param idInvoice
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Delete")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Delete", targetNamespace = "http://WebService/", className = "webservice.Delete")
    @ResponseWrapper(localName = "DeleteResponse", targetNamespace = "http://WebService/", className = "webservice.DeleteResponse")
    @Action(input = "http://WebService/WSInvoice/DeleteRequest", output = "http://WebService/WSInvoice/DeleteResponse")
    public String delete(
        @WebParam(name = "idInvoice", targetNamespace = "")
        int idInvoice);

    /**
     * 
     * @param total
     * @param idClient
     * @param idSeller
     * @param iva
     * @param idInvoice
     * @param subTotal
     * @param dateOfIssue
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InsertInvoice")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "InsertInvoice", targetNamespace = "http://WebService/", className = "webservice.InsertInvoice")
    @ResponseWrapper(localName = "InsertInvoiceResponse", targetNamespace = "http://WebService/", className = "webservice.InsertInvoiceResponse")
    @Action(input = "http://WebService/WSInvoice/InsertInvoiceRequest", output = "http://WebService/WSInvoice/InsertInvoiceResponse")
    public String insertInvoice(
        @WebParam(name = "idInvoice", targetNamespace = "")
        int idInvoice,
        @WebParam(name = "Date_of_issue", targetNamespace = "")
        String dateOfIssue,
        @WebParam(name = "SubTotal", targetNamespace = "")
        double subTotal,
        @WebParam(name = "IVA", targetNamespace = "")
        double iva,
        @WebParam(name = "Total", targetNamespace = "")
        double total,
        @WebParam(name = "idClient", targetNamespace = "")
        String idClient,
        @WebParam(name = "idSeller", targetNamespace = "")
        String idSeller);

    /**
     * 
     * @param total
     * @param idClient
     * @param idSeller
     * @param iva
     * @param idInvoice
     * @param subTotal
     * @param dateOfIssue
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpdateInvoice")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpdateInvoice", targetNamespace = "http://WebService/", className = "webservice.UpdateInvoice")
    @ResponseWrapper(localName = "UpdateInvoiceResponse", targetNamespace = "http://WebService/", className = "webservice.UpdateInvoiceResponse")
    @Action(input = "http://WebService/WSInvoice/UpdateInvoiceRequest", output = "http://WebService/WSInvoice/UpdateInvoiceResponse")
    public String updateInvoice(
        @WebParam(name = "idInvoice", targetNamespace = "")
        int idInvoice,
        @WebParam(name = "Date_of_issue", targetNamespace = "")
        String dateOfIssue,
        @WebParam(name = "SubTotal", targetNamespace = "")
        double subTotal,
        @WebParam(name = "IVA", targetNamespace = "")
        double iva,
        @WebParam(name = "Total", targetNamespace = "")
        double total,
        @WebParam(name = "idClient", targetNamespace = "")
        String idClient,
        @WebParam(name = "idSeller", targetNamespace = "")
        String idSeller);

    /**
     * 
     * @param idInvoice
     * @param idProduct
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MaMInvoiceProductInsert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "MaMInvoiceProductInsert", targetNamespace = "http://WebService/", className = "webservice.MaMInvoiceProductInsert")
    @ResponseWrapper(localName = "MaMInvoiceProductInsertResponse", targetNamespace = "http://WebService/", className = "webservice.MaMInvoiceProductInsertResponse")
    @Action(input = "http://WebService/WSInvoice/MaMInvoiceProductInsertRequest", output = "http://WebService/WSInvoice/MaMInvoiceProductInsertResponse")
    public String maMInvoiceProductInsert(
        @WebParam(name = "idInvoice", targetNamespace = "")
        int idInvoice,
        @WebParam(name = "idProduct", targetNamespace = "")
        int idProduct);

    /**
     * 
     * @param idInvoice
     * @param idProduct
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MaMInvoiceProductUpdate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "MaMInvoiceProductUpdate", targetNamespace = "http://WebService/", className = "webservice.MaMInvoiceProductUpdate")
    @ResponseWrapper(localName = "MaMInvoiceProductUpdateResponse", targetNamespace = "http://WebService/", className = "webservice.MaMInvoiceProductUpdateResponse")
    @Action(input = "http://WebService/WSInvoice/MaMInvoiceProductUpdateRequest", output = "http://WebService/WSInvoice/MaMInvoiceProductUpdateResponse")
    public String maMInvoiceProductUpdate(
        @WebParam(name = "idInvoice", targetNamespace = "")
        int idInvoice,
        @WebParam(name = "idProduct", targetNamespace = "")
        int idProduct);

    /**
     * 
     * @param idInvoice
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MaMInvoiceProductDelete")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "MaMInvoiceProductDelete", targetNamespace = "http://WebService/", className = "webservice.MaMInvoiceProductDelete")
    @ResponseWrapper(localName = "MaMInvoiceProductDeleteResponse", targetNamespace = "http://WebService/", className = "webservice.MaMInvoiceProductDeleteResponse")
    @Action(input = "http://WebService/WSInvoice/MaMInvoiceProductDeleteRequest", output = "http://WebService/WSInvoice/MaMInvoiceProductDeleteResponse")
    public String maMInvoiceProductDelete(
        @WebParam(name = "idInvoice", targetNamespace = "")
        int idInvoice);

}
