package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        // load the spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the spring beans
        SportsCoach coach = context.getBean("coach", SportsCoach.class);

        // call beans methods
        System.out.println(coach.getDailyWorkout());

        // call beans methods using constructor injection
        System.out.println(coach.getDailyFortune());


        // closing the context
        context.close();
    }
}
