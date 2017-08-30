/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.dao;

import ca.ubc.icapture.genapha.slims.model.Tblcontainertypes;
import ca.ubc.icapture.genapha.slims.model.Tblfreezers;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;

/**
 *
 * @author JLee05
 */
public interface TblfreezersRepository extends Repository<Tblfreezers,Integer>, QueryDslPredicateExecutor<Tblfreezers> {
    
}
