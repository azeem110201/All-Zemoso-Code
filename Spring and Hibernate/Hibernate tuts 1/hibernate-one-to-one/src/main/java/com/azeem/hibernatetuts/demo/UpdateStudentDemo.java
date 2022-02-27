package com.azeem.hibernatetuts.demo;

import com.azeem.hibernatetuts.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student.class).buildSessionFactory();

        // create session object
        Session session = factory.getCurrentSession();
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();

            int primaryKey = 1;

            Student myStudent = session.get(Student.class, primaryKey);

            System.out.println("Student is:" + myStudent);

            myStudent.setEmail("mohdAbdulAzeem@gmail.com");

            session.getTransaction().commit();

            System.out.println("Done");


            // start a new transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("UPDATE Student SET email=REPLACE(email, SUBSTRING(email,INSTR(email,'@')+1),\n" +
                    "'yahoo.com')").executeUpdate();


            session.getTransaction().commit();

            System.out.println("Done");

        }
        finally {
            session.close();
        }
    }
}
