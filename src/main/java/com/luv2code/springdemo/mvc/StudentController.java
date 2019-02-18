package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create a new student object
        StudentClass theStudent = new StudentClass();

        // add student object to model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    // called from student-form and where we grab the data contained in theStudent and drop into modelAttribute
    // "student" to be referenced in student.confirmation.jsp
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") StudentClass theStudent) {

        return "student-confirmation";

    }

}
