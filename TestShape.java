public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);

        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle("blue", true, 2.5);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("yellow", false, 5.0, 3.0);
        System.out.println(rectangle2);

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of rectangle1: " + rectangle1.getArea());
    }
}


    

