import java.util.Scanner;

public class MadLibsClone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        System.out.print("Enter an Adjective\t");
        adjective1 = input.nextLine();

        System.out.print("Enter Girl's name\t");
        girlsName = input.nextLine();

        System.out.print("Enter an Adjective\t");
        adjective2 = input.nextLine();

        System.out.print("Enter an Occupation\t");
        occupation1 = input.nextLine();

        System.out.print("Enter the name of a place\t");
        placeName = input.nextLine();

        System.out.print("Enter the name of a piece of clothing\t");
        clothing = input.nextLine();

        System.out.print("Enter the name of a hobby\t");
        hobby = input.nextLine();

        System.out.print("Enter another adjective\t");
        adjective3 = input.nextLine();

        System.out.print("Enter another occupation\t");
        occupation2 = input.nextLine();

        System.out.print("Enter a boy's name\t");
        boysName = input.nextLine();

        System.out.print("Enter a man's name\t");
        mansName = input.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + " who was a " + adjective2 + " " + occupation1 + " in the Kingdom of " + placeName + ".");
        System.out.println("She loved to wear " + clothing + " and " + hobby + ". She wanted to marry the " + adjective3+" "+occupation2 + " named " + boysName + " but her father, King "+ mansName + " forbid her from seeing him.");

    }
}
