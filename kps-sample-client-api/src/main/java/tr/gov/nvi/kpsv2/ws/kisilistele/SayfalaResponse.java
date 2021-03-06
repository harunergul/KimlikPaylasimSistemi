
package tr.gov.nvi.kpsv2.ws.kisilistele;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SayfalaResult" type="{http://kps.nvi.gov.tr/2011/01/01}KisiListesiSonucu" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sayfalaResult"
})
@XmlRootElement(name = "SayfalaResponse")
public class SayfalaResponse
    implements Serializable
{

    @XmlElementRef(name = "SayfalaResult", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<KisiListesiSonucu> sayfalaResult;

    /**
     * Gets the value of the sayfalaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KisiListesiSonucu }{@code >}
     *     
     */
    public JAXBElement<KisiListesiSonucu> getSayfalaResult() {
        return sayfalaResult;
    }

    /**
     * Sets the value of the sayfalaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KisiListesiSonucu }{@code >}
     *     
     */
    public void setSayfalaResult(JAXBElement<KisiListesiSonucu> value) {
        this.sayfalaResult = value;
    }

}
