package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    public String shoForm(Model model) {

        // create a new student object
        Student theStudent = new Student();

        // add new object to the model
        model.addAttribute("student", theStudent);

        return "student-form";
    }
}
