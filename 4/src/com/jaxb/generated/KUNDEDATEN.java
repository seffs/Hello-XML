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
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}ANREDE"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}KUNDENNAME"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}ADDRESSE"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}PLZ_ORT"/>
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
    "anrede",
    "kundenname",
    "addresse",
    "plzort"
})
@XmlRootElement(name = "KUNDEDATEN")
public class KUNDEDATEN {

    @XmlElement(name = "ANREDE", required = true)
    protected String anrede;
    @XmlElement(name = "KUNDENNAME", required = true)
    protected String kundenname;
    @XmlElement(name = "ADDRESSE", required = true)
    protected String addresse;
    @XmlElement(name = "PLZ_ORT", required = true)
    protected String plzort;

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANREDE() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANREDE(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the kundenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUNDENNAME() {
        return kundenname;
    }

    /**
     * Sets the value of the kundenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUNDENNAME(String value) {
        this.kundenname = value;
    }

    /**
     * Gets the value of the addresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSE() {
        return addresse;
    }

    /**
     * Sets the value of the addresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSE(String value) {
        this.addresse = value;
    }

    /**
     * Gets the value of the plzort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLZORT() {
        return plzort;
    }

    /**
     * Sets the value of the plzort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLZORT(String value) {
        this.plzort = value;
    }

}
