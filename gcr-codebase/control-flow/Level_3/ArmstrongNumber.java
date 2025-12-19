import java.util.Scanner;
public class ArmstrongNumber{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        int sum=0;
        int originalNumber=number;
        
        //checking armstrong number
        while(originalNumber!=0){
            int digit=originalNumber%10;
            sum=sum+(digit*digit*digit);
            originalNumber=originalNumber/10;
        }
        
        //display result
        if(sum==number){
            System.out.println(number+" is an Armstrong Number");
        }else{
            System.out.println(number+" is not an Armstrong Number");
        }
    }
}
