package com.example.springmvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        // @InitBinder will preprocess all the web request coming to the controller

        //remove leading and tailing white spaces
        StringTrimmerEditor trimSpaces = new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class, trimSpaces);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer newCustomer, BindingResult bindingResult){
        // @Valid annotation tell spring to validate the customer object
        // BindingResult will tell spring to store the results of validation in bindingResult object
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult);
            return "customer-form";
        }

        return "customer-confirmation";
    }
}
