import java.util.Scanner;
public class ItemPrice{
 public static void main(String [] args){
 
  //Scanner class for user inputs
    Scanner inputs=new Scanner (System.in);
 // Taking UserInputs
    System.out.print()
    int price=inputs.nextInt();
    int quantity=inputs.nextInt();
    
 // Total price calculation
    int total=price*quantity;

// Printing the total price
   System.out.print("the total purchase price is INR"+total+"if the quantity "+quantity+" and unit price is INR "+price);
     
  }
}