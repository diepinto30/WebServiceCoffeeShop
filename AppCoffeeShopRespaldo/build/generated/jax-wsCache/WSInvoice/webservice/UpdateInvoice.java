
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UpdateInvoice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UpdateInvoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idInvoice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Date_of_issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idSeller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInvoice", propOrder = {
    "idInvoice",
    "dateOfIssue",
    "subTotal",
    "iva",
    "total",
    "idClient",
    "idSeller"
})
public class UpdateInvoice {

    protected int idInvoice;
    @XmlElement(name = "Date_of_issue")
    protected String dateOfIssue;
    @XmlElement(name = "SubTotal")
    protected double subTotal;
    @XmlElement(name = "IVA")
    protected double iva;
    @XmlElement(name = "Total")
    protected double total;
    protected String idClient;
    protected String idSeller;

    /**
     * Obtiene el valor de la propiedad idInvoice.
     * 
     */
    public int getIdInvoice() {
        return idInvoice;
    }

    /**
     * Define el valor de la propiedad idInvoice.
     * 
     */
    public void setIdInvoice(int value) {
        this.idInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad dateOfIssue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Define el valor de la propiedad dateOfIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfIssue(String value) {
        this.dateOfIssue = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotal.
     * 
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     * 
     */
    public void setSubTotal(double value) {
        this.subTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     */
    public double getIVA() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     */
    public void setIVA(double value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad idClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdClient() {
        return idClient;
    }

    /**
     * Define el valor de la propiedad idClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdClient(String value) {
        this.idClient = value;
    }

    /**
     * Obtiene el valor de la propiedad idSeller.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSeller() {
        return idSeller;
    }

    /**
     * Define el valor de la propiedad idSeller.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSeller(String value) {
        this.idSeller = value;
    }

}
