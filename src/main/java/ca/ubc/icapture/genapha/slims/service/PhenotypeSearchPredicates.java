/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;


import ca.ubc.icapture.genapha.slims.model.QTblphenotypes;
import com.mysema.query.types.expr.BooleanExpression;

public class PhenotypeSearchPredicates {
    
     static public BooleanExpression thisId(String searchTerms){
         if(searchTerms == null || searchTerms.isEmpty()){
            return QTblphenotypes.tblphenotypes.isNotNull();
        }
         return QTblphenotypes.tblphenotypes.id.phenotypeid.eq(Integer.parseInt(searchTerms));
     }
     
      static public BooleanExpression thisName(String searchTerms){
         if(searchTerms == null || searchTerms.isEmpty()){
            return QTblphenotypes.tblphenotypes.isNotNull();
        }
       
         return QTblphenotypes.tblphenotypes.tblphenotypelookup.name.eq(searchTerms);
     }
      
      static public BooleanExpression thisSubjectId(String searchTerms){
         if(searchTerms == null || searchTerms.isEmpty()){
            return QTblphenotypes.tblphenotypes.isNotNull();
        }
       
         return QTblphenotypes.tblphenotypes.tblsubject.id.equalsIgnoreCase(searchTerms);
     }
}
