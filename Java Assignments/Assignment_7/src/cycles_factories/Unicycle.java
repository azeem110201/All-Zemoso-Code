package cycles_factories;

public class Unicycle implements Cycle{
    @Override
    public void checkBrakingSystem() {
        System.out.println("Checking the quality of braking system for Unicycle");
    }

    @Override
    public void checkPaddleSystem() {
        System.out.println("Checking the quality of paddle system for Unicycle");
    }

}
