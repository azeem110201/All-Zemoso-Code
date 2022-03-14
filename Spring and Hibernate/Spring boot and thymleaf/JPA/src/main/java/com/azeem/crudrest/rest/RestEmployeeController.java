package com.azeem.crudrest.rest;

import com.azeem.crudrest.entity.Employee;
import com.azeem.crudrest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RestEmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public RestEmployeeController(EmployeeService employeeService){

        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){

        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> getEmployees(@PathVariable int employeeId){
        Optional<Employee> theEmployee = employeeService.getEmployee(employeeId);

        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);

        employeeService.save(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployees(@RequestBody Employee employee){
        employeeService.save(employee);

        return employee;
    }

    @DeleteMapping("/employees/{empId}")
    public String deleteEmployee(@PathVariable int empId){
        Optional<Employee> theEmployee = employeeService.getEmployee(empId);

        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + empId);
        }

        employeeService.deleteById(empId);

        return "Deleted employee id - " + empId;
    }
}
