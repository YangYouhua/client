//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 下午 CST 
//


package cn.gov.chinatax.hxzg.fp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 销售不动产发票代开申报单
 * 
 * <p>Java class for FPBdcFpdksbdVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPBdcFpdksbdVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}FPFpdksbdVO">
 *       &lt;sequence>
 *         &lt;element name="fpdkBdcfpVO" type="{http://www.chinatax.gov.cn/dataspec/}FPDkBdcfpVO"/>
 *         &lt;element name="fpdkBdcXmmxGrid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="fpdkBdcXmmxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}FPDkBdcfpXmmxVO"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPBdcFpdksbdVO", propOrder = {
    "fpdkBdcfpVO",
    "fpdkBdcXmmxGrid"
})
public class FPBdcFpdksbdVO
    extends FPFpdksbdVO
{

    @XmlElement(required = true)
    protected FPDkBdcfpVO fpdkBdcfpVO;
    @XmlElement(required = true)
    protected FPBdcFpdksbdVO.FpdkBdcXmmxGrid fpdkBdcXmmxGrid;

    /**
     * Gets the value of the fpdkBdcfpVO property.
     * 
     * @return
     *     possible object is
     *     {@link FPDkBdcfpVO }
     *     
     */
    public FPDkBdcfpVO getFpdkBdcfpVO() {
        return fpdkBdcfpVO;
    }

    /**
     * Sets the value of the fpdkBdcfpVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPDkBdcfpVO }
     *     
     */
    public void setFpdkBdcfpVO(FPDkBdcfpVO value) {
        this.fpdkBdcfpVO = value;
    }

    /**
     * Gets the value of the fpdkBdcXmmxGrid property.
     * 
     * @return
     *     possible object is
     *     {@link FPBdcFpdksbdVO.FpdkBdcXmmxGrid }
     *     
     */
    public FPBdcFpdksbdVO.FpdkBdcXmmxGrid getFpdkBdcXmmxGrid() {
        return fpdkBdcXmmxGrid;
    }

    /**
     * Sets the value of the fpdkBdcXmmxGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPBdcFpdksbdVO.FpdkBdcXmmxGrid }
     *     
     */
    public void setFpdkBdcXmmxGrid(FPBdcFpdksbdVO.FpdkBdcXmmxGrid value) {
        this.fpdkBdcXmmxGrid = value;
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
     *         &lt;element name="fpdkBdcXmmxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}FPDkBdcfpXmmxVO"/>
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
        "fpdkBdcXmmxGridlb"
    })
    public static class FpdkBdcXmmxGrid {

        @XmlElement(required = true)
        protected List<FPDkBdcfpXmmxVO> fpdkBdcXmmxGridlb;

        /**
         * Gets the value of the fpdkBdcXmmxGridlb property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fpdkBdcXmmxGridlb property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFpdkBdcXmmxGridlb().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FPDkBdcfpXmmxVO }
         * 
         * 
         */
        public List<FPDkBdcfpXmmxVO> getFpdkBdcXmmxGridlb() {
            if (fpdkBdcXmmxGridlb == null) {
                fpdkBdcXmmxGridlb = new ArrayList<FPDkBdcfpXmmxVO>();
            }
            return this.fpdkBdcXmmxGridlb;
        }

    }

}
