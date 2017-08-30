/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblmaterialtypeRepository;
import ca.ubc.icapture.genapha.slims.model.QTblmaterialtype;
import ca.ubc.icapture.genapha.slims.model.Tblmaterialtype;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JLee05
 */
@Service
public class MaterialTypeSearchSvcImpl implements MaterialTypeSearchService{
    @Autowired
    TblmaterialtypeRepository dao;
    
    @Transactional
    @Override
     public List<Tblmaterialtype> findBySearchTerm(Map<String,String> searchTerms){
         
         return Lists.newArrayList(dao.findAll(QTblmaterialtype.tblmaterialtype.isNotNull()));
     }
    
}
