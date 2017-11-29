
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

    private final static QName _DeleteSeller_QNAME = new QName("http://WebService/", "DeleteSeller");
    private final static QName _DeleteSellerResponse_QNAME = new QName("http://WebService/", "DeleteSellerResponse");
    private final static QName _InsertSeller_QNAME = new QName("http://WebService/", "InsertSeller");
    private final static QName _InsertSellerResponse_QNAME = new QName("http://WebService/", "InsertSellerResponse");
    private final static QName _UpdateSeller_QNAME = new QName("http://WebService/", "UpdateSeller");
    private final static QName _UpdateSellerResponse_QNAME = new QName("http://WebService/", "UpdateSellerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteSeller }
     * 
     */
    public DeleteSeller createDeleteSeller() {
        return new DeleteSeller();
    }

    /**
     * Create an instance of {@link DeleteSellerResponse }
     * 
     */
    public DeleteSellerResponse createDeleteSellerResponse() {
        return new DeleteSellerResponse();
    }

    /**
     * Create an instance of {@link InsertSeller }
     * 
     */
    public InsertSeller createInsertSeller() {
        return new InsertSeller();
    }

    /**
     * Create an instance of {@link InsertSellerResponse }
     * 
     */
    public InsertSellerResponse createInsertSellerResponse() {
        return new InsertSellerResponse();
    }

    /**
     * Create an instance of {@link UpdateSeller }
     * 
     */
    public UpdateSeller createUpdateSeller() {
        return new UpdateSeller();
    }

    /**
     * Create an instance of {@link UpdateSellerResponse }
     * 
     */
    public UpdateSellerResponse createUpdateSellerResponse() {
        return new UpdateSellerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSeller }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "DeleteSeller")
    public JAXBElement<DeleteSeller> createDeleteSeller(DeleteSeller value) {
        return new JAXBElement<DeleteSeller>(_DeleteSeller_QNAME, DeleteSeller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSellerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "DeleteSellerResponse")
    public JAXBElement<DeleteSellerResponse> createDeleteSellerResponse(DeleteSellerResponse value) {
        return new JAXBElement<DeleteSellerResponse>(_DeleteSellerResponse_QNAME, DeleteSellerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSeller }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "InsertSeller")
    public JAXBElement<InsertSeller> createInsertSeller(InsertSeller value) {
        return new JAXBElement<InsertSeller>(_InsertSeller_QNAME, InsertSeller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSellerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "InsertSellerResponse")
    public JAXBElement<InsertSellerResponse> createInsertSellerResponse(InsertSellerResponse value) {
        return new JAXBElement<InsertSellerResponse>(_InsertSellerResponse_QNAME, InsertSellerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSeller }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "UpdateSeller")
    public JAXBElement<UpdateSeller> createUpdateSeller(UpdateSeller value) {
        return new JAXBElement<UpdateSeller>(_UpdateSeller_QNAME, UpdateSeller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSellerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "UpdateSellerResponse")
    public JAXBElement<UpdateSellerResponse> createUpdateSellerResponse(UpdateSellerResponse value) {
        return new JAXBElement<UpdateSellerResponse>(_UpdateSellerResponse_QNAME, UpdateSellerResponse.class, null, value);
    }

}
