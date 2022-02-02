import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner input_1;
        Scanner input_2;


        try{
            input_1 = new Scanner(new File("student_names.txt"));
            input_2 = new Scanner(new File("student_age.txt"));
            PrintWriter pw = new PrintWriter("Student_Ages.txt");

            String name;
            int age;
            while(input_1.hasNext() && input_2.hasNext()){
                name = input_1.nextLine();
                age = input_2.nextInt();

                pw.println("My name is " + name + " and age is " + age);
            }
            pw.close();
            input_1.close();
            input_2.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
