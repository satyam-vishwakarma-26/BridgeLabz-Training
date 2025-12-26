import java.util.Scanner;
public class MetroSmartCard{
    
	//calculate fare using ternary operator
    public static double calculateFare(int distance){
        return (distance<=5)?20:(distance<=15)?40:60;
    }
	
    public static void main(String[] args){
	
		//Creating Scanner, object and taking user inputs
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter initial smart card balance: ");
        double balance=sc.nextDouble();
       
	   //checking balance and printing the results 
	   while(true){
            if(balance<=0){
                System.out.println("Balance exhausted");
                break;
            }
            System.out.print("Enter distance in km (or -1 to quit): ");
            int distance=sc.nextInt();
            if(distance==-1){
                System.out.println("Journey ended");
                break;
            }
            double fare=calculateFare(distance);
            if(balance>=fare){
                balance=balance-fare;
                System.out.println("Fare deducted: "+fare);
                System.out.println("Remaining balance: "+balance);
            }else{
                System.out.println("Insufficient balance");
                break;
            }
        }
    }
}
