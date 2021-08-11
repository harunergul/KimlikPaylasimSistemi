
package tr.gov.nvi.kpsv2.ws.kisilistele;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KisiListeleSorguKriteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiListeleSorguKriteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaslangicTarih" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BitisTarih" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Cinsiyet" type="{http://kps.nvi.gov.tr/2011/01/01}CstCinsiyet" minOccurs="0"/>
 *         &lt;element name="Ilce" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SayfaAnahtari" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiListeleSorguKriteri", propOrder = {
    "baslangicTarih",
    "bitisTarih",
    "cinsiyet",
    "ilce",
    "sayfaAnahtari"
})
public class KisiListeleSorguKriteri
    implements Serializable
{

    @XmlElementRef(name = "BaslangicTarih", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> baslangicTarih;
    @XmlElementRef(name = "BitisTarih", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> bitisTarih;
    @XmlElementRef(name = "Cinsiyet", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<CstCinsiyet> cinsiyet;
    @XmlElementRef(name = "Ilce", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Integer> ilce;
    @XmlElementRef(name = "SayfaAnahtari", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Long> sayfaAnahtari;

    /**
     * Gets the value of the baslangicTarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaslangicTarih() {
        return baslangicTarih;
    }

    /**
     * Sets the value of the baslangicTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaslangicTarih(JAXBElement<XMLGregorianCalendar> value) {
        this.baslangicTarih = value;
    }

    /**
     * Gets the value of the bitisTarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBitisTarih() {
        return bitisTarih;
    }

    /**
     * Sets the value of the bitisTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBitisTarih(JAXBElement<XMLGregorianCalendar> value) {
        this.bitisTarih = value;
    }

    /**
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CstCinsiyet }{@code >}
     *     
     */
    public JAXBElement<CstCinsiyet> getCinsiyet() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CstCinsiyet }{@code >}
     *     
     */
    public void setCinsiyet(JAXBElement<CstCinsiyet> value) {
        this.cinsiyet = value;
    }

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIlce(JAXBElement<Integer> value) {
        this.ilce = value;
    }

    /**
     * Gets the value of the sayfaAnahtari property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSayfaAnahtari() {
        return sayfaAnahtari;
    }

    /**
     * Sets the value of the sayfaAnahtari property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSayfaAnahtari(JAXBElement<Long> value) {
        this.sayfaAnahtari = value;
    }

}
