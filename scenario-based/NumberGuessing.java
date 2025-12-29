import java.util.*;

public class NumberGuessing{
	 public static void main (String []  args){
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess the number between (1-100) ");
		
		 int number = (int)(Math.random() * 100) + 1;
		 int attempts=5;
		 
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