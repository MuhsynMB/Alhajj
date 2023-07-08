import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Welcome " + firstName + " " + lastName + "!");

        input.close();
    }
}m