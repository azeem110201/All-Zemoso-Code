package lambda;

//interface IMovie{
//    boolean check(int id);
//}
public class MethodReferences {
    public static void printMessage(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
//        Thread thread = new Thread(() -> printMessage);
        Thread thread = new Thread(MethodReferences::printMessage);
        thread.start();
    }
}
