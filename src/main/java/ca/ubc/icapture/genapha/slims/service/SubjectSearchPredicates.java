/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.model.QTblethnicitylookup;
import ca.ubc.icapture.genapha.slims.model.QTblsubject;
import com.mysema.query.types.expr.BooleanExpression;
/**
 *
 * @author JLee05
 */
public class SubjectSearchPredicates {
    private SubjectSearchPredicates(){}
 
    //spec for tblcontainer name 
    static public BooleanExpression cohortContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
        
        return QTblsubject.tblsubject.tblcohortlookup.name.eq(searchTerm);
    }
    
    static public BooleanExpression subjectIDContains(Integer searchTerm){
        if(searchTerm == null){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.subjectid.eq(searchTerm);
    }
    
     static public BooleanExpression IDContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.id.equalsIgnoreCase(searchTerm.trim());
    }
    
      static public BooleanExpression IDLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.id.eq(searchTerm);
    }
    static public BooleanExpression subjectIDLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.subjectid.stringValue().contains(searchTerm);
    }
    
    static public BooleanExpression motherIDContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.motherid.eq(searchTerm);
    }
    
    static public BooleanExpression motherIDLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.motherid.contains(searchTerm);
    }
    
    static public BooleanExpression fatherIDContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.fatherid.eq(searchTerm);
    }
    
     static public BooleanExpression fatherIDLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.fatherid.contains(searchTerm);
    }
     
     static public BooleanExpression familyIDContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.familyid.eq(searchTerm);
    }
    
    static public BooleanExpression familyIDLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.familyid.contains(searchTerm);
    }
    
        static public BooleanExpression ethnicityContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.tblethnicitylookupByEthnicityid.ethnicity.eq(searchTerm);
    }
 

     static public BooleanExpression geneticEthnicityContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.tblethnicitylookupByGenEthid.ethnicity.eq(searchTerm);
    }
     
     static public BooleanExpression self_reported_EthnicityContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.tblethnicitylookupBySelfRepEthid.ethnicity.eq(searchTerm);
    }
     
     static public BooleanExpression self_reported_ancest_EthnicityContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.tblethnicitylookupBySelfRepAncEthid.ethnicity.eq(searchTerm);
    }
     
     
    
    static public BooleanExpression genderContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
        Short num = null;
        if(searchTerm.contains("Unknown"))
        {
            return QTblsubject.tblsubject.isNotNull();
        }else if(searchTerm.contains("Male")){
            num = 1;
        }else if(searchTerm.contains("Female")){
            num = 2;
        }
        return QTblsubject.tblsubject.gender.eq(num);
    }
 
    static public BooleanExpression consentContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
        Short num = null;
        if(searchTerm.contains("Unknown"))
        {
            return QTblsubject.tblsubject.isNotNull();
        }else if(searchTerm.contains("Yes")){
            num = 1;
        }else if(searchTerm.contains("No")){
            num = 0;
        }
        return QTblsubject.tblsubject.hasconsent.eq(num);
    }

    static public BooleanExpression commentContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.comment.eq(searchTerm);
    }
    
    static public BooleanExpression commentLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsubject.tblsubject.isNotNull();
        }
      
        return QTblsubject.tblsubject.comment.contains(searchTerm);
    }
}
