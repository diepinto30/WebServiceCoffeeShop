
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteProduct_QNAME = new QName("http://WebService/", "DeleteProduct");
    private final static QName _DeleteProductResponse_QNAME = new QName("http://WebService/", "DeleteProductResponse");
    private final static QName _InsertProduct_QNAME = new QName("http://WebService/", "InsertProduct");
    private final static QName _InsertProductResponse_QNAME = new QName("http://WebService/", "InsertProductResponse");
    private final static QName _UdapteProduct_QNAME = new QName("http://WebService/", "UdapteProduct");
    private final static QName _UdapteProductResponse_QNAME = new QName("http://WebService/", "UdapteProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link InsertProduct }
     * 
     */
    public InsertProduct createInsertProduct() {
        return new InsertProduct();
    }

    /**
     * Create an instance of {@link InsertProductResponse }
     * 
     */
    public InsertProductResponse createInsertProductResponse() {
        return new InsertProductResponse();
    }

    /**
     * Create an instance of {@link UdapteProduct }
     * 
     */
    public UdapteProduct createUdapteProduct() {
        return new UdapteProduct();
    }

    /**
     * Create an instance of {@link UdapteProductResponse }
     * 
     */
    public UdapteProductResponse createUdapteProductResponse() {
        return new UdapteProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "DeleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<DeleteProduct>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "DeleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<DeleteProductResponse>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "InsertProduct")
    public JAXBElement<InsertProduct> createInsertProduct(InsertProduct value) {
        return new JAXBElement<InsertProduct>(_InsertProduct_QNAME, InsertProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "InsertProductResponse")
    public JAXBElement<InsertProductResponse> createInsertProductResponse(InsertProductResponse value) {
        return new JAXBElement<InsertProductResponse>(_InsertProductResponse_QNAME, InsertProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UdapteProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "UdapteProduct")
    public JAXBElement<UdapteProduct> createUdapteProduct(UdapteProduct value) {
        return new JAXBElement<UdapteProduct>(_UdapteProduct_QNAME, UdapteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UdapteProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "UdapteProductResponse")
    public JAXBElement<UdapteProductResponse> createUdapteProductResponse(UdapteProductResponse value) {
        return new JAXBElement<UdapteProductResponse>(_UdapteProductResponse_QNAME, UdapteProductResponse.class, null, value);
    }

}
