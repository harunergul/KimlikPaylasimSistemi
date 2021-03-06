
package tr.gov.nvi.kpsv2.ws.aksokutumil;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AksOkuTumIlServis", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01", wsdlLocation = "/tr/gov/nvi/kpsv2/ws/wsdl/AksOkuTumIlServis.wsdl")
public class AksOkuTumIlServis_Service
    extends Service
{

    private final static URL AKSOKUTUMILSERVIS_WSDL_LOCATION;
    private final static WebServiceException AKSOKUTUMILSERVIS_EXCEPTION;
    private final static QName AKSOKUTUMILSERVIS_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "AksOkuTumIlServis");

    static {
        AKSOKUTUMILSERVIS_WSDL_LOCATION = tr.gov.nvi.kpsv2.ws.aksokutumil.AksOkuTumIlServis_Service.class.getResource("/tr/gov/nvi/kpsv2/ws/wsdl/AksOkuTumIlServis.wsdl");
        WebServiceException e = null;
        if (AKSOKUTUMILSERVIS_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/tr/gov/nvi/kpsv2/ws/wsdl/AksOkuTumIlServis.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        AKSOKUTUMILSERVIS_EXCEPTION = e;
    }

    public AksOkuTumIlServis_Service() {
        super(__getWsdlLocation(), AKSOKUTUMILSERVIS_QNAME);
    }

    public AksOkuTumIlServis_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AksOkuTumIlServis
     */
    @WebEndpoint(name = "CustomBinding_AksOkuTumIlServis")
    public AksOkuTumIlServis getCustomBindingAksOkuTumIlServis() {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2011/01/01", "CustomBinding_AksOkuTumIlServis"), AksOkuTumIlServis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AksOkuTumIlServis
     */
    @WebEndpoint(name = "CustomBinding_AksOkuTumIlServis")
    public AksOkuTumIlServis getCustomBindingAksOkuTumIlServis(WebServiceFeature... features) {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2011/01/01", "CustomBinding_AksOkuTumIlServis"), AksOkuTumIlServis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AKSOKUTUMILSERVIS_EXCEPTION!= null) {
            throw AKSOKUTUMILSERVIS_EXCEPTION;
        }
        return AKSOKUTUMILSERVIS_WSDL_LOCATION;
    }

}
