package rodents;

public class Mouse extends Rodents{
    Mouse(){
        System.out.println("This is Mouse class");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    public void walk() {
        System.out.println("Mouse is walking");
    }

    @Override
    public void gnawing() {
        System.out.println("Mouse is gnawing");
    }

    public void runFast(){
        System.out.println("Running fast to escape predictor");
    }
}
