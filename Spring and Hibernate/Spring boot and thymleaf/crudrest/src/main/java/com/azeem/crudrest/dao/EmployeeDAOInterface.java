package com.azeem.crudrest.dao;

import com.azeem.crudrest.entity.Employee;

import java.util.List;

public interface EmployeeDAOInterface {
    List<Employee> getAllEmployees();

    Employee getEmployee(int EmpID);

    void save(Employee theEmployee);

    void deleteById(int theId);
}
