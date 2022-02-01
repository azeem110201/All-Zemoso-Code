import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // watch this video to understand how random numbers are generated
        // https://www.youtube.com/watch?v=Ks1pw1X22y4


        Random random = new Random();

        int myRandomNumber;
        myRandomNumber = random.nextInt();
        System.out.println("My random number is " + myRandomNumber);

        myRandomNumber = random.nextInt(1000);
        System.out.println("My random number between 0-999 : "+ myRandomNumber);

        myRandomNumber = random.nextInt(1000) + 1;
        System.out.println("My random number between 1-1000 : "+ myRandomNumber);
    }
}
