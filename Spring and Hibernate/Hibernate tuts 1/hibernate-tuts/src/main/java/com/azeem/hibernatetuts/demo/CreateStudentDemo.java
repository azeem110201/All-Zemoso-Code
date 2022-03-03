package com.azeem.hibernatetuts.demo;

import com.azeem.hibernatetuts.demo.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student.class).buildSessionFactory();

        // create session object
        Session session = factory.getCurrentSession();
        try{

            // create student object
            System.out.println("Creating student object");
            Student newStudent_1 = new Student("Abdul","Azeem","abdulAzeem@gmail.com");
            Student newStudent_2 = new Student("Rohan","Kumar","rohanKumar@gmail.com");
            Student newStudent_3 = new Student("Hriman","Mandal","hrimanMandal@gmail.com");
            Student newStudent_4 = new Student("Micheal","Joseph","michealJoseph@gmail.com");

            // begin the transaction
            System.out.println("Starting the transaction");
            session.beginTransaction();

            // save student object to hibernate
            System.out.println("Saving object in the database");
            session.save(newStudent_1);
            session.save(newStudent_2);
            session.save(newStudent_3);
            session.save(newStudent_4);

            // commit the transaction
            System.out.println("Committing the changes");
            session.getTransaction().commit();

            System.out.println("Done");

        }
        finally {
            session.close();
        }
    }
}
