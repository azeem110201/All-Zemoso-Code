import java.util.Scanner;

public class SwitchSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char grade;

        System.out.print("Enter your Grade : ");
        grade = input.next().charAt(0);

        switch(grade){
            case 'A':
            case 'a':
                System.out.println("First Division");
                break;
            case 'B':
            case 'b':
                System.out.println("Second Division");
                break;
            case 'C':
            case 'c':
                System.out.println("Third Division");
                break;
            case 'D':
            case 'd':
                System.out.println("Forth Division");
                break;
            case 'F':
            case 'f':
                System.out.println("Your have failed the course. Please try next time");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
