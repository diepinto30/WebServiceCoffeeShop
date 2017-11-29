
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

    private final static QName _Delete_QNAME = new QName("http://WebService/", "Delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://WebService/", "DeleteResponse");
    private final static QName _InsertInvoice_QNAME = new QName("http://WebService/", "InsertInvoice");
    private final static QName _InsertInvoiceResponse_QNAME = new QName("http://WebService/", "InsertInvoiceResponse");
    private final static QName _MaMInvoiceProductDelete_QNAME = new QName("http://WebService/", "MaMInvoiceProductDelete");
    private final static QName _MaMInvoiceProductDeleteResponse_QNAME = new QName("http://WebService/", "MaMInvoiceProductDeleteResponse");
    private final static QName _MaMInvoiceProductInsert_QNAME = new QName("http://WebService/", "MaMInvoiceProductInsert");
    private final static QName _MaMInvoiceProductInsertResponse_QNAME = new QName("http://WebService/", "MaMInvoiceProductInsertResponse");
    private final static QName _MaMInvoiceProductUpdate_QNAME = new QName("http://WebService/", "MaMInvoiceProductUpdate");
    private final static QName _MaMInvoiceProductUpdateResponse_QNAME = new QName("http://WebService/", "MaMInvoiceProductUpdateResponse");
    private final static QName _UpdateInvoice_QNAME = new QName("http://WebService/", "UpdateInvoice");
    private final static QName _UpdateInvoiceResponse_QNAME = new QName("http://WebService/", "UpdateInvoiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link InsertInvoice }
     * 
     */
    public InsertInvoice createInsertInvoice() {
        return new InsertInvoice();
    }

    /**
     * Create an instance of {@link InsertInvoiceResponse }
     * 
     */
    public InsertInvoiceResponse createInsertInvoiceResponse() {
        return new InsertInvoiceResponse();
    }

    /**
     * Create an instance of {@link MaMInvoiceProductDelete }
     * 
     */
    public MaMInvoiceProductDelete createMaMInvoiceProductDelete() {
        return new MaMInvoiceProductDelete();
    }

    /**
     * Create an instance of {@link MaMInvoiceProductDeleteResponse }
     * 
     */
    public MaMInvoiceProductDeleteResponse createMaMInvoiceProductDeleteResponse() {
        return new MaMInvoiceProductDeleteResponse();
    }

    /**
     * Create an instance of {@link MaMInvoiceProductInsert }
     * 
     */
    public MaMInvoiceProductInsert createMaMInvoiceProductInsert() {
        return new MaMInvoiceProductInsert();
    }

    /**
     * Create an instance of {@link MaMInvoiceProductInsertResponse }
     * 
     */
    public MaMInvoiceProductInsertResponse createMaMInvoiceProductInsertResponse() {
        return new MaMInvoiceProductInsertResponse();
    }

    /**
     * Create an instance of {@link MaMInvoiceProductUpdate }
     * 
     */
    public MaMInvoiceProductUpdate createMaMInvoiceProductUpdate() {
        return new MaMInvoiceProductUpdate();
    }

    /**
     * Create an instance of {@link MaMInvoiceProductUpdateResponse }
     * 
     */
    public MaMInvoiceProductUpdateResponse createMaMInvoiceProductUpdateResponse() {
        return new MaMInvoiceProductUpdateResponse();
    }

    /**
     * Create an instance of {@link UpdateInvoice }
     * 
     */
    public UpdateInvoice createUpdateInvoice() {
        return new UpdateInvoice();
    }

    /**
     * Create an instance of {@link UpdateInvoiceResponse }
     * 
     */
    public UpdateInvoiceResponse createUpdateInvoiceResponse() {
        return new UpdateInvoiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "DeleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertInvoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "InsertInvoice")
    public JAXBElement<InsertInvoice> createInsertInvoice(InsertInvoice value) {
        return new JAXBElement<InsertInvoice>(_InsertInvoice_QNAME, InsertInvoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertInvoiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "InsertInvoiceResponse")
    public JAXBElement<InsertInvoiceResponse> createInsertInvoiceResponse(InsertInvoiceResponse value) {
        return new JAXBElement<InsertInvoiceResponse>(_InsertInvoiceResponse_QNAME, InsertInvoiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaMInvoiceProductDelete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "MaMInvoiceProductDelete")
    public JAXBElement<MaMInvoiceProductDelete> createMaMInvoiceProductDelete(MaMInvoiceProductDelete value) {
        return new JAXBElement<MaMInvoiceProductDelete>(_MaMInvoiceProductDelete_QNAME, MaMInvoiceProductDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaMInvoiceProductDeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "MaMInvoiceProductDeleteResponse")
    public JAXBElement<MaMInvoiceProductDeleteResponse> createMaMInvoiceProductDeleteResponse(MaMInvoiceProductDeleteResponse value) {
        return new JAXBElement<MaMInvoiceProductDeleteResponse>(_MaMInvoiceProductDeleteResponse_QNAME, MaMInvoiceProductDeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaMInvoiceProductInsert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "MaMInvoiceProductInsert")
    public JAXBElement<MaMInvoiceProductInsert> createMaMInvoiceProductInsert(MaMInvoiceProductInsert value) {
        return new JAXBElement<MaMInvoiceProductInsert>(_MaMInvoiceProductInsert_QNAME, MaMInvoiceProductInsert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaMInvoiceProductInsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "MaMInvoiceProductInsertResponse")
    public JAXBElement<MaMInvoiceProductInsertResponse> createMaMInvoiceProductInsertResponse(MaMInvoiceProductInsertResponse value) {
        return new JAXBElement<MaMInvoiceProductInsertResponse>(_MaMInvoiceProductInsertResponse_QNAME, MaMInvoiceProductInsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaMInvoiceProductUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "MaMInvoiceProductUpdate")
    public JAXBElement<MaMInvoiceProductUpdate> createMaMInvoiceProductUpdate(MaMInvoiceProductUpdate value) {
        return new JAXBElement<MaMInvoiceProductUpdate>(_MaMInvoiceProductUpdate_QNAME, MaMInvoiceProductUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaMInvoiceProductUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "MaMInvoiceProductUpdateResponse")
    public JAXBElement<MaMInvoiceProductUpdateResponse> createMaMInvoiceProductUpdateResponse(MaMInvoiceProductUpdateResponse value) {
        return new JAXBElement<MaMInvoiceProductUpdateResponse>(_MaMInvoiceProductUpdateResponse_QNAME, MaMInvoiceProductUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInvoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "UpdateInvoice")
    public JAXBElement<UpdateInvoice> createUpdateInvoice(UpdateInvoice value) {
        return new JAXBElement<UpdateInvoice>(_UpdateInvoice_QNAME, UpdateInvoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInvoiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "UpdateInvoiceResponse")
    public JAXBElement<UpdateInvoiceResponse> createUpdateInvoiceResponse(UpdateInvoiceResponse value) {
        return new JAXBElement<UpdateInvoiceResponse>(_UpdateInvoiceResponse_QNAME, UpdateInvoiceResponse.class, null, value);
    }

}
