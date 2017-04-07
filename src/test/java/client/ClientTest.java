package client;

import java.util.ArrayList;
import java.util.List;
import mbaf.bankemitation.DAO.client.ClientContactDao;
import mbaf.bankemitation.DAO.client.ClientDao;
import mbaf.bankemitation.model.client.Client;
import mbaf.bankemitation.model.client.ClientContact;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 *
 * @author andrey_zatvornitskiy
 */
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class ClientTest {

    @Autowired
    ClientDao clientDao;

    @Autowired
    ClientContactDao clientContactDao;

     
//    @Test
    public void saveContactTelefone() {

        Client client = new Client();

        client.setClientName("Andrey");
        client.setClientSurname("Zatvornitskiy");

        ClientContact clientContact = new ClientContact();
        clientContact.setClientPhoneNumbe(0663322555f);
        clientContact.setPhoneStatus(Short.parseShort("1"));
        clientContact.setClientId(client);

        ClientContact clientContact2 = new ClientContact();
        clientContact2.setClientPhoneNumbe(0663322555f);
        clientContact2.setPhoneStatus(Short.parseShort("1"));
        clientContact2.setClientId(client);

        List<ClientContact> clientContacts = new ArrayList<>();

        clientContacts.add(clientContact);
        clientContacts.add(clientContact2);
        client.setClientContactList(clientContacts);
        

        clientContactDao.saveClientContacts(clientContact);

        System.out.println("asd");
    }

//    @Test
    public void getClientContact() {
       
        Client client = new Client();
        client.setClientName("Evgeniy");
        client.setClientSurname("Skakun");
        
        ClientContact clientContact = new ClientContact();
        clientContact.setClientPhoneNumbe(56789f);
        clientContact.setPhoneStatus(Short.parseShort("1"));
        clientContact.setClientId(client);

        ClientContact clientContact2 = new ClientContact();
        clientContact2.setClientPhoneNumbe(12345f);
        clientContact2.setPhoneStatus(Short.parseShort("1"));
        clientContact2.setClientId(client);

        List<ClientContact> clientContacts = new ArrayList<>();
        clientContacts.add(clientContact);
        clientContacts.add(clientContact2);
        
        client.getClientContactList().add(clientContact);
        client.getClientContactList().add(clientContact2);
        
        clientDao.saveClient(client);

//        System.out.println(clients.size());
    }

//    @Test
    public void s() {

        Integer a = 100;
        Integer b = 100;

        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
