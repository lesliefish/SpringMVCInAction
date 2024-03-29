package com.lesliefish.formtag.errors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorStudentController {

    @Autowired
    @Qualifier("studentValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator((org.springframework.validation.Validator) validator);
    }

    @RequestMapping(value = "/errorStudent")
    public ModelAndView student() {
        return new ModelAndView("formtag_errors_student", "command", new Student());
    }

    @ModelAttribute("student")
    public Student createStudentModel() {
        return new Student();
    }

    @RequestMapping(value = "/addErrorStudent")
    public String addStudent(@ModelAttribute("student") @Validated Student student, BindingResult bindingResult, ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "formtag_errors_student";
        }
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());

        return "formtag_errors_students";
    }
}
