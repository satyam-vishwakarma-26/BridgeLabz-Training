import java.util.Scanner;
public class SideofSquare{
 public static void main(String [] args){
 
  //Scanner class for user inputs
    Scanner inputs=new Scanner (System.in);
 // Taking parameter of Square as inputs
    System.out.print("Enter the parameter of the square: ");
    double parameter=inputs.nextDouble();

 // Calculating Side of Square
    double side=parameter/4;
 
// Printing side of Square 
   System.out.println("The length of the side is: "+side+" whose parameter is: "+parameter);
     
  }
}