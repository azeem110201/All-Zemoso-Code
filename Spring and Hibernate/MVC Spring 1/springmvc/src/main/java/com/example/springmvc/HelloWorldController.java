package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // add controller to show the form

    @RequestMapping("/showForm")
    public String showForm(){
        return "Home-form";
    }

    // add controller to process the form and add the data to the model

//    @RequestMapping("/processForm")
//    public String processForm(HttpServletRequest request, Model model){
//        // get the HTML data using request object
//
//        String name = request.getParameter("studentName");
//
//        // process the data
//        name = "Hi " + name.toUpperCase();
//
//        model.addAttribute("greetings", name);
//
//        return "Home";
//    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("studentName") String name, Model model){

        // process the data
        name = "Hi " + name.toUpperCase();

        model.addAttribute("greetings", name);

        return "Home";
    }


}
