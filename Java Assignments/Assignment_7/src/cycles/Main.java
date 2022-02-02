package cycles;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[2];

        //upcasting
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        //cycles[2] = new Tricycle();  can't assign to cycle class as it is not extending cycle class and will throw an error.

        for(int i = 0; i < cycles.length; i++){
            cycles[i].balance();
        }

        //downcasting

        //Unicycle unicycle = new Cycle();  //will throw an error, Cycle class is abstract cannot be instantiated
        //Bicycle bicycle = new Cycle();    //will throw an error, Cycle class is abstract cannot be instantiated

        //unicycle.balance();
        //bicycle.balance();

    }
}
