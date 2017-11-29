
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
@WebServiceClient(name = "WSGestrionUser", targetNamespace = "http://WebService/", wsdlLocation = "http://localhost:8081/WebServiceCoffeeShop/WSGestrionUser?wsdl")
public class WSGestrionUser
    extends Service
{

    private final static URL WSGESTRIONUSER_WSDL_LOCATION;
    private final static WebServiceException WSGESTRIONUSER_EXCEPTION;
    private final static QName WSGESTRIONUSER_QNAME = new QName("http://WebService/", "WSGestrionUser");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/WebServiceCoffeeShop/WSGestrionUser?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSGESTRIONUSER_WSDL_LOCATION = url;
        WSGESTRIONUSER_EXCEPTION = e;
    }

    public WSGestrionUser() {
        super(__getWsdlLocation(), WSGESTRIONUSER_QNAME);
    }

    public WSGestrionUser(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSGESTRIONUSER_QNAME, features);
    }

    public WSGestrionUser(URL wsdlLocation) {
        super(wsdlLocation, WSGESTRIONUSER_QNAME);
    }

    public WSGestrionUser(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSGESTRIONUSER_QNAME, features);
    }

    public WSGestrionUser(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSGestrionUser(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSGestrionCoffeeShop
     */
    @WebEndpoint(name = "WSGestrionCoffeeShopPort")
    public WSGestrionCoffeeShop getWSGestrionCoffeeShopPort() {
        return super.getPort(new QName("http://WebService/", "WSGestrionCoffeeShopPort"), WSGestrionCoffeeShop.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSGestrionCoffeeShop
     */
    @WebEndpoint(name = "WSGestrionCoffeeShopPort")
    public WSGestrionCoffeeShop getWSGestrionCoffeeShopPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebService/", "WSGestrionCoffeeShopPort"), WSGestrionCoffeeShop.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSGESTRIONUSER_EXCEPTION!= null) {
            throw WSGESTRIONUSER_EXCEPTION;
        }
        return WSGESTRIONUSER_WSDL_LOCATION;
    }

}
