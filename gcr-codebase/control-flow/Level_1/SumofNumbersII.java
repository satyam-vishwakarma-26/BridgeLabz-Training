import java.util.Scanner;
public class SumofNumbersII {

   public static void main (String [] args){
   
   
   Scanner inputs=new  Scanner(System.in);
   //making variables
   System.out.println("Enter value ");
   double values=inputs.nextDouble();
   double sum=0.0;
   
   //while loop for taking input and adding in sum 
      while(true){
	  if(values<=0){
	  break;
	  }
	  sum+=values;
	  System.out.println("Enter value ");
	  values=inputs.nextDouble();
	}
	System.out.println("Total sum of Values: "+sum);
   }
   }
