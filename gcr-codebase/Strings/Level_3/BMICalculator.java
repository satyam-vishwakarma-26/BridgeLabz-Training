import java.util.Scanner;
public class BMICalculator{

    //method to calculate BMI and status for a person
    public static String[] calculateBMIAndStatus(double weight,double heightCm){
        double heightMeter=heightCm/100;
        double bmi=weight/(heightMeter*heightMeter);
        bmi=Math.round(bmi*100.0)/100.0;
        
        String status;
        if(bmi<=18.4){
            status="Underweight";
        }else if(bmi>=18.5&&bmi<=24.9){
            status="Normal";
        }else if(bmi>=25.0&&bmi<=39.9){
            status="Overweight";
        }else{
            status="Obese";
        }
        
        return new String[]{
            String.valueOf(weight),
            String.valueOf(heightCm),
            String.valueOf(bmi),
            status
        };
    }
    
    //method to compute BMI table for all persons
    public static String[][] generateBMITable(double data[][]){
        String result[][]=new String[data.length][4];
        
        for(int i=0;i<data.length;i++){
            String bmiData[]=calculateBMIAndStatus(data[i][0],data[i][1]);
            result[i][0]=bmiData[1]; //height
            result[i][1]=bmiData[0]; //weight
            result[i][2]=bmiData[2]; //bmi
            result[i][3]=bmiData[3]; //status
        }
        return result;
    }
    
    //method to display BMI table
    public static void displayTable(String table[][]){
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for(int i=0;i<table.length;i++){
            System.out.println(
                table[i][0]+"\t\t"+
                table[i][1]+"\t\t"+
                table[i][2]+"\t"+
                table[i][3]
            );
        }
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        double data[][]=new double[10][2];
        
        //Taking user input
        for(int i=0;i<10;i++){
            System.out.print("Enter weight of person "+(i+1)+" (kg): ");
            data[i][0]=sc.nextDouble();
            System.out.print("Enter height of person "+(i+1)+" (cm): ");
            data[i][1]=sc.nextDouble();
        }      
        //generate BMI table
        String result[][]=generateBMITable(data);
        
        //display result
        displayTable(result);
    }
}
