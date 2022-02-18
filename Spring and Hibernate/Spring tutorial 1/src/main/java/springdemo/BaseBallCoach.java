package springdemo;

public class BaseBallCoach implements SportsCoach{
    private FortuneService fortune;
    BaseBallCoach(){

    }

    BaseBallCoach(FortuneService fortune){
        this.fortune = fortune;
    }


    @Override
    public String getDailyWorkout(){
        return "Spending 30 mins in basket ball training";
    }

    @Override
    public String getDailyFortune() {
        return this.fortune.getFortune();
    }
}
