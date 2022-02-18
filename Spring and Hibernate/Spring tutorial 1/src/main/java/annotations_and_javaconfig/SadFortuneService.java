package annotations_and_javaconfig;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "I got hurt while swimming";
    }
}
