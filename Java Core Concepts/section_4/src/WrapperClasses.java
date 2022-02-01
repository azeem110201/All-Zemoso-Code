import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //nums.add(new Integer(10));  this will give warning. Java automatically does auto boxing and auto unboxing to convert primitive to Wrapper class and vice versa

        nums.add(10);
        nums.add(20);
        nums.add(30);

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();

        // String --> Integer

        String someString = "420";
        int someInt = Integer.parseInt(someString);

        someInt += 10;

        System.out.println(someInt);

        // String --> Double

        someString = "3.147";
        double someDouble = Double.parseDouble(someString);

        System.out.println(someDouble);
    }
}
