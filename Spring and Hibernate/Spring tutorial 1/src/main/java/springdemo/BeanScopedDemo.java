package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopedDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");

        SportsCoach coach = context.getBean("coach", SportsCoach.class);

        SportsCoach alphaCoach = context.getBean("coach", SportsCoach.class);

        // check if both the beans are pointing to same object
        boolean result = (coach == alphaCoach);

        System.out.println(result);
        System.out.println("Memory location of coach" + coach);
        System.out.println("Memory location of alpha coach" + alphaCoach);

        context.close();
    }
}
