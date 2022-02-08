package azeem.assignment.main;
import azeem.assignment.data.DataTypes;
import azeem.assignment.singleton.Singleton;

public class Main {
    public static void SingletonDemonstration(){
        Singleton singleton = new Singleton();
        singleton.printString();

    }
    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printInstanceVariables();
        dataTypes.printLocalVariable();

        SingletonDemonstration();
    }
}
