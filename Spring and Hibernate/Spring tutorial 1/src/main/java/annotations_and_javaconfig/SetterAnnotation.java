package annotations_and_javaconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAnnotation {
    public static void main(String[] args) {
        // read the config xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");

        //get the bean from the container
        Coach coach = context.getBean("footballCoach", Coach.class);

        // call the method inside the bean
        System.out.println(coach.getDailyWorkout());

        // call method for daily fortune using Autowired Constructor Injection
        System.out.println(coach.getDailyFortune());

        // close the bean
        context.close();
    }
}
