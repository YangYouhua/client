//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 下午 CST 
//


package cn.gov.chinatax.hxzg.fp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 调查巡查启动明细VO
 * 
 * <p>Java class for FPDcxcqdbMxVOEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDcxcqdbMxVOEx">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}FPDcxcqdbMxVO">
 *       &lt;sequence>
 *         &lt;element name="dcsxmc" type="{http://www.chinatax.gov.cn/dataspec/}dcsxmc"/>
 *         &lt;element name="dcxmmc" type="{http://www.chinatax.gov.cn/dataspec/}dcxmmc"/>
 *         &lt;element name="sjdcsxDm" type="{http://www.chinatax.gov.cn/dataspec/}sjdcsxDm"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDcxcqdbMxVOEx", propOrder = {
    "dcsxmc",
    "dcxmmc",
    "sjdcsxDm"
})
public class FPDcxcqdbMxVOEx
    extends FPDcxcqdbMxVO
{

    @XmlElement(required = true, nillable = true)
    protected String dcsxmc;
    @XmlElement(required = true, nillable = true)
    protected String dcxmmc;
    @XmlElement(required = true, nillable = true)
    protected String sjdcsxDm;

    /**
     * Gets the value of the dcsxmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcsxmc() {
        return dcsxmc;
    }

    /**
     * Sets the value of the dcsxmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcsxmc(String value) {
        this.dcsxmc = value;
    }

    /**
     * Gets the value of the dcxmmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcxmmc() {
        return dcxmmc;
    }

    /**
     * Sets the value of the dcxmmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcxmmc(String value) {
        this.dcxmmc = value;
    }

    /**
     * Gets the value of the sjdcsxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjdcsxDm() {
        return sjdcsxDm;
    }

    /**
     * Sets the value of the sjdcsxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjdcsxDm(String value) {
        this.sjdcsxDm = value;
    }

}
