/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.json.genotypePostJson;
import ca.ubc.icapture.genapha.slims.model.QTblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.QTblcontainers;
import ca.ubc.icapture.genapha.slims.model.QTblgenotypes;
import ca.ubc.icapture.genapha.slims.model.QTblphenotypes;
import ca.ubc.icapture.genapha.slims.model.QTblsamples;
import ca.ubc.icapture.genapha.slims.model.Tblgenotypes;
import ca.ubc.icapture.genapha.slims.model.Tblphenotypes;
import com.mysema.query.types.expr.BooleanExpression;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrator
 */

public class SampleSearchPredicates {
    private SampleSearchPredicates(){}
    
    @PersistenceContext
    private static EntityManager entityManager;
    
    static public BooleanExpression idContains(String id){
        if(id == null || id.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.sampleid.eq(Long.parseLong(id));   
    }
            
    static public BooleanExpression nameLike(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.name.contains(searchTerm);   
    }   
    
    static public BooleanExpression nameContains(String searchTerm){

        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.name.eq(searchTerm);   
    }
    
    static public BooleanExpression sampletypeContains(String searchTerm){

        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.tblsampletypes.description.eq(searchTerm);   
    }
    
    static public BooleanExpression materialtypeContains(String searchTerm){

        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.tblcontainercontentses.any().tblmaterialtype.description.eq(searchTerm);
    }
    
    static public BooleanExpression subjectIDContains(String searchTerm){

        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.tblsubject.subjectid.eq(Integer.parseInt(searchTerm));   
    }
    
    static public BooleanExpression isValid(String searchTerm){

        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.valid.eq(Short.parseShort(searchTerm));   
    }
    
    static public BooleanExpression locationContains(String searchTerm){

        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.location.contains(searchTerm);   
    }
    
    static public BooleanExpression concentrationGreaterThan(String gt ){

        if(gt == null || gt.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.concentration.gt(Double.parseDouble(gt));
    }
    
    static public BooleanExpression concentrationLessThan(String lt ){

        if(lt == null || lt.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.concentration.lt(Double.parseDouble(lt));
    }
    
      static public BooleanExpression inStock(String searchTerm ){

        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
         
        return QTblsamples.tblsamples.tblcontainercontentses.any().tblcontainers.stock.eq(Short.parseShort(searchTerm));
    }
      
         static public BooleanExpression isContaminated(String searchTerm ){

        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.tblcontainercontentses.any().contaminated.eq(Short.parseShort(searchTerm));
    }
    
    
    static public BooleanExpression volumeGreaterThan(String gt ){

        if(gt == null || gt.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.tblcontainercontentses.any().volume.gt(Long.parseLong(gt));
    }
    
     static public BooleanExpression volumeLessThan(String lt ){

        if(lt == null || lt.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.tblcontainercontentses.any().volume.lt(Long.parseLong(lt));
    }
    
   // can't find dnaAmount relationship         
//    static public BooleanExpression dnaAmtGreaterThan(String searchTerm ){
//
//        if(searchTerm == null || searchTerm.isEmpty()){
//            return QTblsamples.tblsamples.isNotNull();
//        }
//        
//        return QTblsamples.tblsamples.isNotNull(); 
//    }

    static public BooleanExpression collected_after(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        Date date = null;
         try{
              DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
             date = df.parse(searchTerm);
            
         }catch(Exception e){
             e.printStackTrace();
         }
        
        return QTblsamples.tblsamples.collectiondate.gt(date);

    }
    
    static public BooleanExpression collected_before(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
         Date date = null;
         try{
              DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
             date = df.parse(searchTerm);
            
         }catch(Exception e){
             e.printStackTrace();
         }
 
        return QTblsamples.tblsamples.collectiondate.lt(date);

    }
    
    static public BooleanExpression extracted_after(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
         Date date = null;
         try{
              DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
             date = df.parse(searchTerm);
            
         }catch(Exception e){
             e.printStackTrace();
         }
       
        return QTblsamples.tblsamples.extractiondate.gt(date);

    }
    
    static public BooleanExpression extracted_before(String searchTerm){
        if(searchTerm == null || searchTerm.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
         Date date = null;
         try{
              DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
             date = df.parse(searchTerm);
            
         }catch(Exception e){
             e.printStackTrace();
         }
          
        return QTblsamples.tblsamples.extractiondate.lt(date);

    }
    
    static public BooleanExpression commentLike(String comment){
        if(comment == null || comment.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.comments.contains(comment);
    }
    
      static public BooleanExpression barcodeContains(String barcode){
        if(barcode == null || barcode.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.tblcontainercontentses.any().barcode.eq(barcode);
    }
      
    static public BooleanExpression barcodeLike(String barcode){
        if(barcode == null || barcode.isEmpty()){
            return QTblsamples.tblsamples.isNotNull();
        }
        
        return QTblsamples.tblsamples.tblcontainercontentses.any().barcode.contains(barcode);
    }
    
//    static public BooleanExpression thisGenotype(genotypePostJson searchTerms){
//        if(searchTerms == null || searchTerms.toString().isEmpty()){
//            return QTblsamples.tblsamples.isNotNull();
//        }
//       
//        
//        return QTblsamples.tblsamples.tblcontainercontentses.any()
//                          .tblgenotypeses.any().tblsnp.tblgene.geneid.eq(129);
//    }
    
//    static public BooleanExpression thisGenotype(genotypePostJson searchTerms){
//        if(searchTerms == null || searchTerms.toString().isEmpty()){
//            return QTblsamples.tblsamples.isNotNull();
//        }
//       
//        
//        return QTblsamples.tblsamples.tblcontainercontentses.any()
//                          .tblgenotypeses.any().eq(GenotypeSearchPredicates.thisGenotype(searchTerms));
//    }
 
 
}
