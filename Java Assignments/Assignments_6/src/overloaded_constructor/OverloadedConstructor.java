package overloaded_constructor;

public class OverloadedConstructor {
    public OverloadedConstructor(){
        this("Parameter string passed through default constructor");
        System.out.println("In default constructor");
    }

    public OverloadedConstructor(String text){
        System.out.println(text);
        System.out.println("This is parameterised constructor");
    }

    public static void main(String[] args) {
        new OverloadedConstructor();
    }
}
