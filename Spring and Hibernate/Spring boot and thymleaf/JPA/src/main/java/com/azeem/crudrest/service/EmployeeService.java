package com.azeem.crudrest.service;

import com.azeem.crudrest.dao.EmployeeRepository;
import com.azeem.crudrest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface{
    private EmployeeRepository employeeDAO;

    @Autowired
    public EmployeeService(EmployeeRepository employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return this.employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Optional<Employee> getEmployee(int empID) {

        return this.employeeDAO.findById(empID);
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        this.employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        this.employeeDAO.deleteById(theId);
    }
}
