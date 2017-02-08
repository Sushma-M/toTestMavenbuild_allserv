/*Copyright (c) 2017-2018 devuser1.com All Rights Reserved.
 This software is the confidential and proprietary information of devuser1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with devuser1.com*/
package com.totestmavenbuild_allserv.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

public class VjobCandidateId implements Serializable {

    private Integer jobCandidateId;
    private Integer businessEntityId;
    private String name_prefix;
    private String name_first;
    private String name_middle;
    private String name_last;
    private String name_suffix;
    private String skills;
    private String addr_type;
    private String addr_loc_countryRegion;
    private String addr_loc_state;
    private String addr_loc_city;
    private String addr_postalCode;
    private String email;
    private String webSite;
    @Type(type = "DateTime")
    private LocalDateTime modifiedDate;

    public Integer getJobCandidateId() {
        return this.jobCandidateId;
    }

    public void setJobCandidateId(Integer jobCandidateId) {
        this.jobCandidateId = jobCandidateId;
    }

    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    public String getName_prefix() {
        return this.name_prefix;
    }

    public void setName_prefix(String name_prefix) {
        this.name_prefix = name_prefix;
    }

    public String getName_first() {
        return this.name_first;
    }

    public void setName_first(String name_first) {
        this.name_first = name_first;
    }

    public String getName_middle() {
        return this.name_middle;
    }

    public void setName_middle(String name_middle) {
        this.name_middle = name_middle;
    }

    public String getName_last() {
        return this.name_last;
    }

    public void setName_last(String name_last) {
        this.name_last = name_last;
    }

    public String getName_suffix() {
        return this.name_suffix;
    }

    public void setName_suffix(String name_suffix) {
        this.name_suffix = name_suffix;
    }

    public String getSkills() {
        return this.skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getAddr_type() {
        return this.addr_type;
    }

    public void setAddr_type(String addr_type) {
        this.addr_type = addr_type;
    }

    public String getAddr_loc_countryRegion() {
        return this.addr_loc_countryRegion;
    }

    public void setAddr_loc_countryRegion(String addr_loc_countryRegion) {
        this.addr_loc_countryRegion = addr_loc_countryRegion;
    }

    public String getAddr_loc_state() {
        return this.addr_loc_state;
    }

    public void setAddr_loc_state(String addr_loc_state) {
        this.addr_loc_state = addr_loc_state;
    }

    public String getAddr_loc_city() {
        return this.addr_loc_city;
    }

    public void setAddr_loc_city(String addr_loc_city) {
        this.addr_loc_city = addr_loc_city;
    }

    public String getAddr_postalCode() {
        return this.addr_postalCode;
    }

    public void setAddr_postalCode(String addr_postalCode) {
        this.addr_postalCode = addr_postalCode;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebSite() {
        return this.webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VjobCandidate)) return false;
        final VjobCandidate vjobCandidate = (VjobCandidate) o;
        return Objects.equals(getJobCandidateId(), vjobCandidate.getJobCandidateId()) &&
                Objects.equals(getBusinessEntityId(), vjobCandidate.getBusinessEntityId()) &&
                Objects.equals(getName_prefix(), vjobCandidate.getName_prefix()) &&
                Objects.equals(getName_first(), vjobCandidate.getName_first()) &&
                Objects.equals(getName_middle(), vjobCandidate.getName_middle()) &&
                Objects.equals(getName_last(), vjobCandidate.getName_last()) &&
                Objects.equals(getName_suffix(), vjobCandidate.getName_suffix()) &&
                Objects.equals(getSkills(), vjobCandidate.getSkills()) &&
                Objects.equals(getAddr_type(), vjobCandidate.getAddr_type()) &&
                Objects.equals(getAddr_loc_countryRegion(), vjobCandidate.getAddr_loc_countryRegion()) &&
                Objects.equals(getAddr_loc_state(), vjobCandidate.getAddr_loc_state()) &&
                Objects.equals(getAddr_loc_city(), vjobCandidate.getAddr_loc_city()) &&
                Objects.equals(getAddr_postalCode(), vjobCandidate.getAddr_postalCode()) &&
                Objects.equals(getEmail(), vjobCandidate.getEmail()) &&
                Objects.equals(getWebSite(), vjobCandidate.getWebSite()) &&
                Objects.equals(getModifiedDate(), vjobCandidate.getModifiedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJobCandidateId(),
                getBusinessEntityId(),
                getName_prefix(),
                getName_first(),
                getName_middle(),
                getName_last(),
                getName_suffix(),
                getSkills(),
                getAddr_type(),
                getAddr_loc_countryRegion(),
                getAddr_loc_state(),
                getAddr_loc_city(),
                getAddr_postalCode(),
                getEmail(),
                getWebSite(),
                getModifiedDate());
    }
}
