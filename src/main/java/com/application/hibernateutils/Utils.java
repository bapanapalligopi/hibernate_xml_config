/**
 * Utility class for managing Hibernate sessions.
 */
package com.application.hibernateutils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.application.models.Customer;

/**
 * This class provides methods to interact with Hibernate sessions.
 */
public class Utils {

    /**
     * Creates and returns a new Hibernate session.
     * 
     * @return a Hibernate Session object
     */
    public Session getSession() {
        // Create a new Configuration instance
        Configuration configuration = new Configuration();
        
        // Load configuration settings from hibernate.cfg.xml
        configuration.configure();
        
        // Add the Customer entity class to the configuration
        configuration.addAnnotatedClass(Customer.class);
        
        // Build the SessionFactory from the configuration
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        // Open a new session from the SessionFactory
        Session session = sessionFactory.openSession();
        
        // Return the newly created session
        return session;
    }
}
