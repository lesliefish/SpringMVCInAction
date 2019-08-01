package com.lesliefish.formtag.textarea;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TextAreaUserController {

    @RequestMapping(value = "/textAreaUser", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("fortag_textarea_user", "command", new User());
    }

    @RequestMapping(value = "/addTextAreaUser", method = RequestMethod.POST)
    public String addUser(User user, ModelMap modelMap) {
        modelMap.addAttribute("username", user.getUsername());
        modelMap.addAttribute("password", user.getPassword());
        modelMap.addAttribute("address", user.getAddress());
        return "formtag_textarea_users";
    }

    ;
}
