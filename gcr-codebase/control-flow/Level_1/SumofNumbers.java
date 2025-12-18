import java.util.Scanner;
public class SumofNumbers {

   public static void main (String [] args){
   
   
   Scanner inputs=new  Scanner(System.in);
   //making variables
   System.out.println("Enter value ");
   double values=inputs.nextDouble();
   double sum=0.0;
   
   //while loop for taking input and adding in sum 
      while(values!=0){
	  System.out.println("Enter value ");
	  values=inputs.nextDouble();
	  sum+=values;
	}
	System.out.println("Total sum of Values: "+sum);
   }
   }
