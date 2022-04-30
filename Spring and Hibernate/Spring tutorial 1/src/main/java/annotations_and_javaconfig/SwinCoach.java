package annotations_and_javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class SwinCoach implements Coach{
    // reading values from properties files
    @Value("${foo.teamName}")
    private String teamName;

    @Value("${foo.teamCoach}")
    private String teamCoach;

    private FortuneService fortuneService;

    public SwinCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim deeper today";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    public String getTeamCoach(){
        return this.teamCoach;
    }

    public String getTeamName(){
        return this.teamName;
    }
}
