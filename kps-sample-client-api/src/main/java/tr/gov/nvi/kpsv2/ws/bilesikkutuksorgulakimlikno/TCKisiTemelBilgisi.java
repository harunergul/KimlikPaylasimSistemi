
package tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCKisiTemelBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCKisiTemelBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnneAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BabaAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cinsiyet" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="DogumTarih" type="{http://kps.nvi.gov.tr/2011/01/01}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="DogumYer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCKisiTemelBilgisi", propOrder = {
    "ad",
    "anneAd",
    "babaAd",
    "cinsiyet",
    "dogumTarih",
    "dogumYer",
    "soyad"
})
public class TCKisiTemelBilgisi
    implements Serializable
{

    @XmlElementRef(name = "Ad", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<String> ad;
    @XmlElementRef(name = "AnneAd", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<String> anneAd;
    @XmlElementRef(name = "BabaAd", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<String> babaAd;
    @XmlElementRef(name = "Cinsiyet", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Parametre> cinsiyet;
    @XmlElementRef(name = "DogumTarih", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<TarihBilgisi> dogumTarih;
    @XmlElementRef(name = "DogumYer", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<String> dogumYer;
    @XmlElementRef(name = "Soyad", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<String> soyad;

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd(JAXBElement<String> value) {
        this.ad = value;
    }

    /**
     * Gets the value of the anneAd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnneAd() {
        return anneAd;
    }

    /**
     * Sets the value of the anneAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnneAd(JAXBElement<String> value) {
        this.anneAd = value;
    }

    /**
     * Gets the value of the babaAd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBabaAd() {
        return babaAd;
    }

    /**
     * Sets the value of the babaAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBabaAd(JAXBElement<String> value) {
        this.babaAd = value;
    }

    /**
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getCinsiyet() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setCinsiyet(JAXBElement<Parametre> value) {
        this.cinsiyet = value;
    }

    /**
     * Gets the value of the dogumTarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}
     *     
     */
    public JAXBElement<TarihBilgisi> getDogumTarih() {
        return dogumTarih;
    }

    /**
     * Sets the value of the dogumTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}
     *     
     */
    public void setDogumTarih(JAXBElement<TarihBilgisi> value) {
        this.dogumTarih = value;
    }

    /**
     * Gets the value of the dogumYer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDogumYer() {
        return dogumYer;
    }

    /**
     * Sets the value of the dogumYer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDogumYer(JAXBElement<String> value) {
        this.dogumYer = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSoyad(JAXBElement<String> value) {
        this.soyad = value;
    }

}
