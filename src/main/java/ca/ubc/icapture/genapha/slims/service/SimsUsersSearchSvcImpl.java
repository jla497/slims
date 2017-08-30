/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.dao.TblsimusersRepository;
import ca.ubc.icapture.genapha.slims.json.UserPostJson;
import ca.ubc.icapture.genapha.slims.model.Tblsimsusers;
import com.mysema.query.types.expr.BooleanExpression;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JLee05
 */

@Service
public class SimsUsersSearchSvcImpl implements SimsUsersSearchService {
    
    @Autowired
    TblsimusersRepository userDao;
    
    final Logger logger = LoggerFactory.getLogger(this.getClass());
     
    @Transactional
    @Override
    public Tblsimsusers findUser(UserPostJson params){
    
        String username = params.getUsername();
        
        String password = params.getPassword();
        
        String encryptPwd = criptString(password);
        
        logger.info("in user search service...");
                
        logger.info("encryptedPwd: "+password);
        
        System.out.println("encryptedPwd: "+password);
        
        BooleanExpression thisUserName = SimsUserSearchPredicates.userNameContains(username);
        
        BooleanExpression thisPassword = SimsUserSearchPredicates.passwordContains(encryptPwd);
        
       return userDao.findOne(thisUserName.and(thisPassword));
 
    }
    
    public String criptString(String pswd) {
        StringBuffer xyz = new StringBuffer();
        try {
            byte inarray[] = pswd.getBytes();
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(inarray, 0, inarray.length);
            byte outarray[] = md5.digest();
            for (int i = 0; i < outarray.length; i++) {
                xyz.append(outarray[i]);
            }
        } catch (NoSuchAlgorithmException ex) {
        }
        return xyz.toString();
    }
}
