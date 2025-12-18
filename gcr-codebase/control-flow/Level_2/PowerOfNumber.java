import java.util.Scanner;
public class PowerOfNumber{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        System.out.print("Enter the power: ");
        int power=sc.nextInt();
        
        //check for positive integers
        if(number>0&&power>0){
            int result=1;
            
            //calculating power
            for(int i=1;i<=power;i++){
                result=result*number;
            }
            
            //display result
            System.out.println("Result is: "+result);
        }else{
            System.out.println("Please enter positive integers");
        }
    }
}
