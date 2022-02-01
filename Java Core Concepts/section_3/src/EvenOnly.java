public class EvenOnly {
    public static void main(String[] args) {
        int count = 1;

        while(count < 10){
            if(count%2 == 1){
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
    }
}
