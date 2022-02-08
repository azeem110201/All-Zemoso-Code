package interfaces_in_java8;

public class FunctionalInterface {

    @java.lang.FunctionalInterface
    interface Multiply{
        double multipler(double x, double y);
    }

    static Multiply multiplyLambda = (x, y) -> { return x * y; };

    public static void main(String[] args) {
        FunctionalInterface functionalInterface = new FunctionalInterface();
        System.out.println(multiplyLambda.multipler(5.9, 0.8));
    }
}
