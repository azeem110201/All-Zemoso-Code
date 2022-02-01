import java.util.Scanner;

public class Reptition {
    public static void main(String[] args) {
        /*
         There are 3 types of looping statements
         1. while loop
         2. for loop
         3. do-while loop
         */

        // while loop
        int count = 0;
        System.out.println("while loop starting......");
        while(count < 10){
            System.out.println(count);
            count++;
        }

        // do while loop
        System.out.println("do-while loop starting......");
        count = 0;
        do {
            System.out.println(count);

            count++;
        }while(count < 10);

        // for loop
        System.out.println("for loop starting......");
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
