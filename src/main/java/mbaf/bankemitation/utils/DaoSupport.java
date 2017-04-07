/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.utils;

import org.hibernate.SessionFactory;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class DaoSupport {
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public SessionFactory getSession(){
        return sessionFactory;
    }
    
    
}
