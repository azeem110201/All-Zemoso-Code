import java.util.ArrayList;
import java.util.Scanner;

public class NamesAndAge {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int[] ages = new int[5];

        for(int i = 0; i < ages.length; i++){
            System.out.print("Enter your name:");
            String name = input.nextLine();

            System.out.print("Enter your age:");
            int age = input.nextInt();

            input.nextLine();

            names.add(name);
            ages[i] = age;
        }

        for(int i = 0; i < ages.length; i++){
            System.out.println("My name is " + names.get(i) + " and my age is " + ages[i]);
        }
    }
}
