//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 ���� CST 
//


package cn.gov.chinatax.hxzg.fp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ��ֵ˰ר�÷�Ʊ�����걨��
 * 
 * <p>Java class for FPZzszyfpdksbdVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPZzszyfpdksbdVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}FPFpdksbdVO">
 *       &lt;sequence>
 *         &lt;element name="fpdkZzsfpVO" type="{http://www.chinatax.gov.cn/dataspec/}FPDkZzsfpVO"/>
 *         &lt;element name="fpdkZzsfpHlmxGrid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="fpdkZzsfpHlmxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}FPDkZzsfpHlmxVO"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fpdkZzsGhfnsrxxVO" type="{http://www.chinatax.gov.cn/dataspec/}FPDkZzsGhfnsrxxVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPZzszyfpdksbdVO", propOrder = {
    "fpdkZzsfpVO",
    "fpdkZzsfpHlmxGrid",
    "fpdkZzsGhfnsrxxVO"
})
public class FPZzszyfpdksbdVO
    extends FPFpdksbdVO
{

    @XmlElement(required = true)
    protected FPDkZzsfpVO fpdkZzsfpVO;
    @XmlElement(required = true)
    protected FPZzszyfpdksbdVO.FpdkZzsfpHlmxGrid fpdkZzsfpHlmxGrid;
    protected FPDkZzsGhfnsrxxVO fpdkZzsGhfnsrxxVO;

    /**
     * Gets the value of the fpdkZzsfpVO property.
     * 
     * @return
     *     possible object is
     *     {@link FPDkZzsfpVO }
     *     
     */
    public FPDkZzsfpVO getFpdkZzsfpVO() {
        return fpdkZzsfpVO;
    }

    /**
     * Sets the value of the fpdkZzsfpVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPDkZzsfpVO }
     *     
     */
    public void setFpdkZzsfpVO(FPDkZzsfpVO value) {
        this.fpdkZzsfpVO = value;
    }

    /**
     * Gets the value of the fpdkZzsfpHlmxGrid property.
     * 
     * @return
     *     possible object is
     *     {@link FPZzszyfpdksbdVO.FpdkZzsfpHlmxGrid }
     *     
     */
    public FPZzszyfpdksbdVO.FpdkZzsfpHlmxGrid getFpdkZzsfpHlmxGrid() {
        return fpdkZzsfpHlmxGrid;
    }

    /**
     * Sets the value of the fpdkZzsfpHlmxGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPZzszyfpdksbdVO.FpdkZzsfpHlmxGrid }
     *     
     */
    public void setFpdkZzsfpHlmxGrid(FPZzszyfpdksbdVO.FpdkZzsfpHlmxGrid value) {
        this.fpdkZzsfpHlmxGrid = value;
    }

    /**
     * Gets the value of the fpdkZzsGhfnsrxxVO property.
     * 
     * @return
     *     possible object is
     *     {@link FPDkZzsGhfnsrxxVO }
     *     
     */
    public FPDkZzsGhfnsrxxVO getFpdkZzsGhfnsrxxVO() {
        return fpdkZzsGhfnsrxxVO;
    }

    /**
     * Sets the value of the fpdkZzsGhfnsrxxVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPDkZzsGhfnsrxxVO }
     *     
     */
    public void setFpdkZzsGhfnsrxxVO(FPDkZzsGhfnsrxxVO value) {
        this.fpdkZzsGhfnsrxxVO = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="fpdkZzsfpHlmxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}FPDkZzsfpHlmxVO"/>
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
        "fpdkZzsfpHlmxGridlb"
    })
    public static class FpdkZzsfpHlmxGrid {

        @XmlElement(required = true)
        protected List<FPDkZzsfpHlmxVO> fpdkZzsfpHlmxGridlb;

        /**
         * Gets the value of the fpdkZzsfpHlmxGridlb property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fpdkZzsfpHlmxGridlb property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFpdkZzsfpHlmxGridlb().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FPDkZzsfpHlmxVO }
         * 
         * 
         */
        public List<FPDkZzsfpHlmxVO> getFpdkZzsfpHlmxGridlb() {
            if (fpdkZzsfpHlmxGridlb == null) {
                fpdkZzsfpHlmxGridlb = new ArrayList<FPDkZzsfpHlmxVO>();
            }
            return this.fpdkZzsfpHlmxGridlb;
        }

    }

}