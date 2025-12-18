import java.util.Scanner;

public class FindBonus {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        //Taking user inputs 
        System.out.print("Enter a salary: ");
        int salary = inputs.nextInt();
		System.out.println("Enter year of experience");
		int year=inputs.nextInt();

       if(year>=5){
	    System.out.println("The bonus amount is: "+((salary*5)/100));
        }else{
		System.out.println("Not eligible for bonus");
		}
    }
}
