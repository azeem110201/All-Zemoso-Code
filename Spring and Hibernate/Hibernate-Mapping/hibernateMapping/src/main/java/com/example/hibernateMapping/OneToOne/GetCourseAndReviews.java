package com.example.hibernateMapping.OneToOne;

import com.example.hibernateMapping.OneToOne.entity.Course;
import com.example.hibernateMapping.OneToOne.entity.Instructor;
import com.example.hibernateMapping.OneToOne.entity.InstructorDetail;
import com.example.hibernateMapping.OneToOne.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetCourseAndReviews {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            int primaryId = 13;

            Course course = session.get(Course.class, primaryId);

            System.out.println(course);

            System.out.println(course.getReviews());

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
