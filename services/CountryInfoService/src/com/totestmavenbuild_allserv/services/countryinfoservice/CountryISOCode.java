/*Copyright (c) 2017-2018 devuser1.com All Rights Reserved.
 This software is the confidential and proprietary information of devuser1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with devuser1.com*/

package com.totestmavenbuild_allserv.services.countryinfoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sCountryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sCountryName"
})
@XmlRootElement(name = "CountryISOCode")
public class CountryISOCode {

    @XmlElement(required = true)
    protected String sCountryName;

    /**
     * Gets the value of the sCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryName() {
        return sCountryName;
    }

    /**
     * Sets the value of the sCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryName(String value) {
        this.sCountryName = value;
    }

}
