/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.model.QTblsimsusers;
import ca.ubc.icapture.genapha.slims.model.QTblsubject;
import com.mysema.query.types.expr.BooleanExpression;

/**
 *
 * @author JLee05
 */
public class SimsUserSearchPredicates {
    private SimsUserSearchPredicates(){}
    
      static public BooleanExpression userNameContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsimsusers.tblsimsusers.isNull();
        }
        
        return QTblsimsusers.tblsimsusers.login.eq(searchTerm);
    }
      
    
      static public BooleanExpression passwordContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsimsusers.tblsimsusers.isNull();
        }
        
        return QTblsimsusers.tblsimsusers.passw.eq(searchTerm);
    }
  
    
}
