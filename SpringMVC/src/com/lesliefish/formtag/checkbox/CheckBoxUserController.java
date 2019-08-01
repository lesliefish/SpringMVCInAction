package com.lesliefish.formtag.checkbox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CheckBoxUserController {

    @RequestMapping(value = "/checkBoxUser", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("formtag_checkbox_user", "command", new User());
    }

    @RequestMapping(value = "/addCheckBoxUser", method = RequestMethod.POST)
    public String addUser(User user, ModelMap modelMap) {
        modelMap.addAttribute("username", user.getUsername());
        modelMap.addAttribute("password", user.getPassword());
        modelMap.addAttribute("address", user.getAddress());
        modelMap.addAttribute("receivePaper", user.isReceivePaper());
        return "formtag_checkbox_users";
    }
}
