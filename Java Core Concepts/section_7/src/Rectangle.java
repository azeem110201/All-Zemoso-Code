public class Rectangle {
    private double length;
    private double width;
    private static int numOfRectangles;

    Rectangle(){
        this(1.0,1.0);
    }
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
        numOfRectangles++;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double area(){
        return this.length * this.width;
    }
    public double perimeter(){
        return 2 * (this.length + this.width);
    }
    public static int getNumOfReactangles(){
        return numOfRectangles;
    }
}
