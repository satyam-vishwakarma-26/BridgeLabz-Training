import java.util.Scanner;
public class HarshadNumber{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        int sum=0;
        int originalNumber=number;
        
        //finding sum of digits
        while(originalNumber!=0){
            int digit=originalNumber%10;
            sum=sum+digit;
            originalNumber=originalNumber/10;
        }
        
        //checking Harshad number
        if(sum!=0&&number%sum==0){
            System.out.println(number+" is a Harshad Number");
        }else{
            System.out.println(number+" is not a Harshad Number");
        }
    }
}
