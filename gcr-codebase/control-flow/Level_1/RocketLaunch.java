import java.util.Scanner;
public class RocketLaunch {

   public static void main (String [] args){
   
   //Taking user inputs
   Scanner inputs=new  Scanner(System.in);
   System.out.print("Enter a number: ");
   int counter=inputs.nextInt();
   
   //loop for count printing
    while(counter>=1){
	System.out.println(counter);
	counter--;
	}
   }
   }
