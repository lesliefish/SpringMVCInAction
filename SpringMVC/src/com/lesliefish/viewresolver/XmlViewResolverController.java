package com.lesliefish.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class XmlViewResolverController {

    @RequestMapping(value = "/xmlViewResolverHello", method = RequestMethod.GET)
    public String printHello(ModelMap modelMap){
        modelMap.addAttribute("message", "this is a xml view resolver example");
        return "viewresolver_xmlviewresolver_hello";
    }
}
