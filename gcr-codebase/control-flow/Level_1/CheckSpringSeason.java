import java.util.Scanner;
public class CheckSpringSeason {

   public static void main (String [] args){
   
   //Taking user inputs by command line 
        if (args.length < 2) {
            System.out.println("Enter month and Day ");
            return;
        }

        // Taking input from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
   
   //checking SpringSeason 
   if((month == 3 && day >= 20) ||(month == 4) ||(month == 5) ||(month == 6 && day <= 20)){
	 System.out.println("Its a Spring Season");
   }
   else{
     System.out.println("Its not a Spring Season");
   }
   }
   }
