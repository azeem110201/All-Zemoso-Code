public class ControlStatementsIntro {
    public static void main(String[] args) {
        /*
           There are 3 types of control statements
           1. Sequence control statements
           2. Decision control statements
           3. Looping control statements
         */

        // the below lines are sequence statements
        int age = 21;
        System.out.println("Your age is:" + age);

        // the below lines are decision statements

        if(age >= 21){
            System.out.println("You can marry");
        }
        else{
            System.out.println("You can't marry");
        }

        // the below statements are looping statements

        for (int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday " + i);
        }
    }
}
