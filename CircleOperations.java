import java.util.Scanner;

public class CircleOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159; // constant value of pi

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        input.close();
    }
}