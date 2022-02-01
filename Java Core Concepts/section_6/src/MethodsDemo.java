public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println("Hello World from main function");
        printMessage();
        printNumber(10);
        System.out.println(getNumber());
        System.out.println(getParameter(25));
        System.out.println("The square of the number 5.25 is " + squareNumber(5.25));

    }
    public static void printMessage(){
        System.out.println("Hello World");
    }

    public static void printNumber(int number){
        System.out.println("The number is " + number);
    }

    public static int getNumber(){
        return 11;
    }

    public static int getParameter(int number){
        return number;
    }

    public static double squareNumber(double number){
        return number * number;
    }
}
