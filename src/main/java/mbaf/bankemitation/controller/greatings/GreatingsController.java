/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.controller.greatings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Controller

public class GreatingsController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getGreating(ModelMap modelMap) {
        modelMap.addAttribute("getGreatings", "Hello Spring, nice to be back");
        return "greatings";

    }

}
