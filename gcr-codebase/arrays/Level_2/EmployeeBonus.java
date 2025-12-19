import java.util.Scanner;
	public class EmployeeBonus{
		public static void main(String[] args){
		     
			//Scanner class and object 
			Scanner input=new Scanner(System.in);
			
			//Arrays for salary and service years
			double[] salary=new double[10];
			double[] serviceYears=new double[10];
			
			//Arrays for bonus and new salary
			double[] bonus=new double[10];
			double[] newSalary=new double[10];
			
			double totalBonus=0.0;
			double totalOldSalary=0.0;
			double totalNewSalary=0.0;
			
			//Taking input for 10 employees
			for(int i=0;i<10;i++){
				System.out.print("Enter salary of employee "+(i+1)+": ");
				double sal=input.nextDouble();
				System.out.print("Enter years of service of employee "+(i+1)+": ");
				double years=input.nextDouble();
				
				//Validation check
				if(sal<=0 || years<0){
					System.out.println("Invalid input");
					i--;
					continue;
				}
				
				salary[i]=sal;
				serviceYears[i]=years;
			}
			
			//Calculating bonus and new salary
			for(int i=0;i<10;i++){
				if(serviceYears[i]>5){
					bonus[i]=salary[i]*0.05;
				}else{
					bonus[i]=salary[i]*0.02;
				}
				
				newSalary[i]=salary[i]+bonus[i];
				
				totalBonus+=bonus[i];
				totalOldSalary+=salary[i];
				totalNewSalary+=newSalary[i];
			}	
			//Displaying totals bonus , old salary, new salary
			System.out.println("Total Bonus Paid: "+totalBonus);
			System.out.println("Total Old Salary: "+totalOldSalary);
			System.out.println("Total New Salary: "+totalNewSalary);
		}
}
