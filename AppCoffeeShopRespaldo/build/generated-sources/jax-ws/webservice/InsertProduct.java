
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InsertProduct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsertProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NameProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Units_Available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertProduct", propOrder = {
    "idProduct",
    "nameProduct",
    "unitsAvailable",
    "price",
    "description"
})
public class InsertProduct {

    protected int idProduct;
    @XmlElement(name = "NameProduct")
    protected String nameProduct;
    @XmlElement(name = "Units_Available")
    protected String unitsAvailable;
    @XmlElement(name = "Price")
    protected float price;
    @XmlElement(name = "Description")
    protected String description;

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

    /**
     * Obtiene el valor de la propiedad nameProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * Define el valor de la propiedad nameProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProduct(String value) {
        this.nameProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad unitsAvailable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsAvailable() {
        return unitsAvailable;
    }

    /**
     * Define el valor de la propiedad unitsAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsAvailable(String value) {
        this.unitsAvailable = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
