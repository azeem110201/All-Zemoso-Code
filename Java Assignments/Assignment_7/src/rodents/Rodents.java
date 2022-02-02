package rodents;

public abstract class Rodents {
    Rodents(){
        System.out.println("This is Rodent class");
    }

    public abstract void eat();
    public abstract void walk();
    public abstract void gnawing();
}
