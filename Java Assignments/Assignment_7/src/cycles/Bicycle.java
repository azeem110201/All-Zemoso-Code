package cycles;

public class Bicycle extends Cycle{
    Bicycle(){
        System.out.println("This is Bicycle class");
    }
    @Override
    public void balance() {
        System.out.println("This is balance method of Bicycle");
    }
}
