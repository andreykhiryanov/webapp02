package com.generation.brainless.webapp02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    private String name = "default";
    private int age = 666;

    @RequestMapping("/nameForm")
    public String showNameForm() {
        return "name-form";
    }

    @RequestMapping("/setName")
    public String setName(@RequestParam("humanName") String name) {
        if (!name.isEmpty()) this.name = name;
        return "age-form";
    }

    @RequestMapping("/setAge")
    public String setAge(@RequestParam("humanAge") String age, Model model) {
        if (!age.isEmpty()) this.age = Integer.parseInt(age);
        processData(model);
        return "info-form";
    }

    public void processData(Model model) {
        model.addAttribute("humanName", this.name);
        model.addAttribute("humanAge", this.age);
    }



    @RequestMapping("/helloWorldForm")
    public String showForm() {
        return "helloworld-form";
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

        // Convert the data to UPPER case

        name = name.toUpperCase();

        // Create the message

        String result = "Hey, my friend, " + name + "!!!";

        // Add message to the model

        model.addAttribute("message", result);

        return "helloworld";
    }

}
