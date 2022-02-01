public class Variables {
    public static void main(String[] args) {
        // Variables are names given to the memory location where we have saved our data with.
        int myAge;   // variable declaration
        myAge = 21;  // variable initialization

        final int SOME_CONSTANT = 150;    // variable used to hold a value which cannot be modified

        String name = "Abdul Azeem";  // variable declaration and initialization

        String myHomeTown = "Hyderabad";

        // using concatenation operator in the println() function to concatenate string with variables
        System.out.println("My name is " + name + " and my age is " + myAge);
        System.out.println("My home town is " + myHomeTown);
    }
}
