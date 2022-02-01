import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full name");
        String fullName = input.nextLine();

        int whereIsSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0,whereIsSpace);
        String lastName = fullName.substring(whereIsSpace,fullName.length());

        System.out.println(firstName.toUpperCase() + "" + lastName.toLowerCase());
    }
}
