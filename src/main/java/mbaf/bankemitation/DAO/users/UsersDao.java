/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.DAO.users;

import java.util.List;
import mbaf.bankemitation.model.users.Users;

/**
 *
 * @author andrey_zatvornitskiy
 */
public interface UsersDao {
    List<Users> getUserById(Long userId);
    List<Users> getAllUser();
    List<Users> getUserByCriteria(Users user);
    void createOrUpdateUser(Users user);
}
