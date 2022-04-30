package com.azeem.crudrest.service;

import com.azeem.crudrest.dao.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void deleteById() {
        employeeRepository.deleteById(9);

        boolean actualResult = employeeRepository.isEmployeeExistsByID(9);

        assertThat(actualResult).isEqualTo(false);

    }
}