package com.example.hibernateMapping.OneToOne;

import com.example.hibernateMapping.OneToOne.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteAzeemDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            Student tempStudent = session.get(Student.class, 4);

            System.out.println(tempStudent);

            System.out.println(tempStudent.getCourses());

            session.delete(tempStudent);

            session.getTransaction().commit();

            System.out.println("Done");


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
