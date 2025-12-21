import java.util.Scanner;
public class UnitConvertorII{

    //method to convert yards to feet
    public static double convertYardsToFeet(double yards){
        double yards2feet=3;
        return yards*yards2feet;
    }
    
    //method to convert feet to yards
    public static double convertFeetToYards(double feet){
        double feet2yards=0.333333;
        return feet*feet2yards;
    }
    
    //method to convert meters to inches
    public static double convertMetersToInches(double meters){
        double meters2inches=39.3701;
        return meters*meters2inches;
    }
    
    //method to convert inches to meters
    public static double convertInchesToMeters(double inches){
        double inches2meters=0.0254;
        return inches*inches2meters;
    }
    
    //method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches){
        double inches2cm=2.54;
        return inches*inches2cm;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs
        System.out.print("Enter value in yards: ");
        double yards=sc.nextDouble();
        System.out.println("Yards to Feet: "+convertYardsToFeet(yards));
        
        System.out.print("Enter value in feet: ");
        double feet=sc.nextDouble();
        System.out.println("Feet to Yards: "+convertFeetToYards(feet));
        
        System.out.print("Enter value in meters: ");
        double meters=sc.nextDouble();
        System.out.println("Meters to Inches: "+convertMetersToInches(meters));
        
        System.out.print("Enter value in inches: ");
        double inches=sc.nextDouble();
        System.out.println("Inches to Meters: "+convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: "+convertInchesToCentimeters(inches));
    }
}
