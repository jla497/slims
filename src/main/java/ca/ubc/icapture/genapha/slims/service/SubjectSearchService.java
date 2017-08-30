/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.json.PhenotypeDTO;
import ca.ubc.icapture.genapha.slims.json.SubjectDTO;
import ca.ubc.icapture.genapha.slims.json.subjectPostJson;
import ca.ubc.icapture.genapha.slims.model.Tblsubject;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 *
 * @author JLee05
 */
public interface SubjectSearchService {
    Set<SubjectDTO> findBySearchTerm(subjectPostJson searchTerms);
    SubjectDTO findById(String id);
    Set<PhenotypeDTO> findTblphenotypesById(String id);
}
