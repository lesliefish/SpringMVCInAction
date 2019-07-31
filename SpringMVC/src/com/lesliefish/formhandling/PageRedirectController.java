package com.lesliefish.formhandling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageRedirectController {
    @RequestMapping(value = "/pageRedirectIndex", method = RequestMethod.GET)
    public String index() {
        return "formhandling_pageRedirectIndex";
    }
    @RequestMapping(value = "/pageRedirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:pageRedirectFinalPage";
    }

    @RequestMapping(value = "/pageRedirectFinalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "formhandling_final";
    }
}
