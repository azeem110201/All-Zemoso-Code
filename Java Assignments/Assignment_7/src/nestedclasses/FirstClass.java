package nestedclasses;

public class FirstClass {
    FirstClass(){
        System.out.println("This is First Class");
    }

    class FirstClassNested{
        FirstClassNested(String message){
            System.out.println("This is First Inner Class");
            System.out.println(message);
        }
    }
}
