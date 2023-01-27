package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // need to create a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need to create a controller method to process the initial HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
