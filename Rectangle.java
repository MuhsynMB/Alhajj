public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super("green", true);
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "A Rectangle with length of " + length + " and width of " + width + " and " + super.toString();
    }
}
    

