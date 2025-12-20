import java.util.Scanner;
public class CheckLeapYear{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input year which need to check 
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        
        //method call
        boolean isLeap=checkLeapYear(year);
        
        //display result
        if(isLeap){
            System.out.println("Year is a Leap Year");
        }else{
            System.out.println("Year is not a Leap Year");
        }
    }
    
    //method to check leap year
    public static boolean checkLeapYear(int year){
        if(year>=1582){
            if((year%4==0&&year%100!=0)||(year%400==0)){
                return true;
            }
        }
        return false;
    }
}
