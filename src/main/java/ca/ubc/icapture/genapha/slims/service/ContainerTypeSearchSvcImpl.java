/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblcohortlookupRepository;
import ca.ubc.icapture.genapha.slims.dao.TblcontainertypesRepository;
import ca.ubc.icapture.genapha.slims.model.QTblcohortlookup;
import ca.ubc.icapture.genapha.slims.model.QTblcontainertypes;
import ca.ubc.icapture.genapha.slims.model.Tblcohortlookup;
import ca.ubc.icapture.genapha.slims.model.Tblcontainertypes;
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
public class ContainerTypeSearchSvcImpl implements ContainerTypeSearchService {
    private final TblcontainertypesRepository Dao;

    @Autowired
    public ContainerTypeSearchSvcImpl(TblcontainertypesRepository Dao){
        this.Dao = Dao;
  
    }
    
    @Transactional
    @Override
    public List<Tblcontainertypes> findBySearchTerm(Map<String,String> searchTerms){
        List<Tblcontainertypes> list = Lists.newArrayList(Dao.findAll(QTblcontainertypes.tblcontainertypes.isNotNull()));
        return list;
    }
}
