import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OutputNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Azeem");
        names.add("Rahul");
        names.add("Singh");
        names.add("XYZ");

        try{
            PrintWriter pw = new PrintWriter("names.txt");
            for(int i = 0; i < names.size(); i++){
                pw.println(names.get(i));
            }
            pw.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
