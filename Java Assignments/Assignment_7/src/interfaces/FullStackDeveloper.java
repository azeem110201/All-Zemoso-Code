package interfaces;

public class FullStackDeveloper extends SoftwareEngineer implements Humans{
    @Override
    public void eatNonVeg() {
        System.out.println("Full Stack Developer eating non veg");
    }

    @Override
    public void digestNonVeg() {
        System.out.println("Full Stack Developer digesting non veg");
    }

    @Override
    public void eatVeg() {
        System.out.println("Full Stack Developer eating veg");
    }

    @Override
    public void digestVeg() {
        System.out.println("Full Stack Developer digesting veg");
    }

    @Override
    public void walk() {
        System.out.println("Full Stack Developer taking a walk");
    }

    @Override
    public void breathingLungs() {
        System.out.println("Full Stack Developer breathing through lungs");
    }

    @Override
    public void breathOxygen() {
        System.out.println("Full Stack Developer breathing oxygen");
    }


    @Override
    void code(Herbivorous herbivorous) {
        herbivorous.eatVeg();
        System.out.println("Code after eating");
        herbivorous.digestVeg();
    }

    @Override
    void deploy(Carnivorous carnivorous) {
        carnivorous.eatNonVeg();
        System.out.println("Deploy after eating");
        carnivorous.digestNonVeg();
    }

    @Override
    void fixBugs(Mammals mammals) {
        mammals.breathOxygen();
        System.out.println("Fixing bugs.....");
        mammals.breathingLungs();
    }

    @Override
    void haveACoffee(Humans humans) {
        humans.walk();
        System.out.println("Have a coffee while walking");
    }
}
