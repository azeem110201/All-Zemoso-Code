import java.util.ArrayList;

public class ArrayListFun {
    /*
       ArrayList are used to create dynamic size array which is store homogeneous data.
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // ArrayList<String> names;
        // names = new ArrayList<>();

        // adding elements in array list
        names.add("abc");
        names.add("xyz");
        names.add("qwerty");
        names.add("hero");
        names.add("hello");

        for(int i = 0; i < names.size(); i++){
            System.out.print(names.get(i) + " ");
        }
        System.out.println();
        //enhanced for-loop
        for(String name: names){
            System.out.print(name + " ");
        }
    }
}
