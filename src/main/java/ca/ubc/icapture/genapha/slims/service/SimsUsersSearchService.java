/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.service;

import ca.ubc.icapture.genapha.slims.json.UserPostJson;
import ca.ubc.icapture.genapha.slims.model.Tblsimsusers;

/**
 *
 * @author JLee05
 */
public interface SimsUsersSearchService {
    Tblsimsusers findUser(UserPostJson user);
}
