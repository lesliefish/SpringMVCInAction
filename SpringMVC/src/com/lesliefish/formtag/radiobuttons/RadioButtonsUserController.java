package com.lesliefish.formtag.radiobuttons;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RadioButtonsUserController {

    @RequestMapping(value = "/radioButtonsUser", method = RequestMethod.GET)
    public ModelAndView user() {
        User user = new User();
        user.setFavoriteFrameworks(new String[]{"Spring MVC", "Struts 2"});
        user.setGender("M");
        ModelAndView modelAndView = new ModelAndView("formtag_radioButtons_user", "command", user);
        return modelAndView;
    }

    @RequestMapping(value = "/addRadioButtonsUser", method = RequestMethod.POST)
    public String addUser(User user, ModelMap model) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("address", user.getAddress());
        model.addAttribute("receivePaper", user.isReceivePaper());
        model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
        model.addAttribute("gender", user.getGender());
        model.addAttribute("favoriteNumber", user.getFavoriteNumber());
        return "formtag_radioButtons_users";
    }

    @ModelAttribute("webFrameworkList")
    public List<String> getWebFrameworkList() {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Struts 1");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Wicket");
        return webFrameworkList;
    }

    @ModelAttribute("numbersList")
    public List<String> getNumerList() {
        List<String> numbersList = new ArrayList<String>();
        numbersList.add("1");
        numbersList.add("2");
        numbersList.add("3");
        numbersList.add("4");
        return numbersList;
    }
}
