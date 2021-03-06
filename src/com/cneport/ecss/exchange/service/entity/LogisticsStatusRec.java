//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.12 at 05:00:38 PM CST 
//

package com.cneport.ecss.exchange.service.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subShippedNumbe">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="totalShippedNumbe" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="logisticsCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="logisticsName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="detail">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "subShippedNumbe", "totalShippedNumbe",
	"logisticsCode", "logisticsName", "status", "detail" })
@XmlRootElement(name = "LogisticsStatusRec")
public class LogisticsStatusRec {

    @XmlElement(required = true)
    protected String subShippedNumbe;
    protected String totalShippedNumbe;
    protected String logisticsCode;
    @XmlElement(required = true)
    protected String logisticsName;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String detail;

    /**
     * Gets the value of the subShippedNumbe property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSubShippedNumbe() {
	return subShippedNumbe;
    }

    /**
     * Sets the value of the subShippedNumbe property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSubShippedNumbe(String value) {
	this.subShippedNumbe = value;
    }

    /**
     * Gets the value of the totalShippedNumbe property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalShippedNumbe() {
	return totalShippedNumbe;
    }

    /**
     * Sets the value of the totalShippedNumbe property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTotalShippedNumbe(String value) {
	this.totalShippedNumbe = value;
    }

    /**
     * Gets the value of the logisticsCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLogisticsCode() {
	return logisticsCode;
    }

    /**
     * Sets the value of the logisticsCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLogisticsCode(String value) {
	this.logisticsCode = value;
    }

    /**
     * Gets the value of the logisticsName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLogisticsName() {
	return logisticsName;
    }

    /**
     * Sets the value of the logisticsName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLogisticsName(String value) {
	this.logisticsName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatus() {
	return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStatus(String value) {
	this.status = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDetail() {
	return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDetail(String value) {
	this.detail = value;
    }

}
