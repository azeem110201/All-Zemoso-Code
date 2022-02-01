import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        input.nextLine();
        double average = (num1 + num2 + num3 )/ 3.0;

        System.out.println("The Average of three numbers is " + average);
    }
}
