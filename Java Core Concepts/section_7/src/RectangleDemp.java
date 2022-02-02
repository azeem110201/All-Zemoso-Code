public class RectangleDemp {
    public static void main(String[] args) {
        Rectangle rectangle_1 = new Rectangle();
        Rectangle rectangle_2 = new Rectangle(2,3);

        System.out.println("The number of Rectangles are : " + Rectangle.getNumOfReactangles());

        Rectangle rectangle_3 = new Rectangle(5, 9);
        System.out.println("The number of Rectangles are : " + Rectangle.getNumOfReactangles());

        System.out.println("Area of default Rectangle constructor:" + rectangle_1.area());
        System.out.println("Area of parameterized(2, 3) Rectangle constructor:" + rectangle_2.area());
        System.out.println("Area of parameterized(5, 9) Rectangle constructor:" + rectangle_3.area());

        System.out.println("Perimeter of default Rectangle constructor:" + rectangle_1.perimeter());
        System.out.println("Perimeter of parameterized(2, 3) Rectangle constructor:" + rectangle_2.perimeter());
        System.out.println("Perimeter of parameterized(5, 9) Rectangle constructor:" + rectangle_3.perimeter());
    }
}
