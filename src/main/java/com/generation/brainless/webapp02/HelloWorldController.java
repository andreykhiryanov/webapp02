package com.generation.brainless.webapp02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/nameForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/ageForm")
    public String ageForm() {
        return "age-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShooutDude(HttpServletRequest request, Model model) {

        // Reading the request parameter from the HTML form

        String theName = request.getParameter("studentName");

        // Convert the data to UPPER case

        theName = theName.toUpperCase();

        // Create the message

        String result = "HEY, " + theName + "!!!";

        // Add message to the model

        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {

        // Reading the request parameter from the HTML form



        // Convert the data to UPPER case

        name = name.toUpperCase();

        // Create the message

        String result = "Hey, my friend, " + name + "!!!";

        // Add message to the model

        model.addAttribute("message", result);

        return "helloworld";
    }

}
