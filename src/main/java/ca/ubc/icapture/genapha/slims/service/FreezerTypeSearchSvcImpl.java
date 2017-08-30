/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblfreezersRepository;

import ca.ubc.icapture.genapha.slims.model.QTblfreezers;

import ca.ubc.icapture.genapha.slims.model.Tblfreezers;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JLee05
 */
@Service
public class FreezerTypeSearchSvcImpl implements FreezerTypeSearchService{
    
    private final TblfreezersRepository sDao;
    
    @Autowired
    public FreezerTypeSearchSvcImpl(TblfreezersRepository sDao){
        this.sDao = sDao;
  
    }
    
    @Transactional
    @Override
    public List<Tblfreezers> findBySearchTerm(Map<String,String> searchTerms){
        List<Tblfreezers> list = Lists.newArrayList(sDao.findAll(QTblfreezers.tblfreezers.isNotNull()));
        return list;
    }
    
}

