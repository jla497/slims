/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;


import ca.ubc.icapture.genapha.slims.model.QTblcontainers;
import com.mysema.query.types.expr.BooleanExpression;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author JLee05
 */
 public class ContainersSearchPredicates {
    private ContainersSearchPredicates(){}
    
    //spec for tblcontainer name 
    
    static public BooleanExpression idContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
        
        return QTblcontainers.tblcontainers.containerid.eq(Integer.parseInt(searchTerm));
    }
    
    static public BooleanExpression nameContains(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
        
        return QTblcontainers.tblcontainers.containername.eq(searchTerm);
    }
    
    static public BooleanExpression nameLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
        
        return QTblcontainers.tblcontainers.containername.contains(searchTerm);
    }
    
    //tblcontainer alias
    static public BooleanExpression aliasContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.containeralias.eq(searchTerm);
    }
    
     static public BooleanExpression aliasLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
        
        return QTblcontainers.tblcontainers.containeralias.contains(searchTerm);
    }
    
     static public BooleanExpression initContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.initials.eq(searchTerm);
    }
     
     static public BooleanExpression initLike(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.initials.contains(searchTerm);
    }
     
    
    //tblcontainertyp
    static public BooleanExpression typeContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.tblcontainertypes.description.equalsIgnoreCase(searchTerm);
    }
    
    static public BooleanExpression freezerContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.tblfreezers.description.eq(searchTerm);
    }
    
    static public BooleanExpression shippedToContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.tblshippedto.description.eq(searchTerm);
    }
    
    static public BooleanExpression shipStatusContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.shippedout.eq(Short.valueOf(searchTerm));
    }
    
    static public BooleanExpression discardedContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.discarded.eq(Short.valueOf(searchTerm));
    }
    
    static public BooleanExpression commentContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.comments.eq(searchTerm);
    }
    
     static public BooleanExpression commentLike(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.comments.contains(searchTerm);
    }
     
     static public BooleanExpression barcodeContains(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.barcode.eq(searchTerm);
    }
    
     static public BooleanExpression barcodeLike(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         
        return QTblcontainers.tblcontainers.barcode.contains(searchTerm);
    }
     
     static public BooleanExpression shipped_after(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         Date date = null;
         try{
              DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
             date = df.parse(searchTerm);
            
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return QTblcontainers.tblcontainers.shippeddate.gt(date);
     }
     
     static public BooleanExpression shipped_before(String searchTerm){
         if(searchTerm == null || searchTerm.isEmpty()){
            return QTblcontainers.tblcontainers.isNotNull();
        }
         Date date = null;
         try{
              DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
             date = df.parse(searchTerm);
            
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return QTblcontainers.tblcontainers.shippeddate.lt(date);
     }


}
