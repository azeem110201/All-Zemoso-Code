package springdemo;

public class CricketCoach implements SportsCoach{
    private FortuneService fortune;
    private String teamName;
    private String teamCoach;

    CricketCoach(){

    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public void setTeamCoach(String teamCoach){
        this.teamCoach = teamCoach;
    }

    public void setFortuneService(FortuneService fortune){
        System.out.println("Inside setter method");
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout(){
        return "Spending 30 mins in cricket training";
    }

    @Override
    public String getDailyFortune() {
        return this.fortune.getFortune();
    }

    public String getTeamName(){
        return this.teamName;
    }

    public String getTeamCoach(){
        return this.teamCoach;
    }
}
