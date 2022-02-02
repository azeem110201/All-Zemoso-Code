public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House(5, 8, "blue");
        House yourHouse = new House();

//        myHouse.setColor("blue");
//        myHouse.setNumStories(5);
//        myHouse.setNumWindows(8);

        yourHouse.setColor("violet");
        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(6);

        printHouseDescription(myHouse);
        printHouseDescription(yourHouse);
    }

    public static void printHouseDescription(House house){
        System.out.println("Your house is " + house.getColor() + " and has " + house.getNumStories() + " Stories and " + house.getNumWindows() + " windows");
    }
}
