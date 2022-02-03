package cycles_factories;

public class Factory implements Factories{
    @Override
    public void checkBrakingSystem(Cycle cycle) {
        cycle.checkBrakingSystem();
    }

    @Override
    public void checkPaddleSystem(Cycle cycle) {
        cycle.checkPaddleSystem();
    }
}
