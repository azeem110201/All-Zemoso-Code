import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;

        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();

        final int NUM_NAMES = 5;

        for(int i=0;i<NUM_NAMES;i++){
            fullName = input.nextLine();
            indexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0,indexOfSpace);
            lastName = fullName.substring(indexOfSpace+1);
            first.add(firstName);
            last.add(lastName);
        }

        for(int i=0;i<NUM_NAMES;i++){
            for(int j=0;j<NUM_NAMES;j++){
                System.out.println(first.get(i) + " " + last.get(j));
            }
        }
    }
}
