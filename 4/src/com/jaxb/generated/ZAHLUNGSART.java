//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.10 at 12:46:46 AM CEST 
//


package com.jaxb.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}KONTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}BITCOIN" minOccurs="0"/>
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
    "konto",
    "bitcoin"
})
@XmlRootElement(name = "ZAHLUNGSART")
public class ZAHLUNGSART {

    @XmlElement(name = "KONTO", required = true)
    protected List<KONTO> konto;
    @XmlElement(name = "BITCOIN")
    protected String bitcoin;

    /**
     * Gets the value of the konto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the konto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKONTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KONTO }
     * 
     * 
     */
    public List<KONTO> getKONTO() {
        if (konto == null) {
            konto = new ArrayList<KONTO>();
        }
        return this.konto;
    }

    /**
     * Gets the value of the bitcoin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBITCOIN() {
        return bitcoin;
    }

    /**
     * Sets the value of the bitcoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBITCOIN(String value) {
        this.bitcoin = value;
    }

}