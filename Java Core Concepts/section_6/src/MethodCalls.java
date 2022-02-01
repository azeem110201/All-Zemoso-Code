public class MethodCalls {
    public static void main(String[] args) {
        System.out.println(add(5, 6));
    }
    public static int add(int a, int b){
        int x = 2;
        int res = a + b;

        return a + b + difference(res, x);
    }
    public static int difference(int a, int b){
        return a + b;
    }
}
