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
 * ��Ʊ�����Ʋ��嵥VO
 * 
 * <p>Java class for FPDbccqdVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDbccqdVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="dbsquuid" type="{http://www.chinatax.gov.cn/dataspec/}dbsquuid"/>
 *         &lt;element name="sl" type="{http://www.chinatax.gov.cn/dataspec/}sl"/>
 *         &lt;element name="je" type="{http://www.chinatax.gov.cn/dataspec/}je"/>
 *         &lt;element name="dj" type="{http://www.chinatax.gov.cn/dataspec/}dj"/>
 *         &lt;element name="gg" type="{http://www.chinatax.gov.cn/dataspec/}gg"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="dbsqccuuid" type="{http://www.chinatax.gov.cn/dataspec/}dbsqccuuid"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="dbccmc" type="{http://www.chinatax.gov.cn/dataspec/}dbccmc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDbccqdVO", propOrder = {
    "sjgsdq",
    "dbsquuid",
    "sl",
    "je",
    "dj",
    "gg",
    "lrrDm",
    "dbsqccuuid",
    "xgrDm",
    "dbccmc"
})
public class FPDbccqdVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String dbsquuid;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double sl;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double je;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dj;
    @XmlElement(required = true, nillable = true)
    protected String gg;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String dbsqccuuid;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String dbccmc;

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
     * Gets the value of the dbsquuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbsquuid() {
        return dbsquuid;
    }

    /**
     * Sets the value of the dbsquuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbsquuid(String value) {
        this.dbsquuid = value;
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
     * Gets the value of the je property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJe() {
        return je;
    }

    /**
     * Sets the value of the je property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJe(Double value) {
        this.je = value;
    }

    /**
     * Gets the value of the dj property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDj() {
        return dj;
    }

    /**
     * Sets the value of the dj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDj(Double value) {
        this.dj = value;
    }

    /**
     * Gets the value of the gg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGg() {
        return gg;
    }

    /**
     * Sets the value of the gg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGg(String value) {
        this.gg = value;
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
     * Gets the value of the dbsqccuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbsqccuuid() {
        return dbsqccuuid;
    }

    /**
     * Sets the value of the dbsqccuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbsqccuuid(String value) {
        this.dbsqccuuid = value;
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
     * Gets the value of the dbccmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbccmc() {
        return dbccmc;
    }

    /**
     * Sets the value of the dbccmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbccmc(String value) {
        this.dbccmc = value;
    }

}