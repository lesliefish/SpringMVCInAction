package com.lesliefish.basics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/helloWorld")
public class HelloControllor {
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(ModelMap map) {
        map.addAttribute("message", "hello spring mvc framework~");
        return "basic_helloworld";
    }
}
