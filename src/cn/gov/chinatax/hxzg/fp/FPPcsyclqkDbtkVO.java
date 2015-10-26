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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 发票盘存损益处理情况调拨退库VO
 * 
 * <p>Java class for FPPcsyclqkDbtkVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPPcsyclqkDbtkVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="fpzzhm" type="{http://www.chinatax.gov.cn/dataspec/}fpzzhm"/>
 *         &lt;element name="sl" type="{http://www.chinatax.gov.cn/dataspec/}sl"/>
 *         &lt;element name="pccluuid" type="{http://www.chinatax.gov.cn/dataspec/}pccluuid"/>
 *         &lt;element name="dwslDm" type="{http://www.chinatax.gov.cn/dataspec/}dwslDm"/>
 *         &lt;element name="fpckkfDm" type="{http://www.chinatax.gov.cn/dataspec/}fpckkfDm"/>
 *         &lt;element name="clbz" type="{http://www.chinatax.gov.cn/dataspec/}clbz"/>
 *         &lt;element name="fpqshm" type="{http://www.chinatax.gov.cn/dataspec/}fpqshm"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="fprkkfDm" type="{http://www.chinatax.gov.cn/dataspec/}fprkkfDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="sqsxDm" type="{http://www.chinatax.gov.cn/dataspec/}sqsxDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="pcdbtkuuid" type="{http://www.chinatax.gov.cn/dataspec/}pcdbtkuuid"/>
 *         &lt;element name="fpsyyylxDm" type="{http://www.chinatax.gov.cn/dataspec/}fpsyyylxDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPPcsyclqkDbtkVO", propOrder = {
    "sjgsdq",
    "fpzlDm",
    "fpzzhm",
    "sl",
    "pccluuid",
    "dwslDm",
    "fpckkfDm",
    "clbz",
    "fpqshm",
    "fpDm",
    "fprkkfDm",
    "lrrDm",
    "sqsxDm",
    "xgrDm",
    "pcdbtkuuid",
    "fpsyyylxDm"
})
@XmlSeeAlso({
    FPPcsyclqkDbtkVOEx.class
})
public class FPPcsyclqkDbtkVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String fpzzhm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double sl;
    @XmlElement(required = true, nillable = true)
    protected String pccluuid;
    @XmlElement(required = true, nillable = true)
    protected String dwslDm;
    @XmlElement(required = true, nillable = true)
    protected String fpckkfDm;
    @XmlElement(required = true, nillable = true)
    protected String clbz;
    @XmlElement(required = true, nillable = true)
    protected String fpqshm;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String fprkkfDm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String sqsxDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String pcdbtkuuid;
    @XmlElement(required = true, nillable = true)
    protected String fpsyyylxDm;

    /**
     * Gets the value of the sjgsdq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjgsdq() {
        return sjgsdq;
    }

    /**
     * Sets the value of the sjgsdq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjgsdq(String value) {
        this.sjgsdq = value;
    }

    /**
     * Gets the value of the fpzlDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpzlDm() {
        return fpzlDm;
    }

    /**
     * Sets the value of the fpzlDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpzlDm(String value) {
        this.fpzlDm = value;
    }

    /**
     * Gets the value of the fpzzhm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpzzhm() {
        return fpzzhm;
    }

    /**
     * Sets the value of the fpzzhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpzzhm(String value) {
        this.fpzzhm = value;
    }

    /**
     * Gets the value of the sl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSl() {
        return sl;
    }

    /**
     * Sets the value of the sl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSl(Double value) {
        this.sl = value;
    }

    /**
     * Gets the value of the pccluuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPccluuid() {
        return pccluuid;
    }

    /**
     * Sets the value of the pccluuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPccluuid(String value) {
        this.pccluuid = value;
    }

    /**
     * Gets the value of the dwslDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwslDm() {
        return dwslDm;
    }

    /**
     * Sets the value of the dwslDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwslDm(String value) {
        this.dwslDm = value;
    }

    /**
     * Gets the value of the fpckkfDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpckkfDm() {
        return fpckkfDm;
    }

    /**
     * Sets the value of the fpckkfDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpckkfDm(String value) {
        this.fpckkfDm = value;
    }

    /**
     * Gets the value of the clbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClbz() {
        return clbz;
    }

    /**
     * Sets the value of the clbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClbz(String value) {
        this.clbz = value;
    }

    /**
     * Gets the value of the fpqshm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpqshm() {
        return fpqshm;
    }

    /**
     * Sets the value of the fpqshm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpqshm(String value) {
        this.fpqshm = value;
    }

    /**
     * Gets the value of the fpDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpDm() {
        return fpDm;
    }

    /**
     * Sets the value of the fpDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpDm(String value) {
        this.fpDm = value;
    }

    /**
     * Gets the value of the fprkkfDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFprkkfDm() {
        return fprkkfDm;
    }

    /**
     * Sets the value of the fprkkfDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFprkkfDm(String value) {
        this.fprkkfDm = value;
    }

    /**
     * Gets the value of the lrrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLrrDm() {
        return lrrDm;
    }

    /**
     * Sets the value of the lrrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLrrDm(String value) {
        this.lrrDm = value;
    }

    /**
     * Gets the value of the sqsxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqsxDm() {
        return sqsxDm;
    }

    /**
     * Sets the value of the sqsxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqsxDm(String value) {
        this.sqsxDm = value;
    }

    /**
     * Gets the value of the xgrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXgrDm() {
        return xgrDm;
    }

    /**
     * Sets the value of the xgrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXgrDm(String value) {
        this.xgrDm = value;
    }

    /**
     * Gets the value of the pcdbtkuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcdbtkuuid() {
        return pcdbtkuuid;
    }

    /**
     * Sets the value of the pcdbtkuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcdbtkuuid(String value) {
        this.pcdbtkuuid = value;
    }

    /**
     * Gets the value of the fpsyyylxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpsyyylxDm() {
        return fpsyyylxDm;
    }

    /**
     * Sets the value of the fpsyyylxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpsyyylxDm(String value) {
        this.fpsyyylxDm = value;
    }

}
