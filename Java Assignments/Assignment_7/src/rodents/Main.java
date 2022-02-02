package rodents;

public class Main {
    public static void main(String[] args) {
        Rodents[] rodents = new Rodents[3];

        rodents[0] = new Hamster();
        rodents[1] = new Gerbil();
        rodents[2] = new Mouse();

        for(int i = 0; i < rodents.length; i++){
            rodents[i].eat();
            rodents[i].walk();
            rodents[i].gnawing();
        }
    }
}
