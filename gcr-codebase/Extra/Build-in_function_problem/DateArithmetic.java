import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic{
    public static void main(String[] args){
	
	    //Creating Scanner class and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        String input=sc.nextLine();
        LocalDate date=LocalDate.parse(input);
		
        //add days months and years
        LocalDate updatedDate=date.plusDays(7).plusMonths(1).plusYears(2);
		
        //subtract weeks
        updatedDate=updatedDate.minusWeeks(3);
        System.out.println("Final Date: "+updatedDate);
    }
}
