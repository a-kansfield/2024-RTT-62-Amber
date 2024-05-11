package previous.weeks.glab_303_10_3;

public class Circle extends Shape{
    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double getArea() {
        //double area = PI * this.radius * this.radius;
        double area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
        return area;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }
}
