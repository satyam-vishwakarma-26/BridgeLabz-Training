public class ZaraBonusCalculator{

    //method to generate salary and years of service
    public static double[][] generateEmployeeData(){
        double data[][]=new double[10][2];
        
        for(int i=0;i<10;i++){
            //5 digit salary between 10000 and 99999
            data[i][0]=(int)(Math.random()*90000)+10000;
            //years of service between 1 and 10
            data[i][1]=(int)(Math.random()*10)+1;
        }
        return data;
    }
    
    //method to calculate new salary and bonus
    public static double[][] calculateBonus(double data[][]){
        double result[][]=new double[10][2];
        
        for(int i=0;i<10;i++){
            double salary=data[i][0];
            double years=data[i][1];
            double bonus;
            
            if(years>5){
                bonus=salary*0.05;
            }else{
                bonus=salary*0.02;
            }
            
            result[i][0]=salary+bonus; //new salary
            result[i][1]=bonus;        //bonus amount
        }
        return result;
    }
    
    //method to calculate totals and display result
    public static void calculateAndDisplayTotals(double oldData[][],double newData[][]){
        double totalOldSalary=0;
        double totalNewSalary=0;
        double totalBonus=0;
        
        System.out.println("OldSalary\tYears\tBonus\tNewSalary");
        
        for(int i=0;i<10;i++){
            totalOldSalary+=oldData[i][0];
            totalNewSalary+=newData[i][0];
            totalBonus+=newData[i][1];
            
            System.out.println(
                oldData[i][0]+"\t\t"+
                oldData[i][1]+"\t"+
                newData[i][1]+"\t"+
                newData[i][0]
            );
        }
        
        System.out.println("\nTotal Old Salary: "+totalOldSalary);
        System.out.println("Total Bonus Paid: "+totalBonus);
        System.out.println("Total New Salary: "+totalNewSalary);
    }

    public static void main(String[]args){
        
        //generating employee salary and service data
        double employeeData[][]=generateEmployeeData();
        
        //calculating bonus and new salary
        double updatedData[][]=calculateBonus(employeeData);
        
        //displaying final result
        calculateAndDisplayTotals(employeeData,updatedData);
    }
}
