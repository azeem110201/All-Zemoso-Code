package com.example.hibernateMapping.OneToOne;

import com.example.hibernateMapping.OneToOne.entity.Course;
import com.example.hibernateMapping.OneToOne.entity.Instructor;
import com.example.hibernateMapping.OneToOne.entity.InstructorDetail;
import com.example.hibernateMapping.OneToOne.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseReviewDemo {
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

//            Course tempCourse = new Course("Pacman - How To Score One Million Points");
//
//            tempCourse.addReview(new Review("Great course ... loved it!"));
//            tempCourse.addReview(new Review("Cool course, job well done"));
//            tempCourse.addReview(new Review("What a dumb course, you are an idiot!"));

            Course tempCourse = session.get(Course.class, 11);

            tempCourse.addReview(new Review("Great course !"));
            tempCourse.addReview(new Review("Awesome"));
            tempCourse.addReview(new Review("Not to my expectation!"));

            System.out.println(tempCourse);

            System.out.println(tempCourse.getReviews());

            session.save(tempCourse);

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
