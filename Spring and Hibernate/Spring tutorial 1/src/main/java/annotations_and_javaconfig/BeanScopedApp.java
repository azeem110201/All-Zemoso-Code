package annotations_and_javaconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopedApp {
    public static void main(String[] args) {
        // read the config xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");

        //get the bean from the container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach == alphaCoach);

        System.out.println("The memory location of theCoach" + theCoach);

        System.out.println("The memory location of theCoach" + alphaCoach);

        context.close();
    }
}
