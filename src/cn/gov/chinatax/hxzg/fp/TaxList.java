//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 ���� CST 
//


package cn.gov.chinatax.hxzg.fp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsrsbh" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="nsrmc" type="{http://www.chinatax.gov.cn/dataspec/}taxDoc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxList", propOrder = {
    "nsrsbh",
    "nsrmc"
})
public class TaxList {

    @XmlElement(required = true)
    protected Object nsrsbh;
    @XmlElement(required = true)
    protected TaxDoc nsrmc;

    /**
     * Gets the value of the nsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNsrsbh() {
        return nsrsbh;
    }

    /**
     * Sets the value of the nsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNsrsbh(Object value) {
        this.nsrsbh = value;
    }

    /**
     * Gets the value of the nsrmc property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDoc }
     *     
     */
    public TaxDoc getNsrmc() {
        return nsrmc;
    }

    /**
     * Sets the value of the nsrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDoc }
     *     
     */
    public void setNsrmc(TaxDoc value) {
        this.nsrmc = value;
    }

}
