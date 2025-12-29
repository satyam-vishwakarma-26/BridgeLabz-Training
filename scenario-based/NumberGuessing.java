import java.util.*;

public class NumberGuessing{
	 public static void main (String []  args){
	 
		//Creating Scanner class object 
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess the number between (1-100) ");
		
		//Generating Random Number 
		 int number = (int)(Math.random() * 100) + 1;
		 int attempts=5;
		 
		 //Running the loop for guessing and showing the attempts 
		 do{
		     System.out.println("Attempts left "+attempts);
		    int input=sc.nextInt();
		   if(input>number){
			System.out.println("Your input is Too high ");
			}else if(input<number){
				System.out.println("your inputs is Too Low ");
			}else{
             System.out.println("Congrats!! Yor won the Game ");
			 break;
            }
			
			attempts--;
		    
		 }while(attempts>0);
		 
		 System.out.println("Sorry! Better luck next time. \nThe Answer was: "+number);

	}
}	