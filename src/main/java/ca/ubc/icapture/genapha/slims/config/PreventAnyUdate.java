/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.config;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 *
 * @author JLee05
 */
/**EntityListener implement to prevent write transactions during runtime on entities 
 managed by the EntityListener.*/
public class PreventAnyUdate {
     @PrePersist
    void onPrePersist(Object o) {
        throw new RuntimeException("Caught Illegal onPrePresist Update");
    }

    @PreUpdate
    void onPreUpdate(Object o) {
        throw new RuntimeException("Caught Illegal onPreUpdate Update");
    }

    @PreRemove
    void onPreRemove(Object o) {
        throw new RuntimeException("Caught Illegal onPreRemove Update");
    }

}
