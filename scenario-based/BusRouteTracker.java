import java.util.Scanner;
public class BusRouteTracker{

    //add distance for each stop
    public static int addDistance(int totalDistance,int stopDistance){
        return totalDistance+stopDistance;
    }

    public static void main(String[] args){
		
		//Creating Scanner object 
        Scanner sc=new Scanner(System.in);
        int totalDistance=0;

        while(true){
            System.out.print("Enter distance of next stop (in km): ");
            int stopDistance=sc.nextInt();
            totalDistance=addDistance(totalDistance,stopDistance);

            System.out.println("Total distance covered: "+totalDistance+" km");

            System.out.print("Do you want to get off the bus? (yes/no): ");
            sc.nextLine(); //clear buffer
            String choice=sc.nextLine().toLowerCase();

			//Checking if he want to get off or not 
            if(choice.equals("yes")){
                System.out.println("Passenger got off the bus.");
                System.out.println("Final distance travelled: "+totalDistance+" km");
                break;
            }
        }
    }
}
