package azeem.assignment.singleton;

public class Singleton {
    public String string;

    public static Singleton getString(String string){
        Singleton singleton = new Singleton();
        //this.string = string;  Why this error?? because  azeem.assignment.singleton.Singleton' cannot be referenced from a static context

        return singleton;
    }

    public void printString(){
        System.out.println("String value is:" + this.string);
    }

}
