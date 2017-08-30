/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 *
 * @author JLee05
 */
public class HibernateAwareMapper extends ObjectMapper{
    
    public HibernateAwareMapper(){
        Hibernate4Module hm = new Hibernate4Module();
        registerModule(hm);
        
    }

}