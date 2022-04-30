package com.azeem.crudrest.dao;

import com.azeem.crudrest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface{

    private EntityManager entityManager;

    // using constructor injection
    @Autowired
    // entity manager already created by spring boot. It is much similar to SessionFactory
    public EmployeeDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        // get the current hibernate session
        Session session = entityManager.unwrap(Session.class);

        List<Employee> employees = session.createQuery(
                "from Employee", Employee.class
        ).getResultList();

        return employees;
    }

    @Override
    public Employee getEmployee(int EmpID) {
        // get the current hibernate session
        Session session = entityManager.unwrap(Session.class);

        Employee employee = session.get(Employee.class, EmpID);

        return employee;
    }

    @Override
    public void save(Employee theEmployee) {
        // get the current hibernate session
        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        // get the current hibernate session
        Session session = entityManager.unwrap(Session.class);

        Query theQuery =
                session.createQuery(
                        "delete from Employee where id=:employeeId");
        theQuery.setParameter("employeeId", theId);

        theQuery.executeUpdate();
    }
}
