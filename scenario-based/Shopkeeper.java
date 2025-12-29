import java.util.Scanner;

public class Shopkeeper{

    // Discount constants
    private static final double DISCOUNT_20 = 0.20;
    private static final double DISCOUNT_10 = 0.10;
    private static final double DISCOUNT_05 = 0.05;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int items = scanner.nextInt();

        double totalBill = 0;

        // Input item prices using for-loop
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = scanner.nextDouble();
            totalBill += price;
        }

        double discount = 0;

        // Discount logic using if-else
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 3000) {
            discount = totalBill * DISCOUNT_10;
        } else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_05;
        } else {
            discount = 0;
        }

        double finalAmount = totalBill - discount;

        // Output
        System.out.println("\n-------- BILL SUMMARY --------");
        System.out.println("Total Bill      : ₹" + totalBill);
        System.out.println("Discount        : ₹" + discount);
        System.out.println("Final Amount    : ₹" + finalAmount);
		System.out.println("Thanks For Visiting ");
    }
}
