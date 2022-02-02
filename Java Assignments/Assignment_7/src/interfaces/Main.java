package interfaces;

public class Main {
    public static void main(String[] args) {
        FullStackDeveloper fullStackDeveloper = new FullStackDeveloper();
        Herbivorous herbivorous = new FullStackDeveloper();
        Carnivorous carnivorous = new FullStackDeveloper();
        Mammals mammals = new FullStackDeveloper();
        Humans humans = new FullStackDeveloper();

        fullStackDeveloper.code(herbivorous);
        fullStackDeveloper.deploy(carnivorous);
        fullStackDeveloper.fixBugs(mammals);
        fullStackDeveloper.haveACoffee(humans);
    }
}
