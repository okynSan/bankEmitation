/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.client.DAO.Impl;

import java.util.List;

import javax.transaction.Transactional;
import mbaf.bankemitation.client.DAO.ClientDao;
import mbaf.bankemitation.client.model.Client;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class ClientDaoImpl implements ClientDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    @Override
    public void saveClient(Client client) {
        sessionFactory.getCurrentSession().save(client);
    }

    @Transactional
    @Override
    public List<Client> getClietnByName(String clientName) {
        List clients = sessionFactory.getCurrentSession()
                .createCriteria(Client.class)
                .add(Restrictions.eq("clientName", clientName))
                .list();
        
        return clients;

    }

}
