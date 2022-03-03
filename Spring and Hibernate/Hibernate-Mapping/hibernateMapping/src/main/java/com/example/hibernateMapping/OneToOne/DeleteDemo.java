package com.example.hibernateMapping.OneToOne;

import com.example.hibernateMapping.OneToOne.entity.Instructor;
import com.example.hibernateMapping.OneToOne.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session = factory.getCurrentSession();

            int primaryID = 1;

            session.beginTransaction();

            InstructorDetail instructorDetail = session.get(InstructorDetail.class, primaryID);

            if(instructorDetail != null){
                System.out.println(instructorDetail);

                System.out.println("Associated instructor for this instructor detail is...");
                System.out.println(instructorDetail.getInstructor());

                session.delete(instructorDetail);
            }
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
