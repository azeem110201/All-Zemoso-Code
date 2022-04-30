package com.example.hibernateMapping.OneToOne;

import com.example.hibernateMapping.OneToOne.entity.Instructor;
import com.example.hibernateMapping.OneToOne.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session = factory.getCurrentSession();

//            Instructor tempInstructor =
//                    new Instructor("Chad", "Darby", "darby@luv2code.com");
//
//            InstructorDetail tempInstructorDetail =
//                    new InstructorDetail(
//                            "http://www.luv2code.com/youtube",
//                            "Luv 2 code!!!");

            Instructor tempInstructor =
                    new Instructor("Madhu", "Patel", "madhu@luv2code.com");

            InstructorDetail tempInstructorDetail =
                    new InstructorDetail(
                            "http://www.youtube.com",
                            "Guitar");

            session.beginTransaction();

            tempInstructor.setInstructorDetail(tempInstructorDetail);

            session.save(tempInstructor);

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
