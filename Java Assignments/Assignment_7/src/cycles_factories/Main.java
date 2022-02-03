package cycles_factories;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        factory.checkBrakingSystem(unicycle);
        factory.checkPaddleSystem(unicycle);

        factory.checkBrakingSystem(bicycle);
        factory.checkPaddleSystem(bicycle);

        factory.checkBrakingSystem(tricycle);
        factory.checkPaddleSystem(tricycle);
    }
}
