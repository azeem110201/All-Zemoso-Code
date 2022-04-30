package annotations_and_javaconfig;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Random fortune";
    }
}
