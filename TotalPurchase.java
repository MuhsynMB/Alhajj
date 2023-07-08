import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double SALES_TAX_RATE = 0.06;

        double item1Price, item2Price, item3Price, item4Price, item5Price;

        System.out.print("Enter the price of item 1: $");
        item1Price = input.nextDouble();

        System.out.print("Enter the price of item 2: $");
        item2Price = input.nextDouble();

        System.out.print("Enter the price of item 3: $");
        item3Price = input.nextDouble();

        System.out.print("Enter the price of item 4: $");
        item4Price = input.nextDouble();

        System.out.print("Enter the price of item 5: $");
        item5Price = input.nextDouble();

        double subtotal = item1Price + item2Price + item3Price + item4Price + item5Price;
        double salesTax = SALES_TAX_RATE * subtotal;
        double total = subtotal + salesTax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Sales tax (6%): $" + salesTax);
        System.out.println("Total: $" + total);

        input.close();
    }
}
