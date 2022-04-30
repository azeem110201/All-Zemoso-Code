package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMethodsDemo {
    public static void main(String[] args) {
        // load the spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the spring beans
        SportsCoach coach = context.getBean("mycoach", SportsCoach.class);

        // call beans methods
        System.out.println(coach.getDailyWorkout());

        // call beans methods using setter injection
        System.out.println(coach.getDailyFortune());


        // printing instance variables of the class
        System.out.println(((CricketCoach) coach).getTeamName());
        System.out.println(((CricketCoach) coach).getTeamCoach());

        context.close();
    }
}
