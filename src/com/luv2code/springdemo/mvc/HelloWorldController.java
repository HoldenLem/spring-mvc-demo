package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

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

    // add new controller ti read from date and

    // add date to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request , Model model) {

        // read the request parameter from HTML form
        String theName = request.getParameter("studentName");

        // convert the date to all caps
        theName = theName.toUpperCase();

        // create the massage
        String result = "Yo! " + theName;

        // add massage to the model
        model.addAttribute("message", result);

        return "helloworld";
    }


}
