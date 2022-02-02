public class CircleDemo {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(2);
        Circle circle_2 = new Circle(5.32);

        printData(circle_1);
        System.out.println();
        printData(circle_2);
    }
    public static void printData(Circle circle){
        System.out.println("Radius : " + circle.getRadius());
        System.out.println("Area : " + String.format("%.4f",circle.area()));
        System.out.println("Circumference : " + String.format("%.2f",circle.circumference()));
    }
}
