/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Controller
public class ClientController {
    
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addNewUser(){
        // to do;
    }
}
