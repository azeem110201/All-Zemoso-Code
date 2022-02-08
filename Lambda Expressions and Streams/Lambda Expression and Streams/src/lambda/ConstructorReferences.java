package lambda;

class Movie{
    Movie(int id){
        System.out.println("Inside one parameter constructor");
    }

    Movie(int id, String movieName){
        System.out.println("Inside two parameter constructor");
    }
}

interface MovieFactory{
    Movie create(int id);
}

interface MovieFactory2{
    Movie create(int id, String movieName);
}

public class ConstructorReferences {
//    MovieFactory mf = (id) -> new Movie(id);

    public static void main(String[] args) {
        ConstructorReferences cr = new ConstructorReferences();
        MovieFactory mf2 = Movie::new;

        MovieFactory2 mf3 = Movie::new;
    }
}
