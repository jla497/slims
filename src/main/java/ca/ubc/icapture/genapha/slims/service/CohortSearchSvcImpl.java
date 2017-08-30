/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblcohortlookupRepository;
import ca.ubc.icapture.genapha.slims.model.QTblcohortlookup;
import ca.ubc.icapture.genapha.slims.model.Tblcohortlookup;
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
public class CohortSearchSvcImpl implements CohortSearchService{
    
    private final TblcohortlookupRepository cohortDao;

    @Autowired
    public CohortSearchSvcImpl(TblcohortlookupRepository cohortDao){
        this.cohortDao = cohortDao;
  
    }
    
    @Transactional
    @Override
    public List<Tblcohortlookup> findBySearchTerm(Map<String,String> searchTerms){
        List<Tblcohortlookup> list = Lists.newArrayList(cohortDao.findAll(QTblcohortlookup.tblcohortlookup.isNotNull()));
        return list;
    }
    
    @Transactional
    @Override
    public Tblcohortlookup findBySearchTerm2(String searchTerm){
        return cohortDao.findOne(QTblcohortlookup.tblcohortlookup.name.eq(searchTerm));
       
    }
}
