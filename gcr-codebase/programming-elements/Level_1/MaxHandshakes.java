import java.util.Scanner;
public class MaxHandshakes{
 public static void main(String [] args){
 
  //Scanner class for user inputs
    Scanner inputs=new Scanner (System.in);
 // Taking UserInputs
    System.out.println("Enter number of Students ");
    int n=inputs.nextInt();
    
 // Total Handshake calculation
    int total=(n*(n-1))/2;

// Printing the total handshake
   System.out.print("the total Handshake possible are: "+total);
     
  }
}