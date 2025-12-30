import java.util.Scanner;
public class FitnessChallengeTracker{

    public static void main(String[] args){
		//Creating Scanner object and storing push-ups in an array 
		Scanner sc=new Scanner(System.in);
        int[] pushUps=new int [7];
		
		for(int i=0;i<7;i++){
			System.out.println("Enter Day "+(i+1)+" Push-ups");
			pushUps[i]=sc.nextInt();	
		}	
        int total=0;
        int activeDays=0;
		//Total push-ups
        for(int count:pushUps){
            if(count==0){
                continue;
            }
            total+=count;
            activeDays++;
        }
        double average=(double)total/activeDays;
		//printing the results 
        System.out.println("Total push-ups in a week: "+total);
        System.out.println("Average push-ups per active day: "+average);
    }
}
