import java.util.Scanner;
public class TriangleRun{

    public static void main(String[]args){
        
			//Scanner class and object
        Scanner sc=new Scanner(System.in);
        
			//Taking user inputs
			System.out.print("Enter side 1 of triangle (in meters): ");
			double side1=sc.nextDouble();
			System.out.print("Enter side 2 : ");
			double side2=sc.nextDouble();
			System.out.print("Enter side 3 : ");
			double side3=sc.nextDouble();
        
        //method call
        double rounds=calculateRounds(side1,side2,side3);
        
        //display result
        System.out.println("Number of rounds to complete 5 km run: "+rounds);
    }
    
    //method to calculate number of rounds
    public static double calculateRounds(double a,double b,double c){
        double perimeter=a+b+c;
        double distance=5000;
        return distance/perimeter;
    }
}
