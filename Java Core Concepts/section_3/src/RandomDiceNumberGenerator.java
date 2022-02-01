import java.util.Random;

public class RandomDiceNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        int rollCounts = 10;
        int i = 1;

        while(i <= rollCounts){
            int diceNumber = random.nextInt(6) + 1;
            System.out.println("The dice number which is rolled randomly is:" + diceNumber);

            i++;
        }
    }
}
