/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblgenotypeRepository;
import ca.ubc.icapture.genapha.slims.json.genotypePostJson;
import ca.ubc.icapture.genapha.slims.model.Tblgenotypes;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mysema.query.types.expr.BooleanExpression;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JLee05
 */
@Service
public class GenotypeSearchSvcImpl implements GenotypeSearchService{
    @Autowired
    TblgenotypeRepository dao;
    
    @Transactional
    @Override
     public List<Tblgenotypes> findBySearchTerm(genotypePostJson searchTerms){
        BooleanExpression thisSNPRsNumber = GenotypeSearchPredicates.thisSNPRsNumber(searchTerms.getSnpRSNumber());
        BooleanExpression thisSNPChromosome = GenotypeSearchPredicates.thisSNPChromosome(searchTerms.getSnpChromosome());
        BooleanExpression thisSNPGene = GenotypeSearchPredicates.thisSNPGene(searchTerms.getSnpGene());
        
        Iterable<Tblgenotypes> genotypes = dao.findAll(thisSNPRsNumber.and(thisSNPChromosome).and(thisSNPGene));
        
        return Lists.newArrayList(genotypes);
     }
    
}
