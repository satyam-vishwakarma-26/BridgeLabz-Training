import java.util.Scanner;
public class CheckNumber {

   public static void main (String [] args){
   
   //Taking user inputs
   Scanner inputs=new  Scanner(System.in);
   System.out.print("Enter a number: ");
   int number=inputs.nextInt();
   
   //checking number 
   if(number>0){
 
	 System.out.println("Positive");
   }
   else if(number<0){
     System.out.println("Negative");
   }else{
     System.out.println("Zero");
   }
   }
}