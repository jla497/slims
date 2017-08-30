/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblsubjectRepository;
import ca.ubc.icapture.genapha.slims.json.PhenotypeDTO;
import ca.ubc.icapture.genapha.slims.json.SubjectDTO;
import ca.ubc.icapture.genapha.slims.json.subjectPostJson;
import ca.ubc.icapture.genapha.slims.model.QTblsubject;
import ca.ubc.icapture.genapha.slims.model.Tblphenotypes;
import ca.ubc.icapture.genapha.slims.model.Tblsubject;
import com.google.common.collect.Lists;
import com.mysema.query.types.expr.BooleanExpression;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
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
public class SubjectSearchSvcImpl implements SubjectSearchService{
    
    private final TblsubjectRepository subjectDao;
    final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    public SubjectSearchSvcImpl(TblsubjectRepository subjectDao){
        this.subjectDao = subjectDao;
  
    }
    
    @Transactional
    @Override
    public Set<SubjectDTO> findBySearchTerm(subjectPostJson params){
        BooleanExpression thisCohort = SubjectSearchPredicates.cohortContains(params.getCohorttype());
        BooleanExpression thisID = null;
        if(params.getSubjectIDisExact().contains("true")){
            thisID = SubjectSearchPredicates.IDContains(params.getSubjectID());
        }else{
            thisID = SubjectSearchPredicates.IDLike(params.getSubjectID());
        }
        
        BooleanExpression thisMotherID = null;
        if(params.getMotherIDisExact().contains("true")){
             thisMotherID = SubjectSearchPredicates.motherIDContains(params.getMotherID());
          }else{
            thisMotherID = SubjectSearchPredicates.motherIDLike(params.getMotherID());
        } 
        
         BooleanExpression thisFatherID = null;
        if(params.getFamilyIDisExact().contains("true")){
             thisFatherID = SubjectSearchPredicates.fatherIDContains(params.getFatherID());
          }else{
            thisFatherID = SubjectSearchPredicates.fatherIDLike(params.getFatherID());
        } 
        
        BooleanExpression thisFamilyID = null;
        if(params.getFamilyIDisExact().contains("true")){
             thisFamilyID = SubjectSearchPredicates.familyIDContains(params.getFamilyID());
          }else{
            thisFamilyID = SubjectSearchPredicates.familyIDLike(params.getFamilyID());
        } 
       
         BooleanExpression thisEthnicity = SubjectSearchPredicates.ethnicityContains(params.getEthnicitytype()); 
        
        BooleanExpression thisGeneticEthnicity = SubjectSearchPredicates.geneticEthnicityContains(params.getGeneticEthnicity()); 
     
        BooleanExpression thisSelfReportedEthnicity = SubjectSearchPredicates.self_reported_EthnicityContains(params.getSelfReportedEthnicity());  
      
        BooleanExpression thisSelfAncEthnicity = SubjectSearchPredicates.self_reported_ancest_EthnicityContains(params.getSelfAncEthnicity());  
        
        BooleanExpression thisGender = SubjectSearchPredicates.genderContains(params.getGender());       
//        
        
        BooleanExpression hasConsent = SubjectSearchPredicates.consentContains(params.getConsent());       
       
        BooleanExpression thisComment = null;
        if(params.getCommentisExact().contains("true")){
            thisComment = SubjectSearchPredicates.commentContains(params.getComment());
        }else{
            thisComment = SubjectSearchPredicates.commentLike(params.getComment());
        }
        
//        Iterable<Tblsubject> res = subjectDao.findAll(thisSubjectID.and(thisMotherID).and(thisFatherID).and(thisFamilyID)
//                                                     .and(thisGender).and(hasConsent).and(thisComment));
        
        Iterable<Tblsubject> res = subjectDao.findAll(thisCohort.and(thisID).and(thisMotherID).and(thisFatherID).and(thisFamilyID)
                                                     .and(thisEthnicity).and(thisGeneticEthnicity).and(thisSelfReportedEthnicity)
                                                     .and(thisSelfAncEthnicity).and(thisGender).and(hasConsent).and(thisComment));
        
//        Iterable<Tblsubject> res = subjectDao.findAll(QTblsubject.tblsubject.subjectid.isNotNull());
        logger.info("in subject search svc...");
//        Set<Tblsubject> resultSet = new HashSet<Tblsubject>();
//       for(Tblsubject s : res){
//           resultSet.add(s);
//           logger.info(s.toString());
//       }

        Set<SubjectDTO> resultSet = new HashSet<SubjectDTO>();
        
        for(Tblsubject s: res){
//            Hibernate.initialize(s.getTblcohortlookup());
//            Hibernate.initialize(s.getTblethnicitylookupByEthnicityid());
//            Hibernate.initialize(s.getTblethnicitylookupByGenEthid());
//            Hibernate.initialize(s.getTblethnicitylookupBySelfRepAncEthid());
//            Hibernate.initialize(s.getTblethnicitylookupBySelfRepEthid());
            SubjectDTO subject = new SubjectDTO(s);
            resultSet.add(subject);
            
        }
 
        return resultSet;
    }
    
    @Transactional
    @Override
    public SubjectDTO findById(String id){
        
         BooleanExpression  SubjectID = SubjectSearchPredicates.subjectIDContains(Integer.parseInt(id));
         
         return new SubjectDTO(subjectDao.findOne(SubjectID));
         
   
    }
    @Transactional
    @Override
    public Set<PhenotypeDTO> findTblphenotypesById(String id){
        BooleanExpression  SubjectID = SubjectSearchPredicates.subjectIDContains(Integer.parseInt(id));
         
         Tblsubject subject = subjectDao.findOne(SubjectID);
         
         Set<PhenotypeDTO> phenotypes = new HashSet<PhenotypeDTO>();
         
         for(Tblphenotypes p : subject.getTblphenotypeses()){
             phenotypes.add(new PhenotypeDTO(p));
         }
         
         return phenotypes;
    }
}
