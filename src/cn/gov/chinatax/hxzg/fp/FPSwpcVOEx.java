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
 * ��Ʊʵ���̴�VO
 * 
 * <p>Java class for FPSwpcVOEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSwpcVOEx">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}FPSwpcVO">
 *       &lt;sequence>
 *         &lt;element name="fpkfgtmc" type="{http://www.chinatax.gov.cn/dataspec/}fpkfgtmc"/>
 *         &lt;element name="mbfs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phcd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kflxDm" type="{http://www.chinatax.gov.cn/dataspec/}kflxDm"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPSwpcVOEx", propOrder = {
    "fpkfgtmc",
    "mbfs",
    "phcd",
    "kflxDm"
})
public class FPSwpcVOEx
    extends FPSwpcVO
{

    @XmlElement(required = true)
    protected String fpkfgtmc;
    @XmlElement(required = true)
    protected String mbfs;
    @XmlElement(required = true)
    protected String phcd;
    @XmlElement(required = true)
    protected String kflxDm;

    /**
     * Gets the value of the fpkfgtmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkfgtmc() {
        return fpkfgtmc;
    }

    /**
     * Sets the value of the fpkfgtmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkfgtmc(String value) {
        this.fpkfgtmc = value;
    }

    /**
     * Gets the value of the mbfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbfs() {
        return mbfs;
    }

    /**
     * Sets the value of the mbfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbfs(String value) {
        this.mbfs = value;
    }

    /**
     * Gets the value of the phcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhcd() {
        return phcd;
    }

    /**
     * Sets the value of the phcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhcd(String value) {
        this.phcd = value;
    }

    /**
     * Gets the value of the kflxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKflxDm() {
        return kflxDm;
    }

    /**
     * Sets the value of the kflxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKflxDm(String value) {
        this.kflxDm = value;
    }

}
