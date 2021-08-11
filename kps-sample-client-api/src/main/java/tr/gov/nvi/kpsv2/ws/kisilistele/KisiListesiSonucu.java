
package tr.gov.nvi.kpsv2.ws.kisilistele;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KisiListesiSonucu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiListesiSonucu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="SorguSonucu" type="{http://kps.nvi.gov.tr/2011/01/01}KisiListesi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiListesiSonucu", propOrder = {
    "hataBilgisi",
    "sorguSonucu"
})
public class KisiListesiSonucu
    implements Serializable
{

    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "SorguSonucu", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<KisiListesi> sorguSonucu;

    /**
     * Gets the value of the hataBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getHataBilgisi() {
        return hataBilgisi;
    }

    /**
     * Sets the value of the hataBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setHataBilgisi(JAXBElement<Parametre> value) {
        this.hataBilgisi = value;
    }

    /**
     * Gets the value of the sorguSonucu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KisiListesi }{@code >}
     *     
     */
    public JAXBElement<KisiListesi> getSorguSonucu() {
        return sorguSonucu;
    }

    /**
     * Sets the value of the sorguSonucu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KisiListesi }{@code >}
     *     
     */
    public void setSorguSonucu(JAXBElement<KisiListesi> value) {
        this.sorguSonucu = value;
    }

}
