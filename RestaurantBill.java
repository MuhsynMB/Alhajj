import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the charge for the food: ");
        double foodCharge = input.nextDouble();

        double tipAmount = 0.15 * foodCharge;
        double salesTaxAmount = 0.07 * foodCharge;
        double totalAmount = foodCharge + tipAmount + salesTaxAmount;

        System.out.println("Tip amount (15%): " + tipAmount);
        System.out.println("Sales tax amount (7%): " + salesTaxAmount);
        System.out.println("Total amount: " + totalAmount);

        input.close();
    }
}
