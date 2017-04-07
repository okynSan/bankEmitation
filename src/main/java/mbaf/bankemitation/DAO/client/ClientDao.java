/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.DAO.client;

import java.util.List;
import mbaf.bankemitation.model.client.Client;

/**
 *
 * @author andrey_zatvornitskiy
 */
public interface ClientDao {
    
    public void saveClient(Client client);
    public List<Client> getClietnByName(String clientName);
    
}
