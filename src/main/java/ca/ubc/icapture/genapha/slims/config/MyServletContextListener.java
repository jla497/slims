/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.config;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JLee05
 */

public class MyServletContextListener implements ServletContextListener{
    
    final Logger logger = LoggerFactory.getLogger(this.getClass()); 
    
     @Override
    public void contextInitialized(ServletContextEvent sce) {
        // On Application Startup, please…

        // Usually I'll make a singleton in here, set up my pool, etc.
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    // ... First close any background tasks which may be using the DB ...
    // ... Then close any DB connection pools ...

    // Now deregister JDBC drivers in this context's ClassLoader:
    // Get the webapp's ClassLoader
    ClassLoader cl = Thread.currentThread().getContextClassLoader();
    // Loop through all drivers
    Enumeration<Driver> drivers = DriverManager.getDrivers();
    while (drivers.hasMoreElements()) {
        Driver driver = drivers.nextElement();
        if (driver.getClass().getClassLoader() == cl) {
            // This driver was registered by the webapp's ClassLoader, so deregister it:
            try {
                logger.info("Deregistering JDBC driver {}", driver);
                DriverManager.deregisterDriver(driver);
            } catch (SQLException ex) {
                logger.error("Error deregistering JDBC driver {}", driver, ex);
            }
        } else {
            // driver was not registered by the webapp's ClassLoader and may be in use elsewhere
            logger.trace("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader", driver);
        }
    }
  }
    
}
