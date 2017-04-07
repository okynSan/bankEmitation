/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.DAO.client.impl;

import java.util.List;
import mbaf.bankemitation.DAO.client.ClientAddressDao;
import mbaf.bankemitation.model.client.ClientAddress;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;


public class ClientAddressDaoImpl implements ClientAddressDao {
    
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<ClientAddress> getClientAddressesbyId(int id) {
        List clientAddresses = sessionFactory.getCurrentSession()
                .createCriteria(ClientAddress.class)
                .add(Restrictions.eq("clientContactId", id))
                .list();
        
        return clientAddresses;
    }

    @Override
    public void saveClientAddresses(ClientAddress clientAddress) {
        sessionFactory.getCurrentSession().save(clientAddress);
    }
    
}
