
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
@WebServiceClient(name = "WSSeller", targetNamespace = "http://WebService/", wsdlLocation = "http://localhost:8081/WebServiceCoffeeShop/WSSeller?wsdl")
public class WSSeller_Service
    extends Service
{

    private final static URL WSSELLER_WSDL_LOCATION;
    private final static WebServiceException WSSELLER_EXCEPTION;
    private final static QName WSSELLER_QNAME = new QName("http://WebService/", "WSSeller");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/WebServiceCoffeeShop/WSSeller?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSELLER_WSDL_LOCATION = url;
        WSSELLER_EXCEPTION = e;
    }

    public WSSeller_Service() {
        super(__getWsdlLocation(), WSSELLER_QNAME);
    }

    public WSSeller_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSELLER_QNAME, features);
    }

    public WSSeller_Service(URL wsdlLocation) {
        super(wsdlLocation, WSSELLER_QNAME);
    }

    public WSSeller_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSELLER_QNAME, features);
    }

    public WSSeller_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSSeller_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSSeller
     */
    @WebEndpoint(name = "WSSellerPort")
    public WSSeller getWSSellerPort() {
        return super.getPort(new QName("http://WebService/", "WSSellerPort"), WSSeller.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSSeller
     */
    @WebEndpoint(name = "WSSellerPort")
    public WSSeller getWSSellerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebService/", "WSSellerPort"), WSSeller.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSELLER_EXCEPTION!= null) {
            throw WSSELLER_EXCEPTION;
        }
        return WSSELLER_WSDL_LOCATION;
    }

}
