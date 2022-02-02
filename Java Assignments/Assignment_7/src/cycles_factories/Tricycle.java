package cycles_factories;

public class Tricycle implements Cycle{
    @Override
    public void checkBrakingSystem() {
        System.out.println("Checking the quality of braking system for tricycle");
    }

    @Override
    public void checkPaddleSystem() {
        System.out.println("Checking the quality of paddle system for Tricycle");
    }
}
