
package tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno;

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
 *         &lt;element name="kriterListesi" type="{http://kps.nvi.gov.tr/2011/01/01}ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri" minOccurs="0"/>
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
    "kriterListesi"
})
@XmlRootElement(name = "Sorgula")
public class Sorgula
    implements Serializable
{

    @XmlElementRef(name = "kriterListesi", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri> kriterListesi;

    /**
     * Gets the value of the kriterListesi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri> getKriterListesi() {
        return kriterListesi;
    }

    /**
     * Sets the value of the kriterListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri }{@code >}
     *     
     */
    public void setKriterListesi(JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri> value) {
        this.kriterListesi = value;
    }

}
