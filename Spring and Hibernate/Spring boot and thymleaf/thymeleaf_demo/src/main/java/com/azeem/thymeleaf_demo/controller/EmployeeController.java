package com.azeem.thymeleaf_demo.controller;

import com.azeem.thymeleaf_demo.model.Employee;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private List<Employee> employees;

    @PostConstruct
    private void loadData(){
        employees = new ArrayList<>();
        Faker faker = new Faker();
        for(int i = 0 ; i < 10; i++){
            Employee emp = new Employee(i+1, faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress());
            employees.add(emp);
        }
    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        model.addAttribute("employees", employees);
        return "list-employees";
    }
}
