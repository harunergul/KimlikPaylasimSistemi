
package tr.gov.nvi.kpsv2.ws.kisilistele;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b01 
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "KisiListeleServis", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01", wsdlLocation = "/tr/gov/nvi/kpsv2/ws/wsdl/KisiListeleServis.wsdl")
public class KisiListeleServis_Service
    extends Service
{

    private final static URL KISILISTELESERVIS_WSDL_LOCATION;
    private final static WebServiceException KISILISTELESERVIS_EXCEPTION;
    private final static QName KISILISTELESERVIS_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KisiListeleServis");

    static {
        KISILISTELESERVIS_WSDL_LOCATION = tr.gov.nvi.kpsv2.ws.kisilistele.KisiListeleServis_Service.class.getResource("/tr/gov/nvi/kpsv2/ws/wsdl/KisiListeleServis.wsdl");
        WebServiceException e = null;
        if (KISILISTELESERVIS_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/tr/gov/nvi/kpsv2/ws/wsdl/KisiListeleServis.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        KISILISTELESERVIS_EXCEPTION = e;
    }

    public KisiListeleServis_Service() {
        super(__getWsdlLocation(), KISILISTELESERVIS_QNAME);
    }

    public KisiListeleServis_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns KisiListeleServis
     */
    @WebEndpoint(name = "CustomBinding_KisiListeleServis")
    public KisiListeleServis getCustomBindingKisiListeleServis() {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2011/01/01", "CustomBinding_KisiListeleServis"), KisiListeleServis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KisiListeleServis
     */
    @WebEndpoint(name = "CustomBinding_KisiListeleServis")
    public KisiListeleServis getCustomBindingKisiListeleServis(WebServiceFeature... features) {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2011/01/01", "CustomBinding_KisiListeleServis"), KisiListeleServis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KISILISTELESERVIS_EXCEPTION!= null) {
            throw KISILISTELESERVIS_EXCEPTION;
        }
        return KISILISTELESERVIS_WSDL_LOCATION;
    }

}