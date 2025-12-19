import java.util.Scanner;
public class LeapYearII{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner inputs=new Scanner(System.in);
        
        //Taking user input
		System.out.println("Enter year: ");
		int year=inputs.nextInt();
		
		//Checking leap year
		if(year>=1582 && year%4==0 && year%100!=0 || year%400==0 ){
		
		   System.out.println(year+" is a leap year");
       
        }else{
		 System.out.println(year+" is not a leap year");
    }
	
   }
}
