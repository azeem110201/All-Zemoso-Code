package cycles_factories;

public class Factories {
    Factories(){
        System.out.println("This is a factory class where different types of cycles are manufactured");
    }
    void manufacturingCycles(Cycle cycle){
        cycle.checkPaddleSystem();
        cycle.checkBrakingSystem();
    }
}
