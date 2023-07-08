public class Circle extends Shape {
    private double radius;

    public Circle() {
        super("green", true);
        this.radius = 1.0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "A Circle with radius of " + radius + " and " + super.toString();
    }
}



    

