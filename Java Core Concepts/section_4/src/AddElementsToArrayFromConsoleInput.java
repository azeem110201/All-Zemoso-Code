import java.util.Scanner;

public class AddElementsToArrayFromConsoleInput {
    public static void main(String[] args) {
        int[] nums = new int[5];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < nums.length; i++){
            int number = input.nextInt();
            nums[i] = number;
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] * 2 + " ");
        }
    }
}
