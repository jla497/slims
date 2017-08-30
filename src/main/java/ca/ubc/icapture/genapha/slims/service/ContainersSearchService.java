/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.json.ContainerContentDTO;
import ca.ubc.icapture.genapha.slims.json.containerPostJson;
import ca.ubc.icapture.genapha.slims.model.Tblcontainers;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author JLee05
 */
public interface ContainersSearchService {
    List<Tblcontainers> findBySearchTerm(containerPostJson searchTerms);

    public Tblcontainers findById(String id);
    
    Set<ContainerContentDTO> findContainerContentsById(String id);
    
}
