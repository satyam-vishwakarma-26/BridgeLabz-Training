import java.util.Scanner;
public class BMICalculation{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking number of persons
        System.out.print("Enter number of persons: ");
        int n=sc.nextInt();
        
			double weight[]=new double[n];
			double height[]=new double[n];
			double bmi[]=new double[n];
			
        String status[]=new String[n];
        
        //Taking weight and height inputs
        for(int i=0;i<n;i++){
            System.out.print("Enter weight of person "+(i+1)+": ");
            weight[i]=sc.nextDouble();
            System.out.print("Enter height of person "+(i+1)+": ");
            height[i]=sc.nextDouble();
        }
        
        //calculating BMI and weight status
        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
            
            if(bmi[i]<=18.4){
                status[i]="Underweight";
            }else if(bmi[i]>=18.5&&bmi[i]<=24.9){
                status[i]="Normal";
            }else if(bmi[i]>=25.0&&bmi[i]<=39.9){
                status[i]="Overweight";
            }else{
                status[i]="Obese";
            }
        }
        
        //displaying result
        System.out.println("Displaing result");
        for(int i=0;i<n;i++){
            System.out.println(height[i]+" , "+weight[i]+" , "+bmi[i]+" , "+status[i]);
        }
    }
}
