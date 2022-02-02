public class Circle {
    private double radius;

    Circle(){
        this(0.0);
    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double circumference(){
        return 2 * Math.PI * this.radius;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
