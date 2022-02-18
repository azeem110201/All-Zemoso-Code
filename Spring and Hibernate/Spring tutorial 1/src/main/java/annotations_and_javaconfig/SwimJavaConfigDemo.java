package annotations_and_javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo {
    public static void main(String[] args) {
        // read the config xml file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

        //get the bean from the container
        // Coach coach = context.getBean("swimCoach", Coach.class);
        SwinCoach coach = context.getBean("swimCoach", SwinCoach.class);

        // call the method inside the bean
        System.out.println(coach.getDailyWorkout());

        // call method for daily fortune using Autowired Constructor Injection
        System.out.println(coach.getDailyFortune());

        // printing instance variables
        System.out.println(coach.getTeamName());
        System.out.println(coach.getTeamCoach());

        // close the bean
        context.close();
    }
}
