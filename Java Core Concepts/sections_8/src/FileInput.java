import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        Scanner input;

        try{
            input = new Scanner(new File("Demo.txt"));

            int index;
            int sum = 0;

            while(input.hasNext()){
                index = input.nextInt();
                sum += index;
            }

            System.out.println("The sum of numbers in the file is " + sum);
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File could not be found!");
            System.out.println(e.getMessage());
        }
    }
}
