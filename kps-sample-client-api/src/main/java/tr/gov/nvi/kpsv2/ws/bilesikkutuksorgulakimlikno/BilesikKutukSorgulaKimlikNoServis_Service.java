
package tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno;

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
@WebServiceClient(name = "BilesikKutukSorgulaKimlikNoServis", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01", wsdlLocation = "/tr/gov/nvi/kpsv2/ws/wsdl/BilesikKutukSorgulaKimlikNoServis.wsdl")
public class BilesikKutukSorgulaKimlikNoServis_Service
    extends Service
{

    private final static URL BILESIKKUTUKSORGULAKIMLIKNOSERVIS_WSDL_LOCATION;
    private final static WebServiceException BILESIKKUTUKSORGULAKIMLIKNOSERVIS_EXCEPTION;
    private final static QName BILESIKKUTUKSORGULAKIMLIKNOSERVIS_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "BilesikKutukSorgulaKimlikNoServis");

    static {
        BILESIKKUTUKSORGULAKIMLIKNOSERVIS_WSDL_LOCATION = tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.BilesikKutukSorgulaKimlikNoServis_Service.class.getResource("/tr/gov/nvi/kpsv2/ws/wsdl/BilesikKutukSorgulaKimlikNoServis.wsdl");
        WebServiceException e = null;
        if (BILESIKKUTUKSORGULAKIMLIKNOSERVIS_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/tr/gov/nvi/kpsv2/ws/wsdl/BilesikKutukSorgulaKimlikNoServis.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        BILESIKKUTUKSORGULAKIMLIKNOSERVIS_EXCEPTION = e;
    }

    public BilesikKutukSorgulaKimlikNoServis_Service() {
        super(__getWsdlLocation(), BILESIKKUTUKSORGULAKIMLIKNOSERVIS_QNAME);
    }

    public BilesikKutukSorgulaKimlikNoServis_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns BilesikKutukSorgulaKimlikNoServis
     */
    @WebEndpoint(name = "CustomBinding_BilesikKutukSorgulaKimlikNoServis")
    public BilesikKutukSorgulaKimlikNoServis getCustomBindingBilesikKutukSorgulaKimlikNoServis() {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2011/01/01", "CustomBinding_BilesikKutukSorgulaKimlikNoServis"), BilesikKutukSorgulaKimlikNoServis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BilesikKutukSorgulaKimlikNoServis
     */
    @WebEndpoint(name = "CustomBinding_BilesikKutukSorgulaKimlikNoServis")
    public BilesikKutukSorgulaKimlikNoServis getCustomBindingBilesikKutukSorgulaKimlikNoServis(WebServiceFeature... features) {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2011/01/01", "CustomBinding_BilesikKutukSorgulaKimlikNoServis"), BilesikKutukSorgulaKimlikNoServis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BILESIKKUTUKSORGULAKIMLIKNOSERVIS_EXCEPTION!= null) {
            throw BILESIKKUTUKSORGULAKIMLIKNOSERVIS_EXCEPTION;
        }
        return BILESIKKUTUKSORGULAKIMLIKNOSERVIS_WSDL_LOCATION;
    }

}
