/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblphenotypesRepository;
import ca.ubc.icapture.genapha.slims.json.PhenotypeDTO;
import ca.ubc.icapture.genapha.slims.json.phenotypePostJson;
import ca.ubc.icapture.genapha.slims.model.Tblphenotypes;
import com.google.common.collect.Sets;
import com.mysema.query.types.expr.BooleanExpression;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JLee05
 */
@Service
public class PhenotypeSearchSvcImpl implements PhenotypesSearchService{
    @Autowired
    TblphenotypesRepository dao;
    
    final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Transactional
    @Override
    public Set<PhenotypeDTO> findBySearchTerm(phenotypePostJson searchTerms){
        BooleanExpression thisId = PhenotypeSearchPredicates.thisId(searchTerms.getPhenotypeid());
        BooleanExpression thisName = PhenotypeSearchPredicates.thisName(searchTerms.getPheno_name());
        BooleanExpression thisSubjectId = PhenotypeSearchPredicates.thisSubjectId(searchTerms.getSubjectId());
        
//        logger.info("thisId: ",thisId.toString());
//        logger.info("thisName: ",thisName.toString());
        
        Set<Tblphenotypes> phenotypes = Sets.newHashSet(dao.findAll(thisId.and(thisName).and(thisSubjectId)));
        
        Set<PhenotypeDTO> toView = new HashSet<PhenotypeDTO>();
        
        for(Tblphenotypes p : phenotypes){
            PhenotypeDTO phenotype = new PhenotypeDTO();
            Hibernate.initialize(p.getTblphenotypelookup());
            Hibernate.initialize(p.getTblsubject());
            phenotype.setDescription(p.getTblphenotypelookup().getDescription());
            phenotype.setName(p.getTblphenotypelookup().getName());
            phenotype.setValue(p.getValue());
            phenotype.setSubjectId(p.getTblsubject().getSubjectid());
            phenotype.setStringSubjectId(p.getTblsubject().getId());
            toView.add(phenotype);
        }
        
        return toView;
    }
}
