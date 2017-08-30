/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;


import ca.ubc.icapture.genapha.slims.model.Tblshippedto;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JLee05
 */
public interface ShippedtoTypeSearchService {
       List<Tblshippedto> findBySearchTerm(Map<String,String> searchTerms);
}
