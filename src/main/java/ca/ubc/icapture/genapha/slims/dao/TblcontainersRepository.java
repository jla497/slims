/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.dao;

/**
 *
 * @author JLee05
 */
import ca.ubc.icapture.genapha.slims.model.Tblcontainers;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;


public interface TblcontainersRepository extends Repository<Tblcontainers,Integer>, QueryDslPredicateExecutor<Tblcontainers>{
  
}


