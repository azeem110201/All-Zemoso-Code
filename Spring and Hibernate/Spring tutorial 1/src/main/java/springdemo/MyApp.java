package springdemo;

public class MyApp {
    public static void main(String[] args) {
        SportsCoach coach = new BaseBallCoach();
        System.out.println(coach.getDailyWorkout());

        coach = new CricketCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
