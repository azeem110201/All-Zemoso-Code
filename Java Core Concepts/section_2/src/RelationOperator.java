public class RelationOperator {
    public static void main(String[] args) {
        /*

        Relationship operators
        > greater than
        < less than
        >= greater than or equal to
        <= less than or equal to
        == equals to
        != not equal to
         */
        boolean myBool = true;
        boolean yourBool = false;

        int myAge = 21;
        int yourAge = 25;
        int bobAge = 30;

        String myName = "Abdul Azeem";
        String yourName = "John";

        System.out.println("My Boolean values " + myBool);
        System.out.println("Your Boolean value " + yourBool);

        boolean ageComparision = myAge > yourAge;
        System.out.println("myAge > yourAge : " + ageComparision);

        ageComparision = myAge == bobAge;
        System.out.println("myAge == bobAge :" + ageComparision);

        boolean nameComparision = myName.equals(yourName);
        System.out.println("Does names match : " + nameComparision);
    }
}
