/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblethnicitylookupRepository;
import ca.ubc.icapture.genapha.slims.model.QTblethnicitylookup;
import ca.ubc.icapture.genapha.slims.model.Tblethnicitylookup;
import com.google.common.collect.Lists;
import com.mysema.query.types.expr.BooleanExpression;
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
public class EthnicitySearchSvcImpl implements EthnicitySearchService {
      private final TblethnicitylookupRepository ethnicityDao;

    @Autowired
    public EthnicitySearchSvcImpl(TblethnicitylookupRepository ethnicityDao){
        this.ethnicityDao = ethnicityDao;
    }

    @Transactional
    @Override
    public List<Tblethnicitylookup> findBySearchTerm(Map<String,String> searchTerms){
        List<Tblethnicitylookup> list = Lists.newArrayList(ethnicityDao.findAll(QTblethnicitylookup.tblethnicitylookup.isNotNull()));
        return list;
    }
    
    @Transactional
    @Override
    public Tblethnicitylookup findBySearchTerm2(String searchTerm){
        
        BooleanExpression thisEthnicity = SubjectSearchPredicates.ethnicityContains(searchTerm);  

        return  ethnicityDao.findOne(thisEthnicity);
    }
    
    
           
}

