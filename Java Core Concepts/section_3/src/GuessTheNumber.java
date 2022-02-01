import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int numberGeneratedByComputer = random.nextInt(100) + 1;

        boolean flag = true;

        int numberOfGuess = 0;

        while(flag){
            System.out.print("Guess a number:");
            int numberGuessByUser = input.nextInt();

            if(numberGuessByUser > 100 || numberGuessByUser < 1){
                System.out.println("Please guess the number between 1-100");
                numberOfGuess++;
            }
            else if(numberGuessByUser > numberGeneratedByComputer){
                System.out.println("Too High");
                numberOfGuess++;
            }
            else if(numberGuessByUser < numberGeneratedByComputer){
                System.out.println("Too Low");
                numberOfGuess++;
            }
            else{
                numberOfGuess++;
                flag = false;
            }
        }
        System.out.println("You guessed the number in " + numberOfGuess + " times");
    }
}
