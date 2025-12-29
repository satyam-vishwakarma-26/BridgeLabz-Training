import java.util.Scanner;
public class ParkingSystem{

    static int currentOccupancy=0;
    static int totalSlots=5;

    //park vehicle
    public static void park(){
        if(currentOccupancy<totalSlots){
            System.out.println("You can park your vehicle");
            currentOccupancy++;
        }else{
            System.out.println("Parking area is FULL!");
        }
    }

    //show occupancy
    public static void showOccupancy(){
        System.out.println("Available slots are: "+(totalSlots-currentOccupancy));
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Total parking slots: "+totalSlots);

        while(true){

            if(currentOccupancy==totalSlots){
                System.out.println("Parking lot is full. System closed.");
                break;
            }

            System.out.println("\nEnter Your Choice:");
            System.out.println("1. Park");
            System.out.println("2. Exit");
            System.out.println("3. Show Occupancy");

            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    park();
                    break;
                case 2:
                    System.out.println("Thanks for using the Smart Parking System");
                    return;
                case 3:
                    showOccupancy();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
