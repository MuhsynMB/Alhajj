class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        if (a > b + c || b > a + c || c > a + b) {
            return false;
        } else {
            return true;
        }
    }

    public int getArea() {
        return (a * b * c) / 2;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 6, 8);

        boolean isTriangle = triangle.isTriangle();
        System.out.println("Is it a triangle? " + isTriangle);

        if (isTriangle) {
            int area = triangle.getArea();
            System.out.println("Area of the triangle: " + area);
        }
    }
}
