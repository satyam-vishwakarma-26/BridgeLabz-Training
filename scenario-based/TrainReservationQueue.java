import java.util.Scanner;

public class TrainReservationQueue {

	//Creating Scanner Object 
   public static Scanner sc = new Scanner(System.in);

    public static int totalSleeper = 10;
    public static int totalFirstAC = 10;
    public static int totalSecondAC = 10;

    public static int sleeperPrice = 100;
    public static int firstAcPrice = 300;
    public static int secondAcPrice = 200;

    public static int bill = 0;

    //Main method 
    public static void main(String[] args) {

		//Checking seat availability and calling the corresponding method 
        while(hasSeatsAvailable()) {
            showMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bookSleeper();
                    break;

                case 2:
                    bookFirstAC();
                    break;

                case 3:
                    bookSecondAC();
                    break;

                case 4:
                    printBill();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        System.out.println("All seats are booked!");
        printBill();
    }
    public static boolean hasSeatsAvailable() {
        return totalSleeper>0 || totalFirstAC>0 || totalSecondAC>0;
    }

	//method which shows the menu 
    public static void showMenu() {
        System.out.println("\nChoose Class for booking:");
        System.out.println("1. Sleeper");
        System.out.println("2. First AC");
        System.out.println("3. Second AC");
        System.out.println("4. Exit");
    }

	//Method by which sleeper seats booked 
    public static void bookSleeper() {
        System.out.println("Sleeper seats available: " + totalSleeper);
        System.out.print("Enter seats to book: ");
        int seats = sc.nextInt();

        if (seats <= totalSleeper) {
            totalSleeper -= seats;
            bill += seats * sleeperPrice;
            System.out.println("Sleeper booking successful!");
        } else {
            System.out.println("Not enough Sleeper seats!");
        }
    }

	//method for booking first ac seats 
    public static void bookFirstAC() {
        System.out.println("First AC seats available: " + totalFirstAC);
        System.out.print("Enter seats to book: ");
        int seats = sc.nextInt();

        if (seats <= totalFirstAC) {
            totalFirstAC -= seats;
            bill += seats * firstAcPrice;
            System.out.println("First AC booking successful!");
        } else {
            System.out.println("Not enough First AC seats!");
        }
    }
	
	//Method for booking the second class seats 
    public static void bookSecondAC() {
        System.out.println("Second AC seats available: " + totalSecondAC);
        System.out.print("Enter seats to book: ");
        int seats = sc.nextInt();

        if (seats <= totalSecondAC) {
            totalSecondAC -= seats;
            bill+= seats*secondAcPrice;
            System.out.println("Second AC booking successful!");
        } else {
            System.out.println("Not enough Second AC seats!");
        }
    }

	//Method for printing the bill 
    public static void printBill() {
        System.out.println("\nYour total bill is: " +bill);
    }
}
