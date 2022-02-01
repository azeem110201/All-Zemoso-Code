import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String city;
        double realNumber;
        System.out.println("Enter your name :");
        name = input.nextLine();

        System.out.println("Enter your age : ");
        int age = input.nextInt();

        input.nextLine(); // write this to avoid the nextLine() bug which does not consider city as input and directly prints the println statements


        System.out.println("Enter a real number:");
        realNumber = input.nextDouble();
        input.nextLine();

        realNumber *= 2;

        System.out.println("Enter your city : ");
        city = input.nextLine();

        System.out.println("Your name is "+ name);
        System.out.println("Your age is " + age);
        System.out.println("You live in " + city);
        System.out.println("The real number * 2 is:" + realNumber);
    }
}
