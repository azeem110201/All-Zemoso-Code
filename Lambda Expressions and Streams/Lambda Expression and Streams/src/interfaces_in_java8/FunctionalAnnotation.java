package interfaces_in_java8;

public class FunctionalAnnotation {

    @java.lang.FunctionalInterface
    interface Calculations{
        int perform(int a, int b);
    }

    public static void main(String[] args) {
        Calculations add = (a, b) -> { return a + b; };
        Calculations sub = (a, b) -> { return a - b; };
        Calculations multi = (a, b) -> { return a * b; };
        Calculations div = (a, b) -> { return a / b; };

        System.out.println(add.perform(10,5));
        System.out.println(sub.perform(10,5));
        System.out.println(multi.perform(10,5));
        System.out.println(div.perform(10,5));
    }
}
