import java.util.Scanner;
public class SumOfNnaturalNumber{
	public static void main(String [] args){
		
		// Scanner class and object 
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number:");
		int number=sc.nextInt();
		
		// method call
		int sum=sumofNumber( number);
		
		System.out.println("Sum of n natural number is : "+sum);
		
	}
	//method for calculating sum of natural number 
	 public static int sumofNumber(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
       return sum;
	 }
}
	   
		