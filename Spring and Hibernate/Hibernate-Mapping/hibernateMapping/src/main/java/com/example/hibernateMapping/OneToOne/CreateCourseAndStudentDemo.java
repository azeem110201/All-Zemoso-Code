package com.example.hibernateMapping.OneToOne;

import com.example.hibernateMapping.OneToOne.entity.*;
import com.github.javafaker.Faker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        Faker faker = new Faker();

        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            Course tempCourse = new Course("Rust programming");

            session.save(tempCourse);

            System.out.println("Course saved");

            Student tempStudent1 = new Student(faker.name().firstName(), faker.name().lastName(), faker.name().firstName() + faker.name().lastName() + "@gmail.com");
            Student tempStudent2 = new Student(faker.name().firstName(), faker.name().lastName(), faker.name().firstName() + faker.name().lastName() + "@gmail.com");

            tempCourse.addStudent(tempStudent1);
            tempCourse.addStudent(tempStudent2);

            System.out.println("saving student.....");
            session.save(tempStudent1);
            session.save(tempStudent2);

            System.out.println(tempCourse.getStudents());

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
