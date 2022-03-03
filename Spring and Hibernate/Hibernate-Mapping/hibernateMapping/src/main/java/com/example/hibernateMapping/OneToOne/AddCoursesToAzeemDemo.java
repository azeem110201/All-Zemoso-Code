package com.example.hibernateMapping.OneToOne;

import com.example.hibernateMapping.OneToOne.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AddCoursesToAzeemDemo {
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

            int primaryId = 28;

            Student tempStudent = session.get(Student.class, primaryId);

            //Course tempCourses1 = new Course("English");
            Course tempCourses2 = new Course("Maths");

            //tempCourses1.addStudent(tempStudent);
            tempCourses2.addStudent(tempStudent);

            //session.save(tempCourses1);
            session.save(tempCourses2);

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
