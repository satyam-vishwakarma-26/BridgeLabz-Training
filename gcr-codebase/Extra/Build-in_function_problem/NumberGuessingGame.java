import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
   static int low=1;
    static int high=100;
    static Random rand=new Random();
	
    //generate guess
    static int generateGuess(){
        return rand.nextInt(high-low+1)+low;
    }
    //get user feedback
    static String getFeedback(Scanner sc){
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine();
    }
    //update range based on feedback
    static void updateRange(String feedback,int guess){
        if(feedback.equalsIgnoreCase("high")){
            high=guess-1;
        }else if(feedback.equalsIgnoreCase("low")){
            low=guess+1;
        }
    }
    public static void main(String[] args){
	
	    //creating scanner class, object and taking user inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100");
        while(true){
            int guess=generateGuess();
            System.out.println("Again guess: "+guess);
            String feedback=getFeedback(sc);
            if(feedback.equalsIgnoreCase("correct")){
                System.out.println("You guessed correctly!");
                break;
            }
            updateRange(feedback,guess);
        }
    }
}
