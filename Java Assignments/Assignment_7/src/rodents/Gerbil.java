package rodents;

public class Gerbil extends Rodents{
    Gerbil(){
        System.out.println("This is Gerbil class");
    }
    @Override
    public void eat() {
        System.out.println("Gerbil is eating");
    }

    @Override
    public void walk() {
        System.out.println("Gerbil is walking");
    }

    @Override
    public void gnawing() {
        System.out.println("Gerbil is gnawing");
    }

    public void diggingDeepTunnels(){
        System.out.println("Gerbil is digging deep tunnels to store it's food");
    }
}
