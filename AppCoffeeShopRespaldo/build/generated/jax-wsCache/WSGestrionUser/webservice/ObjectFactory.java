
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

    private final static QName _DeleteCliente_QNAME = new QName("http://WebService/", "DeleteCliente");
    private final static QName _DeleteClienteResponse_QNAME = new QName("http://WebService/", "DeleteClienteResponse");
    private final static QName _InsertClient_QNAME = new QName("http://WebService/", "InsertClient");
    private final static QName _InsertClientResponse_QNAME = new QName("http://WebService/", "InsertClientResponse");
    private final static QName _UpdateCliente_QNAME = new QName("http://WebService/", "UpdateCliente");
    private final static QName _UpdateClienteResponse_QNAME = new QName("http://WebService/", "UpdateClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteCliente }
     * 
     */
    public DeleteCliente createDeleteCliente() {
        return new DeleteCliente();
    }

    /**
     * Create an instance of {@link DeleteClienteResponse }
     * 
     */
    public DeleteClienteResponse createDeleteClienteResponse() {
        return new DeleteClienteResponse();
    }

    /**
     * Create an instance of {@link InsertClient }
     * 
     */
    public InsertClient createInsertClient() {
        return new InsertClient();
    }

    /**
     * Create an instance of {@link InsertClientResponse }
     * 
     */
    public InsertClientResponse createInsertClientResponse() {
        return new InsertClientResponse();
    }

    /**
     * Create an instance of {@link UpdateCliente }
     * 
     */
    public UpdateCliente createUpdateCliente() {
        return new UpdateCliente();
    }

    /**
     * Create an instance of {@link UpdateClienteResponse }
     * 
     */
    public UpdateClienteResponse createUpdateClienteResponse() {
        return new UpdateClienteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "DeleteCliente")
    public JAXBElement<DeleteCliente> createDeleteCliente(DeleteCliente value) {
        return new JAXBElement<DeleteCliente>(_DeleteCliente_QNAME, DeleteCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "DeleteClienteResponse")
    public JAXBElement<DeleteClienteResponse> createDeleteClienteResponse(DeleteClienteResponse value) {
        return new JAXBElement<DeleteClienteResponse>(_DeleteClienteResponse_QNAME, DeleteClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "InsertClient")
    public JAXBElement<InsertClient> createInsertClient(InsertClient value) {
        return new JAXBElement<InsertClient>(_InsertClient_QNAME, InsertClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "InsertClientResponse")
    public JAXBElement<InsertClientResponse> createInsertClientResponse(InsertClientResponse value) {
        return new JAXBElement<InsertClientResponse>(_InsertClientResponse_QNAME, InsertClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "UpdateCliente")
    public JAXBElement<UpdateCliente> createUpdateCliente(UpdateCliente value) {
        return new JAXBElement<UpdateCliente>(_UpdateCliente_QNAME, UpdateCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "UpdateClienteResponse")
    public JAXBElement<UpdateClienteResponse> createUpdateClienteResponse(UpdateClienteResponse value) {
        return new JAXBElement<UpdateClienteResponse>(_UpdateClienteResponse_QNAME, UpdateClienteResponse.class, null, value);
    }

}
