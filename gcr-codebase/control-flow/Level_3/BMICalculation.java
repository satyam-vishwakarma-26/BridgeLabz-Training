import java.util.Scanner;
public class BMICalculation{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter Person Weight(KG) and Height(CM): ");
        double weight=sc.nextDouble();
		double height=sc.nextDouble();
		
        //Calculating BMI of a person
        double bmi=weight / (height * height);
       
        //display result based on bmi score 
        if(bmi<=18.4){
			System.out.println("Underweight");
			}
	
        else if(bmi>=18.5 && bmi<=24.9 ){
          System.out.println("Normal");
          }
        else if(bmi>=25.0 && bmi<=39.9){
         System.out.println("Overweight");
         }
        else{
         System.out.println("Obese");
        }		 
    }
}
