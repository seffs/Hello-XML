//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.10 at 12:46:46 AM CEST 
//


package com.jaxb.generated;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}NETTO"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}MWST-GESAMT"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}BRUTTO"/>
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
    "netto",
    "mwstgesamt",
    "brutto"
})
@XmlRootElement(name = "ENTGELT")
public class ENTGELT {

    @XmlElement(name = "NETTO", required = true)
    protected BigDecimal netto;
    @XmlElement(name = "MWST-GESAMT", required = true)
    protected BigDecimal mwstgesamt;
    @XmlElement(name = "BRUTTO", required = true)
    protected BigDecimal brutto;

    /**
     * Gets the value of the netto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNETTO() {
        return netto;
    }

    /**
     * Sets the value of the netto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNETTO(BigDecimal value) {
        this.netto = value;
    }

    /**
     * Gets the value of the mwstgesamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMWSTGESAMT() {
        return mwstgesamt;
    }

    /**
     * Sets the value of the mwstgesamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMWSTGESAMT(BigDecimal value) {
        this.mwstgesamt = value;
    }

    /**
     * Gets the value of the brutto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBRUTTO() {
        return brutto;
    }

    /**
     * Sets the value of the brutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBRUTTO(BigDecimal value) {
        this.brutto = value;
    }

}
