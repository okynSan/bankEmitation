/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.DAO.client.impl;

import java.util.List;
import javax.transaction.Transactional;
import mbaf.bankemitation.DAO.client.ClientContactDao;
import mbaf.bankemitation.model.client.ClientContact;
import org.hibernate.SessionFactory;


public class ClientContactDaoImpl implements ClientContactDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
//    @Override
//    public List<ClientContact> getClientContqct() {
//       
//    }

    @Transactional
    @Override
    public void saveClientContacts(ClientContact clientContacts) {
        sessionFactory.getCurrentSession().save(clientContacts);
    }
    
}
