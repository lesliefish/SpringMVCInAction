package com.lesliefish.formtag.radiobutton;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RadioButtonUserController {

    @RequestMapping(value = "/radioBtnUser", method = RequestMethod.GET)
    public ModelAndView user() {
        User user = new User();
        user.setFavoriteFrameworks(new String[]{"Spring MVC", "Struts 2"});
        user.setGender("M");
        ModelAndView modelAndView = new ModelAndView("formtag_radiobutton_user", "command", user);
        return modelAndView;
    }

    @RequestMapping(value = "/addRadioBtnUser", method = RequestMethod.POST)
    public String addUser(User user, ModelMap model) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("address", user.getAddress());
        model.addAttribute("receivePaper", user.isReceivePaper());
        model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
        model.addAttribute("gender", user.getGender());
        return "formtag_radiobutton_users";
    }

    @ModelAttribute("webFrameworkList")
    public List<String> getWebFrameworkList() {
        List<String> list = new ArrayList<String>();
        list.add("Spring MVC");
        list.add("Struts 1");
        list.add("Struts 2");
        list.add("Apache Wicket");
        return list;
    }
}
