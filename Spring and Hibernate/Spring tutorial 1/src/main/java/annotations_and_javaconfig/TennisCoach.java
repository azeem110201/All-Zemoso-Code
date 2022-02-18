package annotations_and_javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;

    TennisCoach(){ }

//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand valley";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
