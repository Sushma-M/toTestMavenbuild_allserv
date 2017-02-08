/*Copyright (c) 2017-2018 devuser1.com All Rights Reserved.
 This software is the confidential and proprietary information of devuser1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with devuser1.com*/
package com.totestmavenbuild_allserv.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class VemployeeId implements Serializable {

    private Integer businessEntityId;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String jobTitle;
    private String phoneNumber;
    private String phoneNumberType;
    private String emailAddress;
    private Integer emailPromotion;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String stateProvinceName;
    private String postalCode;
    private String countryRegionName;
    private String additionalContactInfo;

    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberType() {
        return this.phoneNumberType;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getEmailPromotion() {
        return this.emailPromotion;
    }

    public void setEmailPromotion(Integer emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvinceName() {
        return this.stateProvinceName;
    }

    public void setStateProvinceName(String stateProvinceName) {
        this.stateProvinceName = stateProvinceName;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryRegionName() {
        return this.countryRegionName;
    }

    public void setCountryRegionName(String countryRegionName) {
        this.countryRegionName = countryRegionName;
    }

    public String getAdditionalContactInfo() {
        return this.additionalContactInfo;
    }

    public void setAdditionalContactInfo(String additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vemployee)) return false;
        final Vemployee vemployee = (Vemployee) o;
        return Objects.equals(getBusinessEntityId(), vemployee.getBusinessEntityId()) &&
                Objects.equals(getTitle(), vemployee.getTitle()) &&
                Objects.equals(getFirstName(), vemployee.getFirstName()) &&
                Objects.equals(getMiddleName(), vemployee.getMiddleName()) &&
                Objects.equals(getLastName(), vemployee.getLastName()) &&
                Objects.equals(getSuffix(), vemployee.getSuffix()) &&
                Objects.equals(getJobTitle(), vemployee.getJobTitle()) &&
                Objects.equals(getPhoneNumber(), vemployee.getPhoneNumber()) &&
                Objects.equals(getPhoneNumberType(), vemployee.getPhoneNumberType()) &&
                Objects.equals(getEmailAddress(), vemployee.getEmailAddress()) &&
                Objects.equals(getEmailPromotion(), vemployee.getEmailPromotion()) &&
                Objects.equals(getAddressLine1(), vemployee.getAddressLine1()) &&
                Objects.equals(getAddressLine2(), vemployee.getAddressLine2()) &&
                Objects.equals(getCity(), vemployee.getCity()) &&
                Objects.equals(getStateProvinceName(), vemployee.getStateProvinceName()) &&
                Objects.equals(getPostalCode(), vemployee.getPostalCode()) &&
                Objects.equals(getCountryRegionName(), vemployee.getCountryRegionName()) &&
                Objects.equals(getAdditionalContactInfo(), vemployee.getAdditionalContactInfo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusinessEntityId(),
                getTitle(),
                getFirstName(),
                getMiddleName(),
                getLastName(),
                getSuffix(),
                getJobTitle(),
                getPhoneNumber(),
                getPhoneNumberType(),
                getEmailAddress(),
                getEmailPromotion(),
                getAddressLine1(),
                getAddressLine2(),
                getCity(),
                getStateProvinceName(),
                getPostalCode(),
                getCountryRegionName(),
                getAdditionalContactInfo());
    }
}
