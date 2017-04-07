/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.controller.users;

import mbaf.bankemitation.model.users.Users;
import mbaf.bankemitation.services.users.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Controller
public class UsersController {
    
    @Autowired
    UsersServices usersServices;
    
    @RequestMapping(value = "/user_managment", method = RequestMethod.GET)
    public String getUsers(Model model){
        
        model.addAttribute("user", new Users());
        model.addAttribute("userList", this.usersServices.getAllUser());
        
        return "userAdministration";
    }
    
}
