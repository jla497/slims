/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.json.ContainerContentDTO;
import ca.ubc.icapture.genapha.slims.json.SampleDTO;
import ca.ubc.icapture.genapha.slims.json.samplePostJson;
import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.Tblsamples;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public interface SampleSearchService {
     List<SampleDTO> findBySearchTerm(samplePostJson searchTerms);
     
     Tblsamples findById(String id);
     
     Set<ContainerContentDTO> findContainerContents(String id);

}
