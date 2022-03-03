package com.example.hibernateMapping.OneToOne;

import com.example.hibernateMapping.OneToOne.entity.Course;
import com.example.hibernateMapping.OneToOne.entity.Instructor;
import com.example.hibernateMapping.OneToOne.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorsCourses {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            int primaryId = 3;

            Instructor tempInstructor = session.get(Instructor.class, primaryId);

            System.out.println(tempInstructor);

            System.out.println("Associated courses for this Instructor...");

            System.out.println(tempInstructor.getCourses());

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
