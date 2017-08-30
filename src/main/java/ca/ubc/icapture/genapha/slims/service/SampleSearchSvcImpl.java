/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblsamplesRepository;
import ca.ubc.icapture.genapha.slims.json.ContainerContentDTO;
import ca.ubc.icapture.genapha.slims.json.SampleDTO;
import ca.ubc.icapture.genapha.slims.json.SubjectDTO;
import ca.ubc.icapture.genapha.slims.json.samplePostJson;
import ca.ubc.icapture.genapha.slims.model.QTblsamples;
import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.Tblgenotype;
import ca.ubc.icapture.genapha.slims.model.Tblgenotypes;
import ca.ubc.icapture.genapha.slims.model.Tblsamples;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mysema.query.types.expr.BooleanExpression;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Service
public class SampleSearchSvcImpl implements SampleSearchService{
    
    @Autowired
    TblsamplesRepository sampleDao;
    
    @Autowired
    GenotypeSearchService genotypeSearchSvc;

    @Transactional
    @Override
    public List<SampleDTO> findBySearchTerm(samplePostJson searchTerms){
 
        BooleanExpression thisId = SampleSearchPredicates.idContains(searchTerms.getSampleID());
        
        BooleanExpression thisBarCode = SampleSearchPredicates.barcodeContains(searchTerms.getBarcode());
        
        if(searchTerms.getBarcodeIsExact().contains("false")){
            thisBarCode = SampleSearchPredicates.barcodeLike(searchTerms.getBarcode());
        }
        
        //tblsample doesn't have a field materialtype. Querying Set<Tblcontainercontents> instead but one Tblsample per many TBlcontainercontents...
        BooleanExpression thisMaterialType = SampleSearchPredicates.materialtypeContains(searchTerms.getMaterialtype());
        
        BooleanExpression thisSampleType = SampleSearchPredicates.sampletypeContains(searchTerms.getSampletype());
        //tblsample doesn't have a field volume. Querying Set<Tblcontainercontents> instead but one Tblsample per many TBlcontainercontents...
        BooleanExpression thisVolume = SampleSearchPredicates.volumeGreaterThan(searchTerms.getVolume());
        
        BooleanExpression thisConcentration = SampleSearchPredicates.concentrationGreaterThan(searchTerms.getConcentration());
        
        //cant find a query search path
//        BooleanExpression thisdnaAmt = SampleSearchPredicates.dnaAmtGreaterThan(searchTerms.getDnaAmt());
        
        BooleanExpression stock = SampleSearchPredicates.inStock(searchTerms.getStock());
        
        BooleanExpression contaminated = SampleSearchPredicates.isContaminated(searchTerms.getContaminated());
        
        BooleanExpression collected_after = SampleSearchPredicates.collected_after(searchTerms.getCollectdate_after());
        
        BooleanExpression collected_before = SampleSearchPredicates.collected_before(searchTerms.getCollectdate_before());
        
        BooleanExpression extracted_after = SampleSearchPredicates.extracted_after(searchTerms.getExtractdate_after());
        
        BooleanExpression extracted_before = SampleSearchPredicates.extracted_before(searchTerms.getExtractdate_before());
        
        BooleanExpression comment = SampleSearchPredicates.commentLike(searchTerms.getComment());
        
//        BooleanExpression genotype = SampleSearchPredicates.thisGenotype(searchTerms.getGenotypeParams());
        
        Iterable<Tblsamples> res = sampleDao.findAll(thisId.and(thisBarCode).and(thisMaterialType).and(thisSampleType)
                                                     .and(thisVolume).and(thisConcentration).and(stock)
                                                     .and(contaminated).and(collected_after).and(collected_before)
                                                     .and(extracted_after).and(extracted_before).and(comment)
                                                     );
        
        
        List<Tblsamples> resList = Lists.newArrayList(res);
        
        List<SampleDTO> toView = new ArrayList<SampleDTO>();
        
        for(Tblsamples s : resList){
//            Hibernate.initialize(s.getTblsubject()); 
            
            SampleDTO sample = new SampleDTO(s);
           
            //SubjectDTO subject = new SubjectDTO(s.getTblsubject());
           
           // sample.setTblSubject(subject);
            
            toView.add(sample);
            
        }
        return toView;
    }
    
    @Transactional
    @Override
    public Tblsamples findById(String id){
        return sampleDao.findOne(SampleSearchPredicates.idContains(id));
    }
    
    @Transactional
    @Override
    public Set<ContainerContentDTO> findContainerContents(String id){
        
        Tblsamples sample = sampleDao.findOne(SampleSearchPredicates.idContains(id));
        
        Set<ContainerContentDTO> contents = new HashSet<ContainerContentDTO>();
        
        for(Tblcontainercontents c : sample.getTblcontainercontentses()){
            contents.add(new ContainerContentDTO(c));
        }
        return contents;
    
    }
}
