import java.util.Scanner;
public class FindDistance{
 public static void main(String [] args){
 
  //Scanner class for user inputs
    Scanner inputs=new Scanner (System.in);
 // Taking heights in feets
    System.out.print("Enter the height in Feets: ");
    double height=inputs.nextDouble();

 // Calculating height in yards
    double yards=height/3;
// Calculating height in mile
    double mile=yards/1760;
 
// Printing Distances 
   System.out.println("The Height in Feets: "+height+" While in yards: "+yards+" and in mile is: "+mile);
     
  }
}