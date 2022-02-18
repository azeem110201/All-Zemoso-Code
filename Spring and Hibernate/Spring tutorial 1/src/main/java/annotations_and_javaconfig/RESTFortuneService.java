package annotations_and_javaconfig;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "REST fortune";
    }
}
