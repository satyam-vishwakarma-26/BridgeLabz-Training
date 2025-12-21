import java.util.Scanner;
public class NumberCheck{

    public static void main(String[]args){ 
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking input from the user 
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        //calling method to check 
        int result=checkNumber(number);
        
        //display result
        if(result==1){
            System.out.println("The number is positive");
        }else if(result==-1){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }
    }
    
    //method to check number
    public static int checkNumber(int num){
        if(num>0){
            return 1;
        }else if(num<0){
            return -1;
        }else{
            return 0;
        }
    }
}
