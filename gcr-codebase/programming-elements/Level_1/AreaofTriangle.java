import java.util.Scanner;
public class AreaofTriangle{
 public static void main(String [] args){
 
      //Scanner class for user inputs
      Scanner inputs=new Scanner (System.in);

       // Height of Triangle
       System.out.print("Enter Height in Inches: ");
       double height=inputs.nextDouble();
      //Base of Triangle
      System.out.print("Enter Base in Inches: ");
      double base=inputs.nextDouble();

        // Area in square inches
        double areaInSqInches = 0.5 * base * height;

        // Convert square inches to square centimeters
        // 1 inch = 2.54 cm → 1 sq inch = 6.4516 sq cm
        double areaInSqCm = areaInSqInches * 6.4516;

        // Output
        System.out.println("Area of triangle:");
        System.out.println("In square inches = " + areaInSqInches);
        System.out.println("In square centimeters = " + areaInSqCm);
  }
}