package com.azeem.crudrest.dao;

import com.azeem.crudrest.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Test
    void isEmployeeExistsByID() {
//        Employee employee = new Employee("Abdul", "Sajjad", "abdulSajjad@gmail.com");
//        employeeRepository.save(employee);
//
//        boolean actualResult = employeeRepository.isEmployeeExistsByID(employee.getId());
//
//        assertThat(actualResult).isEqualTo(true);
    }
}