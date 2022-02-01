public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(3));
        System.out.println(getResult(5,"20"));
        System.out.println(getResult(3,4));
        System.out.println(getResult("Mohd","Abdul","Azeem"));
    }
    public static int getResult(int number){
        return number * 5;
    }
    public static int getResult(int number, String stringNumber){
        return number * Integer.parseInt(stringNumber);
    }
    public static int getResult(int number_1,int number_2){
        return number_1 * number_2;
    }
    public static String getResult(String firstName,String middleName, String lastName){
        return firstName + " " + middleName + " " + lastName;
    }
}
