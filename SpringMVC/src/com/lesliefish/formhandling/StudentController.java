package com.lesliefish.formhandling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("formhandling_student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(Student student, ModelMap modelMap) {
        modelMap.addAttribute("name", student.getName());
        modelMap.addAttribute("age", student.getAge());
        modelMap.addAttribute("id", student.getId());

        return "formhandling_result";
    }
}
