public class ContinueBreakStatements {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10){
            if(count == 5){
                count++;
                //continue;   // this will jump to the while condition and starts executing the statements
                break;        // this is break from the loop if any particular condition satisfy or not
            }
            System.out.println(count);
            count++;
        }
    }
}
