import java.util.Scanner;

public class SelectionStatements {
    public static void main(String[] args) {
        /*
          There are 3 types of selection statements
          1. if statements
          2. if-else statements
          3. switch statements
         */

        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Enter your age : ");
        age = input.nextInt();

        System.out.println("Welcome to the club ");
        if( age >= 21){
            System.out.println("You can have a glass of beer");
        }else if(age >= 18){
            System.out.println("You can have coke. ");
        }else {
            System.out.println("You can take part in games provided by the club");
        }

        System.out.println("Thanks for visiting us");
    }
}
