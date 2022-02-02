package cycles;

public class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("This is Unicycle class");
    }
    @Override
    public void balance() {
        System.out.println("This is balance method of Unicycle");
    }
}
