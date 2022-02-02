package nestedclasses;

public class Main {
    public static void main(String[] args) {
        SecondClass.SecondClassNested secondClassObject = new SecondClass().new SecondClassNested();

        System.out.println("*******************************************");

        FirstClass.FirstClassNested firstClassObject = new FirstClass().new FirstClassNested("Hello World");

        //FirstClass.FirstClassNested firstClassUpcasting = new SecondClass().new SecondClassNested();  // will throw an error
    }
}
