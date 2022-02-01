import java.util.Locale;

public class SomeMoreStringMethods {
    public static void main(String[] args) {
        String name = "Mohd Abdul Azeem";

        System.out.println("Name in uppercase " + name.toUpperCase());
        System.out.println("Name in lowercase " + name.toLowerCase());

        int whereIsZ = name.indexOf("z");
        System.out.println("z is located at " + whereIsZ + " index");

        String lastName = name.substring(11);
        System.out.println("Last name is " + lastName);

        String middleName = name.substring(5,10);
        System.out.println("Middle name is " + middleName);
    }
}
