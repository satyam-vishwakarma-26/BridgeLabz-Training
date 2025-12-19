import java.util.Scanner;
public class BMICalculationII{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking number of persons
        System.out.print("Enter number of persons: ");
        int number=sc.nextInt();
        
        double[][] personData=new double[number][3];
        String[] weightStatus=new String[number];
        
        //Taking weight and height inputs
        for(int i=0;i<number;i++){
            
            //weight input validation
            System.out.print("Enter weight of person "+(i+1)+": ");
            personData[i][0]=sc.nextDouble();
            while(personData[i][0]<=0){
                System.out.print("Enter positive weight: ");
                personData[i][0]=sc.nextDouble();
            }
            
            //height input validation
            System.out.print("Enter height of person "+(i+1)+": ");
            personData[i][1]=sc.nextDouble();
            while(personData[i][1]<=0){
                System.out.print("Enter positive height: ");
                personData[i][1]=sc.nextDouble();
            }
        }
        
        //calculating BMI and weight status
        for(int i=0;i<number;i++){
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
            
            if(personData[i][2]<=18.4){
                weightStatus[i]="Underweight";
            }else if(personData[i][2]>=18.5&&personData[i][2]<=24.9){
                weightStatus[i]="Normal";
            }else if(personData[i][2]>=25.0&&personData[i][2]<=39.9){
                weightStatus[i]="Overweight";
            }else{
                weightStatus[i]="Obese";
            }
        }
        
        //displaying result
        System.out.println("Priting person data");
        for(int i=0;i<number;i++){
            System.out.println(personData[i][1]+" , "+personData[i][0]+" , "+personData[i][2]+" , "+weightStatus[i]);
        }
    }
}
