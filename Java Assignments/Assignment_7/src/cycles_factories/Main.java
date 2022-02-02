package cycles_factories;

public class Main {
    public static void main(String[] args) {
        Factories factories = new Factories();

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        factories.manufacturingCycles(unicycle);
        factories.manufacturingCycles(bicycle);
        factories.manufacturingCycles(tricycle);
    }
}
