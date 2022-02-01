public class Arithmetic {
    public static void main(String[] args) {
        /*
          +  addition operator
          - subtraction operator
          * multiplication operator
          / division operator
          % modules operator
         */

        int a = 15;
        int b = 10;

        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Addition is " + result);
        System.out.println("Difference is " + difference);
        System.out.println("Multiplication is " + product);
        System.out.println("Division is "+ division);
        System.out.println("Remainder is " + remainder);

        result += 20;   // compound operator same as result = result + 20

        result++; // increment operator same as result = result + 1
        System.out.println("addition++ -> " + result);
        result--; // decrement operator same as result = result - 1
        System.out.println("addition-- -> " + result);

        product *= 2;
        System.out.println("product * 2 -> " + product);
    }
}
