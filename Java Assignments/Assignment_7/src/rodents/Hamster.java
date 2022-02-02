package rodents;

public class Hamster extends Rodents{
    Hamster(){
        System.out.println("This is Hamster class");
    }
    @Override
    public void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    public void walk() {
        System.out.println("Hamster is walking");
    }

    @Override
    public void gnawing() {
        System.out.println("Hamster is gnawing");
    }

    public void runForward(){
        System.out.println("Hamster is running forward");
    }

    public void runBackward(){
        System.out.println("Hamster is running backward");
    }
}
