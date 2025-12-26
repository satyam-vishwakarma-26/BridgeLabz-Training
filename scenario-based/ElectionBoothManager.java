import java.util.Scanner;
public class ElectionBoothManager{
    //check eligibility
    public static boolean isEligible(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
    //record vote
    public static void recordVote(int vote){
        if(vote==1){
            System.out.println("Vote recorded for Candidate 1");
        }else if(vote==2){
            System.out.println("Vote recorded for Candidate 2");
        }else if(vote==3){
            System.out.println("Vote recorded for Candidate 3");
        }else{
            System.out.println("Invalid vote");
        }
    }
    public static void main(String[] args){
	
		//Creating the scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter age (or -1 to exit): ");
            int age=sc.nextInt();
            if(age==-1){
                System.out.println("Polling closed");
                break;
            }
            if(isEligible(age)){
                System.out.print("Enter vote (1/2/3): ");
                int vote=sc.nextInt();
                recordVote(vote);
            }else{
                System.out.println("Not eligible to vote");
            }
        }
    }
}
