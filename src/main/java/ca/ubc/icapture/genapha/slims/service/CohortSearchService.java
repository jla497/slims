/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.model.Tblcohortlookup;
import ca.ubc.icapture.genapha.slims.model.Tblsubject;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JLee05
 */
public interface CohortSearchService {
    List<Tblcohortlookup> findBySearchTerm(Map<String,String> searchTerms);
    Tblcohortlookup findBySearchTerm2(String searchTerms);
}
