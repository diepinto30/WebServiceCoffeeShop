
package webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSProduct", targetNamespace = "http://WebService/", wsdlLocation = "http://localhost:8081/WebServiceCoffeeShop/WSProduct?wsdl")
public class WSProduct_Service
    extends Service
{

    private final static URL WSPRODUCT_WSDL_LOCATION;
    private final static WebServiceException WSPRODUCT_EXCEPTION;
    private final static QName WSPRODUCT_QNAME = new QName("http://WebService/", "WSProduct");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/WebServiceCoffeeShop/WSProduct?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPRODUCT_WSDL_LOCATION = url;
        WSPRODUCT_EXCEPTION = e;
    }

    public WSProduct_Service() {
        super(__getWsdlLocation(), WSPRODUCT_QNAME);
    }

    public WSProduct_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPRODUCT_QNAME, features);
    }

    public WSProduct_Service(URL wsdlLocation) {
        super(wsdlLocation, WSPRODUCT_QNAME);
    }

    public WSProduct_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPRODUCT_QNAME, features);
    }

    public WSProduct_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSProduct_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSProduct
     */
    @WebEndpoint(name = "WSProductPort")
    public WSProduct getWSProductPort() {
        return super.getPort(new QName("http://WebService/", "WSProductPort"), WSProduct.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSProduct
     */
    @WebEndpoint(name = "WSProductPort")
    public WSProduct getWSProductPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebService/", "WSProductPort"), WSProduct.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPRODUCT_EXCEPTION!= null) {
            throw WSPRODUCT_EXCEPTION;
        }
        return WSPRODUCT_WSDL_LOCATION;
    }

}
