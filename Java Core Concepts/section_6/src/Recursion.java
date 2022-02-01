public class Recursion {
    public static void main(String[] args) {
        int fibonacciCount = 15;

        for (int i = 0; i <= fibonacciCount ; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
    }

    public static int fibonacciSeries(int number){
        if(number <= 1){
            return number;
        }

        return fibonacciSeries(number - 1) + fibonacciSeries(number - 2);
    }
}
