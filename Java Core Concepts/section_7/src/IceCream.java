import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    IceCream(String name,int cost,int numScoops){
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        toppings = new ArrayList<>();
    }

    public void addToppings(String topping){
        toppings.add(topping);
    }
    public String getName(){
        return this.name;
    }
    public int getCost(){
        return this.cost;
    }
    public int getNumScoops(){
        return this.numScoops;
    }
    public void printToppings(){
        for(String topping : toppings){
            System.out.println(topping);
        }
    }
}
