package annotations_and_javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("annotations_and_javaconfig")
@PropertySource("classpath:sport.properties")
public class SportsConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for swim
    @Bean
    public Coach swimCoach(){
        return new SwinCoach(sadFortuneService());
    }

}
