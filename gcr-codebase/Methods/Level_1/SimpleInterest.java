import java.util.Scanner;
public class SimpleInterest{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs
        System.out.print("Enter Principal: ");
        double principal=sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate=sc.nextDouble();
        System.out.print("Enter Time: ");
        double time=sc.nextDouble();
        
        //method call using object
        double si=calculateSimpleInterest(principal,rate,time);
        
			//display results 
        System.out.println("The Simple Interest is "+si+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
    }
    
    //method to calculate simple interest
    public static double calculateSimpleInterest(double principal,double rate,double time){
        return (principal*rate*time)/100;
    }
}
