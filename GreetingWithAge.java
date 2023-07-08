import java.util.Scanner;

public class GreetingWithAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Enter your age in years: ");
        int ageInYears = input.nextInt();

        int ageInSeconds = ageInYears * 365 * 24 * 60 * 60;

        System.out.println("Welcome " + firstName + " " + lastName + "! You are " + ageInSeconds + " seconds old!");

        input.close();
    }
}