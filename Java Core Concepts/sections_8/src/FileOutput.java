import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello World");
            pw.println("My name is Mohd Abdul Azeem");

            pw.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
