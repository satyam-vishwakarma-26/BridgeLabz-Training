import java.util.Scanner;
public class NaturalNumber {

   public static void main (String [] args){
   
   //Taking user inputs
   Scanner inputs=new  Scanner(System.in);
   System.out.print("Enter a number: ");
   int number=inputs.nextInt();
   
   //checking number 
   if(number>0){
     int sum=number*(number+1)/2;
	 System.out.println("The sum of "+number+" natural numbers is "+sum);
   }
   else{
     System.out.println(number+" is not a natural number");
   }
   }
}