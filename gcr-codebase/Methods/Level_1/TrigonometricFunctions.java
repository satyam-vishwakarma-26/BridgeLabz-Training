import java.util.Scanner;
public class TrigonometricFunctions{

		//method to calculate trigonometric functions using math class
    public static double[] calculateTrigonometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        double sine=Math.sin(radians);
        double cosine=Math.cos(radians);
        double tangent=Math.tan(radians);
        return new double[]{sine,cosine,tangent};
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input for calculate
        System.out.print("Enter angle in degrees: ");
        double angle=sc.nextDouble();
        
        //method call and making an array for storing the result
		
        double result[]=calculateTrigonometricFunctions(angle);
        
        //display result
        System.out.println("Sine value: "+result[0]);
        System.out.println("Cosine value: "+result[1]);
        System.out.println("Tangent value: "+result[2]);
    }
}
