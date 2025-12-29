import java.util.Scanner;

public class PhoneRechargeSimulator {
    
	//Making variable which hold the offer 
    private static final double JIO_OFFER = 0.10;
    private static final double AIRTEL_OFFER = 0.08;
    private static final double VI_OFFER = 0.05;

    public static void main(String[] args) {
		
		//Making Scanner class object
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        char choice = 'Y';  

        do {
			//Taking user inputs 
            System.out.print("\nEnter Mobile Operator (Jio/Airtel/VI/BSNL): ");
            String operator = sc.next();

            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            double bonus = 0;
			
			//Checking the offer and calculating the bonus
            switch (operator.toUpperCase()) {
                case "JIO":
                    bonus = amount * JIO_OFFER;
                    break;
                case "AIRTEL":
                    bonus = amount * AIRTEL_OFFER;
                    break;
                case "VI":
                    bonus = amount * VI_OFFER;
                    break;
                case "BSNL":
                    bonus = 0;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;   
            }

            balance += amount + bonus;

			//Printin the results 
            System.out.println("\n--- Recharge Summary ---");
            System.out.println("Operator       : " + operator);
            System.out.println("Recharge Amount: " + amount);
            System.out.println("Bonus          : " + bonus);
            System.out.println("Total Balance  : " + balance);

            System.out.print("\nDo you want to recharge again? (Y/N): ");
            choice = sc.next().charAt(0);

		//Checking the condition for the while loop 
        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank you for using Phone Recharge Simulator");
        sc.close();
    }
}
