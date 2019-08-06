package com.lesliefish.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InternalResourceViewResolverController {
    @RequestMapping(value = "/internalResourceHello", method = RequestMethod.GET)
    public String printHello(ModelMap modelMap) {
        modelMap.addAttribute("message", "it is a test about internal resource hello");
        return "viewresolver_internalresourceviewresolver_hello";
    }
}
