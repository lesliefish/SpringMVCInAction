package com.lesliefish.formtag.password;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PasswordUserController {

    @RequestMapping(value = "/passwordUser", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("formtag_password_user", "command", new User());
    }

    @RequestMapping(value = "/passwordAddUser", method = RequestMethod.POST)
    public String addUser(User user, ModelMap modelMap) {
        modelMap.addAttribute("userName", user.getUserName());
        modelMap.addAttribute("password", user.getPassword());

        return "formtag_password_users";
    }
}
