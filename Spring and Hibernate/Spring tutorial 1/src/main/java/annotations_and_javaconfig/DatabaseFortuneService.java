package annotations_and_javaconfig;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "database fortune";
    }
}
