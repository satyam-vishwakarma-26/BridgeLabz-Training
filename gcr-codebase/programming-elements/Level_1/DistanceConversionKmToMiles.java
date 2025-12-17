import java.util.Scanner;
public class  DistanceConversionKmToMiles{
 public static void main(String [] args){
 
//Variable storing distance in km
double km;
//Scanner class for taking user input
Scanner input=new Scanner(System.in);
//Taking user input
km=input.nextDouble();

// Conversion of KM to Miles
 double Miles=km/1.6;

//Printing Distances
 System.out.println("The total miles is: " +Miles+ ",  mile for the given: "+km+" Km");


  }
}