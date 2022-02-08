package lambda;

@FunctionalInterface
interface Printer{
    void printLine(String text);
}

//class PrinterClass implements Printer{
//
//    @Override
//    public void printLine(String text) {
//        System.out.println(text);
//    }
//}

public class LambdaSyntax {
    /*
       (input parameters) -> { function body; }
     */

    /*
      For ex: (int a, int b) -> { return a + b; }
     */
    public static void main(String[] args) {
//        Printer printer = new PrinterClass();
//        printer.printLine("Hello World");

        // Sp instead of creating a class, just create anonymous class and assign an object to it for type Printer interface
        // This enables us to declare and instantiate the class at a same time.

        //anonymous class
        Printer printer = new Printer() {
            @Override
            public void printLine(String text) {
                System.out.println(text);
            }
        };

        printer.printLine("Hello World");


        System.out.println("***************Lambda Expressions******************");


        //Lambda Expression
        Printer obj = (text) -> {
            System.out.println(text);
        };

        obj.printLine("Hello World");
    }
}
