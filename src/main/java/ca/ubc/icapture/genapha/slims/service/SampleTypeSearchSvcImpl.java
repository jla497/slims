/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblsampletypeRepository;
import ca.ubc.icapture.genapha.slims.model.QTblmaterialtype;
import ca.ubc.icapture.genapha.slims.model.QTblsampletypes;
import ca.ubc.icapture.genapha.slims.model.Tblsampletypes;
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
public class SampleTypeSearchSvcImpl implements SampleTypeSearchService {
    @Autowired
    TblsampletypeRepository dao;
    
    @Transactional
    @Override
    public List<Tblsampletypes> findBySearchTerm(Map<String,String> params){
    
        return Lists.newArrayList(dao.findAll(QTblsampletypes.tblsampletypes.isNotNull()));
    }
}
