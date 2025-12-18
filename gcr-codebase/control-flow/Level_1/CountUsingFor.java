import java.util.Scanner;
public class CountUsingFor {

   public static void main (String [] args){
   
   //Taking user inputs
   Scanner inputs=new  Scanner(System.in);
   System.out.print("Enter a number: ");
   int counter=inputs.nextInt();
   
   //loop for count printing
    for(int i=counter;i>=1;i--){
	System.out.println(counter);
	counter--;
	}
   }
   }
