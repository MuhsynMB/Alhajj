import java.util.Scanner;

public class AcresCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SQUARE_FEET_PER_ACRE = 43560;

        System.out.print("Enter the total square feet in the tract of land: ");
        int totalSquareFeet = input.nextInt();

        double acres = (double) totalSquareFeet / SQUARE_FEET_PER_ACRE;

        System.out.println("Total acres: " + acres);

        input.close();
    }
}