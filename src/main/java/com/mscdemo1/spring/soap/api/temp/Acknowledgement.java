//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.07 at 06:32:54 AM EAT 
//


package com.mscdemo1.spring.soap.api.temp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temp" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="tempUnits" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "temp",
    "tempUnits"
})
@XmlRootElement(name = "Acknowledgement")
public class Acknowledgement {

    protected float temp;
    @XmlElement(required = true)
    protected String tempUnits;

    /**
     * Gets the value of the temp property.
     * 
     */
    public float getTemp() {
        return temp;
    }

    /**
     * Sets the value of the temp property.
     * 
     */
    public void setTemp(float value) {
        this.temp = value;
    }

    /**
     * Gets the value of the tempUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempUnits() {
        return tempUnits;
    }

    /**
     * Sets the value of the tempUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempUnits(String value) {
        this.tempUnits = value;
    }

}
