package com.azeem.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String getHome(Model model){
        model.addAttribute("time", new Date());
        return "home-page";
    }
}
