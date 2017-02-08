/*Copyright (c) 2017-2018 devuser1.com All Rights Reserved.
 This software is the confidential and proprietary information of devuser1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with devuser1.com*/
package com.totestmavenbuild_allserv.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

/**
 * VjobCandidateEducation generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`vJobCandidateEducation`")
@IdClass(VjobCandidateEducationId.class)
public class VjobCandidateEducation implements Serializable {

    private Integer jobCandidateId;
    private String edu_level;
    @Type(type = "DateTime")
    private LocalDateTime edu_startDate;
    @Type(type = "DateTime")
    private LocalDateTime edu_endDate;
    private String edu_degree;
    private String edu_major;
    private String edu_minor;
    private String edu_gpa;
    private String edu_gpascale;
    private String edu_school;
    private String edu_loc_countryRegion;
    private String edu_loc_state;
    private String edu_loc_city;

    @Id
    @Column(name = "`JobCandidateID`", nullable = false, scale = 0, precision = 10)
    public Integer getJobCandidateId() {
        return this.jobCandidateId;
    }

    public void setJobCandidateId(Integer jobCandidateId) {
        this.jobCandidateId = jobCandidateId;
    }

    @Id
    @Column(name = "`Edu.Level`", nullable = true, length = 2147483647)
    public String getEdu_level() {
        return this.edu_level;
    }

    public void setEdu_level(String edu_level) {
        this.edu_level = edu_level;
    }

    @Id
    @Column(name = "`Edu.StartDate`", nullable = true)
    public LocalDateTime getEdu_startDate() {
        return this.edu_startDate;
    }

    public void setEdu_startDate(LocalDateTime edu_startDate) {
        this.edu_startDate = edu_startDate;
    }

    @Id
    @Column(name = "`Edu.EndDate`", nullable = true)
    public LocalDateTime getEdu_endDate() {
        return this.edu_endDate;
    }

    public void setEdu_endDate(LocalDateTime edu_endDate) {
        this.edu_endDate = edu_endDate;
    }

    @Id
    @Column(name = "`Edu.Degree`", nullable = true, length = 50)
    public String getEdu_degree() {
        return this.edu_degree;
    }

    public void setEdu_degree(String edu_degree) {
        this.edu_degree = edu_degree;
    }

    @Id
    @Column(name = "`Edu.Major`", nullable = true, length = 50)
    public String getEdu_major() {
        return this.edu_major;
    }

    public void setEdu_major(String edu_major) {
        this.edu_major = edu_major;
    }

    @Id
    @Column(name = "`Edu.Minor`", nullable = true, length = 50)
    public String getEdu_minor() {
        return this.edu_minor;
    }

    public void setEdu_minor(String edu_minor) {
        this.edu_minor = edu_minor;
    }

    @Id
    @Column(name = "`Edu.GPA`", nullable = true, length = 5)
    public String getEdu_gpa() {
        return this.edu_gpa;
    }

    public void setEdu_gpa(String edu_gpa) {
        this.edu_gpa = edu_gpa;
    }

    @Id
    @Column(name = "`Edu.GPAScale`", nullable = true, length = 5)
    public String getEdu_gpascale() {
        return this.edu_gpascale;
    }

    public void setEdu_gpascale(String edu_gpascale) {
        this.edu_gpascale = edu_gpascale;
    }

    @Id
    @Column(name = "`Edu.School`", nullable = true, length = 100)
    public String getEdu_school() {
        return this.edu_school;
    }

    public void setEdu_school(String edu_school) {
        this.edu_school = edu_school;
    }

    @Id
    @Column(name = "`Edu.Loc.CountryRegion`", nullable = true, length = 100)
    public String getEdu_loc_countryRegion() {
        return this.edu_loc_countryRegion;
    }

    public void setEdu_loc_countryRegion(String edu_loc_countryRegion) {
        this.edu_loc_countryRegion = edu_loc_countryRegion;
    }

    @Id
    @Column(name = "`Edu.Loc.State`", nullable = true, length = 100)
    public String getEdu_loc_state() {
        return this.edu_loc_state;
    }

    public void setEdu_loc_state(String edu_loc_state) {
        this.edu_loc_state = edu_loc_state;
    }

    @Id
    @Column(name = "`Edu.Loc.City`", nullable = true, length = 100)
    public String getEdu_loc_city() {
        return this.edu_loc_city;
    }

    public void setEdu_loc_city(String edu_loc_city) {
        this.edu_loc_city = edu_loc_city;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VjobCandidateEducation)) return false;
        final VjobCandidateEducation vjobCandidateEducation = (VjobCandidateEducation) o;
        return Objects.equals(getJobCandidateId(), vjobCandidateEducation.getJobCandidateId()) &&
                Objects.equals(getEdu_level(), vjobCandidateEducation.getEdu_level()) &&
                Objects.equals(getEdu_startDate(), vjobCandidateEducation.getEdu_startDate()) &&
                Objects.equals(getEdu_endDate(), vjobCandidateEducation.getEdu_endDate()) &&
                Objects.equals(getEdu_degree(), vjobCandidateEducation.getEdu_degree()) &&
                Objects.equals(getEdu_major(), vjobCandidateEducation.getEdu_major()) &&
                Objects.equals(getEdu_minor(), vjobCandidateEducation.getEdu_minor()) &&
                Objects.equals(getEdu_gpa(), vjobCandidateEducation.getEdu_gpa()) &&
                Objects.equals(getEdu_gpascale(), vjobCandidateEducation.getEdu_gpascale()) &&
                Objects.equals(getEdu_school(), vjobCandidateEducation.getEdu_school()) &&
                Objects.equals(getEdu_loc_countryRegion(), vjobCandidateEducation.getEdu_loc_countryRegion()) &&
                Objects.equals(getEdu_loc_state(), vjobCandidateEducation.getEdu_loc_state()) &&
                Objects.equals(getEdu_loc_city(), vjobCandidateEducation.getEdu_loc_city());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJobCandidateId(),
                getEdu_level(),
                getEdu_startDate(),
                getEdu_endDate(),
                getEdu_degree(),
                getEdu_major(),
                getEdu_minor(),
                getEdu_gpa(),
                getEdu_gpascale(),
                getEdu_school(),
                getEdu_loc_countryRegion(),
                getEdu_loc_state(),
                getEdu_loc_city());
    }
}

