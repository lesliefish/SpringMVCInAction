package com.lesliefish.formtag.textbox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TextBoxStudentController {
    @RequestMapping(value = "/formTagStudent", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("formtag_textbox_student", "command", new Student());
    }

    @RequestMapping(value = "/addFormTagStudent", method = RequestMethod.POST)
    public String addStudent(Student student, ModelMap modelMap) {
        modelMap.addAttribute("name", student.getName());
        modelMap.addAttribute("age", student.getAge());
        modelMap.addAttribute("id", student.getId());

        return "formtag_textbox_result";
    }
}
