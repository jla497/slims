/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author JLee05
 */
public class UserPostJson {
    String username;

    String password;

    public UserPostJson() {
    
        this.username="";
        this.password="";
    
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
