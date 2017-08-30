/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.json.PhenotypeDTO;
import ca.ubc.icapture.genapha.slims.json.genotypePostJson;
import ca.ubc.icapture.genapha.slims.json.phenotypePostJson;
import ca.ubc.icapture.genapha.slims.model.Tblgenotypes;
import ca.ubc.icapture.genapha.slims.model.Tblphenotypes;
import java.util.Set;

/**
 *
 * @author JLee05
 */
public interface PhenotypesSearchService {
     Set<PhenotypeDTO> findBySearchTerm(phenotypePostJson searchTerms);
    
}
