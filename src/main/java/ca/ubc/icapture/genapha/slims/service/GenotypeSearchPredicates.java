/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.json.genotypePostJson;
import ca.ubc.icapture.genapha.slims.model.QTblgenotypes;
import ca.ubc.icapture.genapha.slims.model.QTblsamples;
import ca.ubc.icapture.genapha.slims.model.Tblgenotypes;
import com.mysema.query.types.expr.BooleanExpression;

/**
 *
 * @author JLee05
 */
public class GenotypeSearchPredicates {
    static public BooleanExpression thisSNPRsNumber(String searchTerms){
        QTblgenotypes genotypes = QTblgenotypes.tblgenotypes;
        
        if(searchTerms == null || searchTerms.isEmpty()){
            return genotypes.isNotNull();
        }
         return genotypes.tblsnp.rsnumber.eq(searchTerms);
    
    }
    
    static public BooleanExpression thisSNPChromosome(String searchTerms){
        QTblgenotypes genotypes = QTblgenotypes.tblgenotypes;
        
        if(searchTerms == null || searchTerms.isEmpty()){
            return genotypes.isNotNull();
        }
         return  genotypes.tblsnp.chromosome.eq(searchTerms);
    
    }
    
    static public BooleanExpression thisSNPGene(String searchTerms){
         QTblgenotypes genotypes = QTblgenotypes.tblgenotypes;
        if(searchTerms == null || searchTerms.isEmpty()){
            return genotypes.isNotNull();
        }
        
         return  genotypes.tblsnp.tblgene.name.eq(searchTerms);
    
    }
  
//    static public JPQLQuery<Tblgenotypes> thisGenotype(genotypePostJson params){
//        String searchTerms = "";
//        QTblgenotypes genotypes = QTblgenotypes.tblgenotypes;
//        BooleanBuilder builder = new BooleanBuilder();
//        builder.and(thisSNPGene(params.getSnpGene())).and(thisSNPChromosome(params.getSnpChromosome())
//               .and(thisSNPRsNumber(params.getSnpRSNumber())));
//        
//         return JPAExpressions.selectFrom(genotypes).where(builder);
//    }
//    
//    static public BooleanExpression thisSNPRsNumber(String searchTerms){
//        if(searchTerms == null || searchTerms.isEmpty()){
//            return QTblgenotypes.tblgenotypes.isNotNull();
//        }
//        
//        return QTblgenotypes.tblgenotypes.tblsnp.rsnumber.eq(searchTerms);
//    }
//    
//     static public BooleanExpression thisSNPChromosome(String searchTerms){
//        if(searchTerms == null || searchTerms.isEmpty()){
//            return QTblgenotypes.tblgenotypes.isNotNull();
//        }
//        
//        return QTblgenotypes.tblgenotypes.tblsnp.chromosome.eq(searchTerms);
//    }
//     
//     static public BooleanExpression thisSNPGene(String searchTerms){
//        if(searchTerms == null || searchTerms.isEmpty()){
//            return QTblgenotypes.tblgenotypes.isNotNull();
//        }
//        
//        return QTblgenotypes.tblgenotypes.tblsnp.tblgene.name.eq(searchTerms);
//    }
}
