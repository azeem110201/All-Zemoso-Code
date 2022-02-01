package constructor_initialization;

public class ConstructorInitializationDemo {
    ConstructorInitializationDemo(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new ConstructorInitializationDemo("Constructor " + (i + 1) + " called");
        }
    }
}
