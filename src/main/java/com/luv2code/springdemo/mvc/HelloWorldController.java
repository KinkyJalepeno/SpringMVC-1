package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showform")
    public String showForm() {

        return "helloworld-form";

    }

    @RequestMapping("/processForm")
    public String processForm() {

        return "helloworld";
    }

    // new controller method to read form data and add to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the html form
        String theName = request.getParameter("studentName");

        // create a new message
        String result = "Yo " + theName.toUpperCase();

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
