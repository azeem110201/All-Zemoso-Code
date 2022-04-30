package com.azeem.hibernatetuts.demo;

import com.azeem.hibernatetuts.demo.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {
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

            session.delete(myStudent);

            session.getTransaction().commit();

            System.out.println("Done");

            // deleting one more

            session = factory.getCurrentSession();
            session.beginTransaction();

            primaryKey = 2;

            myStudent = session.get(Student.class, primaryKey);

            System.out.println("Student is:" + myStudent);

            session.createQuery("delete from Student where id=2").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done");

        }
        finally {
            session.close();
        }
    }
}
