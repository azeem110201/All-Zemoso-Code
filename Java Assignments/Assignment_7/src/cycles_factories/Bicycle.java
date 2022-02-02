package cycles_factories;

public class Bicycle implements Cycle{
    @Override
    public void checkBrakingSystem() {
        System.out.println("Checking the quality of braking system for Bicycle");
    }

    @Override
    public void checkPaddleSystem() {
        System.out.println("Checking the quality of paddle system for Bicycle");
    }


}
