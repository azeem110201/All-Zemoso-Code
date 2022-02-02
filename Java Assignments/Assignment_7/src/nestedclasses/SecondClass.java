package nestedclasses;

public class SecondClass extends FirstClass{
    SecondClass(){
        System.out.println("This is Second Class");
    }
    class SecondClassNested{
        SecondClassNested(){
            System.out.println("This is Second inner Class");
        }
    }
}
