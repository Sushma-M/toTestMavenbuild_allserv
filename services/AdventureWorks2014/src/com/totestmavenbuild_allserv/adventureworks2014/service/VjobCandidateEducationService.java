/*Copyright (c) 2017-2018 devuser1.com All Rights Reserved.
 This software is the confidential and proprietary information of devuser1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with devuser1.com*/
package com.totestmavenbuild_allserv.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.totestmavenbuild_allserv.adventureworks2014.VjobCandidateEducation;
import com.totestmavenbuild_allserv.adventureworks2014.VjobCandidateEducationId;

/**
 * Service object for domain model class {@link VjobCandidateEducation}.
 */
public interface VjobCandidateEducationService {

    /**
     * Creates a new VjobCandidateEducation. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on VjobCandidateEducation if any.
     *
     * @param vjobCandidateEducation Details of the VjobCandidateEducation to be created; value cannot be null.
     * @return The newly created VjobCandidateEducation.
     */
	VjobCandidateEducation create(VjobCandidateEducation vjobCandidateEducation);


	/**
	 * Returns VjobCandidateEducation by given id if exists.
	 *
	 * @param vjobcandidateeducationId The id of the VjobCandidateEducation to get; value cannot be null.
	 * @return VjobCandidateEducation associated with the given vjobcandidateeducationId.
     * @throws EntityNotFoundException If no VjobCandidateEducation is found.
	 */
	VjobCandidateEducation getById(VjobCandidateEducationId vjobcandidateeducationId) throws EntityNotFoundException;

    /**
	 * Find and return the VjobCandidateEducation by given id if exists, returns null otherwise.
	 *
	 * @param vjobcandidateeducationId The id of the VjobCandidateEducation to get; value cannot be null.
	 * @return VjobCandidateEducation associated with the given vjobcandidateeducationId.
	 */
	VjobCandidateEducation findById(VjobCandidateEducationId vjobcandidateeducationId);


	/**
	 * Updates the details of an existing VjobCandidateEducation. It replaces all fields of the existing VjobCandidateEducation with the given vjobCandidateEducation.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on VjobCandidateEducation if any.
     *
	 * @param vjobCandidateEducation The details of the VjobCandidateEducation to be updated; value cannot be null.
	 * @return The updated VjobCandidateEducation.
	 * @throws EntityNotFoundException if no VjobCandidateEducation is found with given input.
	 */
	VjobCandidateEducation update(VjobCandidateEducation vjobCandidateEducation) throws EntityNotFoundException;

    /**
	 * Deletes an existing VjobCandidateEducation with the given id.
	 *
	 * @param vjobcandidateeducationId The id of the VjobCandidateEducation to be deleted; value cannot be null.
	 * @return The deleted VjobCandidateEducation.
	 * @throws EntityNotFoundException if no VjobCandidateEducation found with the given id.
	 */
	VjobCandidateEducation delete(VjobCandidateEducationId vjobcandidateeducationId) throws EntityNotFoundException;

	/**
	 * Find all VjobCandidateEducations matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching VjobCandidateEducations.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<VjobCandidateEducation> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all VjobCandidateEducations matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching VjobCandidateEducations.
     *
     * @see Pageable
     * @see Page
	 */
    Page<VjobCandidateEducation> findAll(String query, Pageable pageable);

    /**
	 * Exports all VjobCandidateEducations matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the VjobCandidateEducations in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the VjobCandidateEducation.
	 */
	long count(String query);


}

