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
 * 税务机关库存继承VO
 * 
 * <p>Java class for FPSwjgkfkcJcVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSwjgkfkcJcVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}FPSwjgkfkcVO">
 *       &lt;sequence>
 *         &lt;element name="hbjxbz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mbfs" type="{http://www.chinatax.gov.cn/dataspec/}mbfs"/>
 *         &lt;element name="phcd" type="{http://www.chinatax.gov.cn/dataspec/}phcd"/>
 *         &lt;element name="kcfs" type="{http://www.chinatax.gov.cn/dataspec/}fs"/>
 *         &lt;element name="fpdmmc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fpme" type="{http://www.chinatax.gov.cn/dataspec/}fpme"/>
 *         &lt;element name="jldwDm" type="{http://www.chinatax.gov.cn/dataspec/}jldwDm"/>
 *         &lt;element name="fpzlmc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="je" type="{http://www.chinatax.gov.cn/dataspec/}je"/>
 *         &lt;element name="sl" type="{http://www.chinatax.gov.cn/dataspec/}sl"/>
 *         &lt;element name="dwslDm" type="{http://www.chinatax.gov.cn/dataspec/}dwslDm"/>
 *         &lt;element name="fpxj" type="{http://www.chinatax.gov.cn/dataspec/}fpxj"/>
 *         &lt;element name="fpjj" type="{http://www.chinatax.gov.cn/dataspec/}fpjj"/>
 *         &lt;element name="fpkfgtmc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPSwjgkfkcJcVO", propOrder = {
    "hbjxbz",
    "mbfs",
    "phcd",
    "kcfs",
    "fpdmmc",
    "fpme",
    "jldwDm",
    "fpzlmc",
    "je",
    "sl",
    "dwslDm",
    "fpxj",
    "fpjj",
    "fpkfgtmc"
})
public class FPSwjgkfkcJcVO
    extends FPSwjgkfkcVO
{

    @XmlElement(required = true)
    protected String hbjxbz;
    protected double mbfs;
    protected int phcd;
    protected double kcfs;
    @XmlElement(required = true)
    protected String fpdmmc;
    protected double fpme;
    @XmlElement(required = true)
    protected String jldwDm;
    @XmlElement(required = true)
    protected String fpzlmc;
    protected double je;
    protected double sl;
    @XmlElement(required = true)
    protected String dwslDm;
    protected double fpxj;
    protected double fpjj;
    @XmlElement(required = true)
    protected String fpkfgtmc;

    /**
     * Gets the value of the hbjxbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHbjxbz() {
        return hbjxbz;
    }

    /**
     * Sets the value of the hbjxbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHbjxbz(String value) {
        this.hbjxbz = value;
    }

    /**
     * Gets the value of the mbfs property.
     * 
     */
    public double getMbfs() {
        return mbfs;
    }

    /**
     * Sets the value of the mbfs property.
     * 
     */
    public void setMbfs(double value) {
        this.mbfs = value;
    }

    /**
     * Gets the value of the phcd property.
     * 
     */
    public int getPhcd() {
        return phcd;
    }

    /**
     * Sets the value of the phcd property.
     * 
     */
    public void setPhcd(int value) {
        this.phcd = value;
    }

    /**
     * Gets the value of the kcfs property.
     * 
     */
    public double getKcfs() {
        return kcfs;
    }

    /**
     * Sets the value of the kcfs property.
     * 
     */
    public void setKcfs(double value) {
        this.kcfs = value;
    }

    /**
     * Gets the value of the fpdmmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdmmc() {
        return fpdmmc;
    }

    /**
     * Sets the value of the fpdmmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdmmc(String value) {
        this.fpdmmc = value;
    }

    /**
     * Gets the value of the fpme property.
     * 
     */
    public double getFpme() {
        return fpme;
    }

    /**
     * Sets the value of the fpme property.
     * 
     */
    public void setFpme(double value) {
        this.fpme = value;
    }

    /**
     * Gets the value of the jldwDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJldwDm() {
        return jldwDm;
    }

    /**
     * Sets the value of the jldwDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJldwDm(String value) {
        this.jldwDm = value;
    }

    /**
     * Gets the value of the fpzlmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpzlmc() {
        return fpzlmc;
    }

    /**
     * Sets the value of the fpzlmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpzlmc(String value) {
        this.fpzlmc = value;
    }

    /**
     * Gets the value of the je property.
     * 
     */
    public double getJe() {
        return je;
    }

    /**
     * Sets the value of the je property.
     * 
     */
    public void setJe(double value) {
        this.je = value;
    }

    /**
     * Gets the value of the sl property.
     * 
     */
    public double getSl() {
        return sl;
    }

    /**
     * Sets the value of the sl property.
     * 
     */
    public void setSl(double value) {
        this.sl = value;
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
     * Gets the value of the fpxj property.
     * 
     */
    public double getFpxj() {
        return fpxj;
    }

    /**
     * Sets the value of the fpxj property.
     * 
     */
    public void setFpxj(double value) {
        this.fpxj = value;
    }

    /**
     * Gets the value of the fpjj property.
     * 
     */
    public double getFpjj() {
        return fpjj;
    }

    /**
     * Sets the value of the fpjj property.
     * 
     */
    public void setFpjj(double value) {
        this.fpjj = value;
    }

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

}
