
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MaMInvoiceProductInsert complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MaMInvoiceProductInsert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idInvoice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaMInvoiceProductInsert", propOrder = {
    "idInvoice",
    "idProduct"
})
public class MaMInvoiceProductInsert {

    protected int idInvoice;
    protected int idProduct;

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
     * Obtiene el valor de la propiedad idProduct.
     * 
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * Define el valor de la propiedad idProduct.
     * 
     */
    public void setIdProduct(int value) {
        this.idProduct = value;
    }

}
