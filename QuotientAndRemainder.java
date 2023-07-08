import java.util.Scanner;
import java.util.ArrayList;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer (x): ");
        int x = input.nextInt();

        System.out.print("Enter the second integer (y): ");
        int y = input.nextInt();

        int quotient = x / y;
        int remainder = x % y;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        input.close();
    }
}