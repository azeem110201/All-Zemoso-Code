package com.azeem.hibernatetuts.demo;

import com.azeem.hibernatetuts.demo.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student.class).buildSessionFactory();

        // create session object
        Session session = factory.getCurrentSession();
        try{
            session.beginTransaction();

            System.out.println("Printing all the students in the table");
            List<Student> students = session.createQuery("from Student").getResultList();

            System.out.println(students);

            students = session.createQuery("from Student s where s.lastName='Azeem' or s.firstName='Kiran'").getResultList();

            System.out.println("Printing students whose last name is Azeem or first name is Kiran");
            System.out.println(students);

            students = session.createQuery("from Student s where s.email like '%gmail.com%'").getResultList();

            System.out.println("Printing all students having gmail email id");
            System.out.println(students);



            session.getTransaction().commit();

            System.out.println("Done");
        }
        finally {
            session.close();
        }
    }
}
