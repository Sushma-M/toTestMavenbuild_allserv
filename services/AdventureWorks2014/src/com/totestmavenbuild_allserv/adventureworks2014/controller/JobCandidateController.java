/*Copyright (c) 2017-2018 devuser1.com All Rights Reserved.
 This software is the confidential and proprietary information of devuser1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with devuser1.com*/
package com.totestmavenbuild_allserv.adventureworks2014.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.totestmavenbuild_allserv.adventureworks2014.JobCandidate;
import com.totestmavenbuild_allserv.adventureworks2014.service.JobCandidateService;

/**
 * Controller object for domain model class JobCandidate.
 * @see JobCandidate
 */
@RestController("AdventureWorks2014.JobCandidateController")
@Api(value = "JobCandidateController", description = "Exposes APIs to work with JobCandidate resource.")
@RequestMapping("/AdventureWorks2014/JobCandidate")
public class JobCandidateController {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobCandidateController.class);

    @Autowired
    @Qualifier("AdventureWorks2014.JobCandidateService")
    private JobCandidateService jobCandidateService;

    @ApiOperation(value = "Creates a new JobCandidate instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public JobCandidate createJobCandidate(@RequestBody JobCandidate jobCandidate) {
        LOGGER.debug("Create JobCandidate with information: {}", jobCandidate);
        jobCandidate = jobCandidateService.create(jobCandidate);
        LOGGER.debug("Created JobCandidate with information: {}", jobCandidate);
        return jobCandidate;
    }

    @ApiOperation(value = "Returns the JobCandidate instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public JobCandidate getJobCandidate(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting JobCandidate with id: {}", id);
        JobCandidate foundJobCandidate = jobCandidateService.getById(id);
        LOGGER.debug("JobCandidate details with id: {}", foundJobCandidate);
        return foundJobCandidate;
    }

    @ApiOperation(value = "Updates the JobCandidate instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public JobCandidate editJobCandidate(@PathVariable("id") Integer id, @RequestBody JobCandidate jobCandidate) throws EntityNotFoundException {
        LOGGER.debug("Editing JobCandidate with id: {}", jobCandidate.getJobCandidateId());
        jobCandidate.setJobCandidateId(id);
        jobCandidate = jobCandidateService.update(jobCandidate);
        LOGGER.debug("JobCandidate details with id: {}", jobCandidate);
        return jobCandidate;
    }

    @ApiOperation(value = "Deletes the JobCandidate instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteJobCandidate(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting JobCandidate with id: {}", id);
        JobCandidate deletedJobCandidate = jobCandidateService.delete(id);
        return deletedJobCandidate != null;
    }

    /**
     * @deprecated Use {@link #findJobCandidates(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of JobCandidate instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<JobCandidate> searchJobCandidatesByQueryFilters(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering JobCandidates list");
        return jobCandidateService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of JobCandidate instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<JobCandidate> findJobCandidates(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering JobCandidates list");
        return jobCandidateService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of JobCandidate instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/filter", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<JobCandidate> filterJobCandidates(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering JobCandidates list");
        return jobCandidateService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param.")
    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportJobCandidates(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return jobCandidateService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns the total count of JobCandidate instances matching the optional query (q) request param.")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Long countJobCandidates(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting JobCandidates");
        return jobCandidateService.count(query);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service JobCandidateService instance
	 */
    protected void setJobCandidateService(JobCandidateService service) {
        this.jobCandidateService = service;
    }
}
