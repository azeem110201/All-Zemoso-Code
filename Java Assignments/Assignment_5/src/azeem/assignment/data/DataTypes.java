package azeem.assignment.data;

public class DataTypes {
    int number;
    char character;

    public void printInstanceVariables(){
        System.out.println("Number:" + this.number);
        System.out.println("Character:" + this.character);
    }

    public void printLocalVariable(){
        int intValue;
        char charValue;

        // The below code does'nt compile because local variables must be initialized because they dont have default values like data memebers
        // System.out.println("Integer value is : " + intValue);
        // System.out.println("Character value is : " + charValue);
    }
}
