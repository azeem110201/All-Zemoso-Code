package interfaces_in_java8;

interface Engine{
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}

interface Vehicle{
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}

// the below class will throw an error because it will have a conflict of which methods to call

//class Car implements Engine, Car{
//    public String getDefaultEngine(int id){
//        return model(id);
//    }
//}

// So to overcome this problem, we need to define our own method

class Car implements Engine, Vehicle{
    public String model(int id){
        return "DEFAULT ENGINE";
    }
    public String getDefaultEngine(int id){
        return model(id);
    }
}
public class MultipleInheritanceDefault {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getDefaultEngine(8));
    }
}
