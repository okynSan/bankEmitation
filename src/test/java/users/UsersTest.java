/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import mbaf.bankemitation.DAO.users.UsersDao;
import mbaf.bankemitation.model.users.Users;
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
public class UsersTest {

    @Autowired
    UsersDao usersDao;

    @Test
    public void saveUser() {

        Users users = new Users();
        users.setUserAlias("an_za");
        users.setUserName("Andrey");
        users.setUserSurname("Zatvor");
        users.setUserEmail("okyn.san@gmail.com");

        usersDao.createOrUpdateUser(users);

    }

}
