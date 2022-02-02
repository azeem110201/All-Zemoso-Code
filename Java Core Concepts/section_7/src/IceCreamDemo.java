public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream iceCream_1 = new IceCream("Strawberry", 5, 4);
        IceCream iceCream_2 = new IceCream("Chocolate", 4, 3);

        iceCream_1.addToppings("Sprinkles");
        iceCream_1.addToppings("Nuts");

        iceCream_2.addToppings("Hot fudge");
        iceCream_2.addToppings("Sprinkles");

        printIC(iceCream_1);
        System.out.println();
        printIC(iceCream_2);
        System.out.println();
    }
    public static void printIC(IceCream icecream){
        System.out.println("Name : "+ icecream.getName());
        System.out.println("Cost : $"+icecream.getCost());
        System.out.println("Toppings for your ice-cream order are...");
        icecream.printToppings();
    }
}
