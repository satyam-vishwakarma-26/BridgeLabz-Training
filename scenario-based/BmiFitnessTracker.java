import java.util.Scanner;
public class BmiFitnessTracker{
    //calculate bmi
    public static double calculateBmi(double weight,double height){
        return weight/(height*height);
    }
    //check bmi category
    public static void printCategory(double bmi){
        if(bmi<18.5){
            System.out.println("BMI Category: Underweight");
        }else if(bmi>=18.5&&bmi<25){
            System.out.println("BMI Category: Normal");
        }else{
            System.out.println("BMI Category: Overweight");
        }
    }
    public static void main(String[] args){
	
		//Making Scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight=sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double height=sc.nextDouble();
       
	   //calculate bmi
        double bmi=calculateBmi(weight,height);
        System.out.println("BMI: "+bmi);
		
        //print category
        printCategory(bmi);
    }
}
