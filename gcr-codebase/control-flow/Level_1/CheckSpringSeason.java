import java.util.Scanner;
public class CheckSpringSeason {

   public static void main (String [] args){
   
   //Taking user inputs
   Scanner inputs=new  Scanner(System.in);
   System.out.print("Enter Month number, and Day: ");
   int month=inputs.nextInt();
   int day=inputs.nextInt();
   
   //checking SpringSeason 
   if((month == 3 && day >= 20) ||(month == 4) ||(month == 5) ||(month == 6 && day <= 20)){
	 System.out.println("Its a Spring Season");
   }
   else{
     System.out.println("Its not a Spring Season");
   }
   }
   }
