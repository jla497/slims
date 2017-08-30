/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.json.genotypePostJson;
import ca.ubc.icapture.genapha.slims.model.Tblgenotypes;
import java.util.List;
import java.util.Set;


/**
 *
 * @author JLee05
 */
public interface GenotypeSearchService {
      List<Tblgenotypes> findBySearchTerm(genotypePostJson searchTerms);
}
