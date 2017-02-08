/*Copyright (c) 2017-2018 devuser1.com All Rights Reserved.
 This software is the confidential and proprietary information of devuser1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with devuser1.com*/
package com.totestmavenbuild_allserv.adventureworks2014.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.totestmavenbuild_allserv.adventureworks2014.EmployeePayHistory;
import com.totestmavenbuild_allserv.adventureworks2014.EmployeePayHistoryId;

/**
 * Specifies methods used to obtain and modify EmployeePayHistory related information
 * which is stored in the database.
 */
@Repository("AdventureWorks2014.EmployeePayHistoryDao")
public class EmployeePayHistoryDao extends WMGenericDaoImpl<EmployeePayHistory, EmployeePayHistoryId> {

    @Autowired
    @Qualifier("AdventureWorks2014Template")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

