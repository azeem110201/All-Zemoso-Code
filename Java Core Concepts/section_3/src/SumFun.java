import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Enter the number to add ");
        System.out.println("Enter the negative number to exit");
        num = input.nextInt();

        while(num > 0){
            sum += num;

            System.out.println("Enter the number to add ");
            System.out.println("Enter the negative number to exit");
            num = input.nextInt();
        }

        System.out.println("The total sum is "+ sum);

    }
}
