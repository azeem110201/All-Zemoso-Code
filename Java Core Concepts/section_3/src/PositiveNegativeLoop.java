import java.util.Scanner;

public class PositiveNegativeLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number to find the sum of all the numbers upon the given number");
        System.out.println("Enter a negative number to exit");

        int number;
        number = input.nextInt();

        if(number >= 0){
            int counter = 1;
            int sumOfAllPositiveNumbers = 0;
            while(counter <= number){
                sumOfAllPositiveNumbers += counter;
                counter++;
            }
            System.out.println("Sum of positive numbers is:" + sumOfAllPositiveNumbers);
        }
        System.out.println("Done!");
    }
}
