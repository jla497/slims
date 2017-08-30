/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;


import ca.ubc.icapture.genapha.slims.dao.TblshippedtoRepository;
import ca.ubc.icapture.genapha.slims.model.QTblshippedto;
import ca.ubc.icapture.genapha.slims.model.Tblshippedto;
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
public class ShippedtoTypeSearchSvcImpl implements ShippedtoTypeSearchService {
    private final TblshippedtoRepository Dao;
    
     @Autowired
    public ShippedtoTypeSearchSvcImpl(TblshippedtoRepository Dao){
        this.Dao = Dao;
  
    }
    
    @Transactional
    @Override
    public List<Tblshippedto> findBySearchTerm(Map<String,String> searchTerms){
        List<Tblshippedto> list = Lists.newArrayList(Dao.findAll(QTblshippedto.tblshippedto.isNotNull()));
        return list;
    }
    
    
}

