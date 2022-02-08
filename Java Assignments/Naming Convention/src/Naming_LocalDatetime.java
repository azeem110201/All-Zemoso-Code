import java.time.LocalDateTime;

class TimeClock{
    private LocalDateTime now;

    TimeClock(){
        this.now = LocalDateTime.now();
    }

    public LocalDateTime getPresentTime(){
        return this.now;
    }

    public LocalDateTime getTimeAfterOneHour(){
        return this.now.plusMinutes(60);
    }

    public LocalDateTime getTimeAfterNthHour(long numberOfHours){
        return this.now.plusMinutes(60 * numberOfHours);
    }

}

public class Naming_LocalDatetime {
    public static void main(String[] args) {
        TimeClock clock = new TimeClock();
        System.out.println(clock.getTimeAfterOneHour());
        System.out.println(clock.getTimeAfterNthHour(12));
        System.out.println(clock.getPresentTime());
    }
}
