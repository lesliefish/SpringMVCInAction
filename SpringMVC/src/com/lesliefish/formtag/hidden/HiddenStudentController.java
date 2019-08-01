package com.lesliefish.formtag.hidden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HiddenStudentController {

    @RequestMapping(value = "/hiddenStudent", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("formtag_hidden_student", "command", new Student());
    }

    @RequestMapping(value = "/addHiddenStudent", method = RequestMethod.POST)
    public String addStudent(Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        return "formtag_hidden_students";
    }
}
