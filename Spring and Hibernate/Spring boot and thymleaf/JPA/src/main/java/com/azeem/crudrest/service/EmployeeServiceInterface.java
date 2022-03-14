package com.azeem.crudrest.service;

import com.azeem.crudrest.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    List<Employee> getEmployees();
    Optional<Employee> getEmployee(int empID);
    public void save(Employee theEmployee);

    public void deleteById(int theId);

}
