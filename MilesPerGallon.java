import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of miles driven: ");
        double milesDriven = input.nextDouble();

        System.out.print("Enter the gallons of gas used: ");
        double gallonsUsed = input.nextDouble();

        double mpg = milesDriven / gallonsUsed;

        System.out.println("Miles-per-gallon (MPG): " + mpg);

        input.close();
    }
}
