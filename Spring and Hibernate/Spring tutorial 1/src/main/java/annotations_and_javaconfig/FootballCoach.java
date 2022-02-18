package annotations_and_javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    FootballCoach(){ }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "Practice backflip and goalkeeping today";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

}
