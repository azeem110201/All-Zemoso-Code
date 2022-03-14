package com.azeem.crudrest.service;

import com.azeem.crudrest.dao.EmployeeDAOInterface;
import com.azeem.crudrest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface{
    private EmployeeDAOInterface employeeDAO;

    @Autowired
    public EmployeeService(EmployeeDAOInterface employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return this.employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployee(int empID) {
        return this.employeeDAO.getEmployee(empID);
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
