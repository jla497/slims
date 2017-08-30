/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.model.Tblcontainers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ca.ubc.icapture.genapha.slims.dao.TblcontainersRepository;
import ca.ubc.icapture.genapha.slims.json.ContainerContentDTO;
import ca.ubc.icapture.genapha.slims.json.containerPostJson;
import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import com.google.common.collect.Lists;
import com.mysema.query.types.expr.BooleanExpression;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JLee05
 */
@Service
public class ContainersSearchSvcImpl implements ContainersSearchService{
    
    
    private final TblcontainersRepository containersDao;
  
    
    final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    public ContainersSearchSvcImpl(TblcontainersRepository containersDao){
        this.containersDao = containersDao;
      
    }
    
    @Transactional
    @Override
    public List<Tblcontainers> findBySearchTerm(containerPostJson params){
     
        BooleanExpression withThisName = ContainersSearchPredicates.nameContains(params.getName());
        if(params.getNameisExact().contains("false") || params.getNameisExact() == null){
            withThisName = ContainersSearchPredicates.nameLike(params.getName());
        }
        
        BooleanExpression withThisAlias = ContainersSearchPredicates.aliasContains(params.getAlias());
        if(params.getAliasisExact().contains("false") || params.getAliasisExact() == null){
            withThisAlias = ContainersSearchPredicates.aliasLike(params.getAlias());
        }
        
        BooleanExpression withThisPlate_Maker_Init = ContainersSearchPredicates.initContains(params.getPlate_maker_init());
        if(params.getPlate_maker_initisExact().contains("false")){
            withThisPlate_Maker_Init = ContainersSearchPredicates.initLike(params.getPlate_maker_init());
        }
        BooleanExpression withThisType = ContainersSearchPredicates.typeContains(params.getContainertype());
        BooleanExpression inThisFreezer = ContainersSearchPredicates.freezerContains(params.getFreezertype());
        BooleanExpression shippedTo = ContainersSearchPredicates.shippedToContains(params.getShiptotype());
        
        BooleanExpression shipped_after = ContainersSearchPredicates.shipped_after(params.getShipped_after());
        BooleanExpression shipped_before = ContainersSearchPredicates.shipped_before(params.getShipped_before());
        BooleanExpression isDiscarded = ContainersSearchPredicates.discardedContains(params.getDiscarded());
        
        BooleanExpression thisComment = ContainersSearchPredicates.commentContains(params.getComment());
       
        if(params.getCommentisExact().contains("false")){
            thisComment = ContainersSearchPredicates.commentLike(params.getComment());
        }
         
        BooleanExpression thisBarCode = ContainersSearchPredicates.barcodeContains(params.getBarcode());
         if(params.getBarcodeisExact().contains("false")){
            thisBarCode = ContainersSearchPredicates.barcodeLike(params.getBarcode());
        }
         
        logger.info("in container_search_svc...");
        logger.info(withThisName.toString());
        
        Iterable<Tblcontainers> res = containersDao.findAll(withThisName.and(withThisType).and(withThisAlias).and(inThisFreezer)
                                                            .and(shippedTo).and(shipped_after).and(shipped_before)
                                                            .and(withThisPlate_Maker_Init).and(isDiscarded).and(thisComment)
                                                            .and(thisBarCode));
        
        List<Tblcontainers> resList = Lists.newArrayList(res);
       
        logger.info(resList.toString());
        
        return resList;
    }
    
    @Transactional
    @Override
    public Tblcontainers findById(String id){
        return containersDao.findOne(ContainersSearchPredicates.idContains(id));
    }
    
    @Transactional
    @Override
    public Set<ContainerContentDTO> findContainerContentsById(String id){
        Tblcontainers c = containersDao.findOne(ContainersSearchPredicates.idContains(id));
        
        Set<ContainerContentDTO> set = new HashSet<ContainerContentDTO>();
        
        for(Tblcontainercontents cont : c.getTblcontainercontentses()){
            set.add(new ContainerContentDTO(cont));
        }
        
        return set;
    }
}

//.and(withThisAlias).and(withThisType).and(inThisFreezer)
//                                                            .and(shippedTo).and(shipped_after).and(shipped_before)
//                                                            .and(withThisPlate_Maker_Init).and(shipStatus)
//                                                            .and(isDiscarded).and(thisComment).and(thisBarCode)