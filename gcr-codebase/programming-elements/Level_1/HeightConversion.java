import java.util.Scanner;
public class HeightConversion{
 public static void main(String [] args){
 
//Scanner class for user inputs
 Scanner inputs=new Scanner (System.in);
// Height input
System.out.print("Enter Height in Centimeters: ");
 double Height_Cm=inputs.nextDouble();

//Height in Inches
  double Height_In=(Height_Cm/2.54);
//Height in feet
 double Height_Feet=(Height_In/12);

//Printing Heights
 System.out.println("Your Height in cm is: " +Height_Cm+ ",  while in feet is: "+Height_Feet+", and inches is: "+Height_In);


  }
}