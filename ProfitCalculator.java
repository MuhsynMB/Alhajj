import java.util.Scanner;

public class ProfitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PROFIT_RATE = 0.23;

        System.out.print("Enter the projected total sales: $");
        double totalSales = input.nextDouble();

        double profit = PROFIT_RATE * totalSales;

        System.out.println("Profit: $" + profit);

        input.close();
    }
}