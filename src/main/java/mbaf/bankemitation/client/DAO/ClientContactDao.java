/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.client.DAO;

import java.util.List;
import mbaf.bankemitation.client.model.ClientContact;

/**
 *
 * @author andrey_zatvornitskiy
 */
public interface ClientContactDao {
    
//    public List<ClientContact> getClientContqct();
    
    public void saveClientContacts(ClientContact clientContacts);
    
}
