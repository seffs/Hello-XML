//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.10 at 12:46:46 AM CEST 
//


package com.jaxb.generated;

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
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}ANZAHL"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}EINHEIT" minOccurs="0"/>
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
    "anzahl",
    "einheit"
})
@XmlRootElement(name = "MENGE")
public class MENGE {

    @XmlElement(name = "ANZAHL", required = true)
    protected String anzahl;
    @XmlElement(name = "EINHEIT")
    protected String einheit;

    /**
     * Gets the value of the anzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZAHL() {
        return anzahl;
    }

    /**
     * Sets the value of the anzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZAHL(String value) {
        this.anzahl = value;
    }

    /**
     * Gets the value of the einheit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEINHEIT() {
        return einheit;
    }

    /**
     * Sets the value of the einheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEINHEIT(String value) {
        this.einheit = value;
    }

}
