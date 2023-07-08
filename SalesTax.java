import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double STATE_SALES_TAX_RATE = 0.04;
        final double COUNTY_SALES_TAX_RATE = 0.02;

        System.out.print("Enter the amount of a purchase: ");
        double purchaseAmount = input.nextDouble();

        double stateSalesTax = STATE_SALES_TAX_RATE * purchaseAmount;
        double countySalesTax = COUNTY_SALES_TAX_RATE * purchaseAmount;
        double totalSalesTax = stateSalesTax + countySalesTax;
        double totalAmount = purchaseAmount + totalSalesTax;

        System.out.println("Amount of purchase: $" + purchaseAmount);
        System.out.println("State sales tax (4%): $" + stateSalesTax);
        System.out.println("County sales tax (2%): $" + countySalesTax);
        System.out.println("Total sales tax: $" + totalSalesTax);
        System.out.println("Total amount: $" + totalAmount);

        input.close();
    }
}
