package com.azeem.crudrest.dao;

import com.azeem.crudrest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it ... no need to write any code
    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Employee s WHERE s.id = ?1")
    Boolean isEmployeeExistsByID(int id);

}
