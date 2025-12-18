import java.util.Scanner;
public class GreatestFactor{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        //check for positive integer
        if(number>1){
            int greatestFactor=1;
            
            //finding greatest factor other than the number itself
            for(int i=number-1;i>=1;i--){
                if(number%i==0){
                    greatestFactor=i;
                    break;
                }
            }
            
            //display result
            System.out.println("Greatest factor of "+number+" beside itself is: "+greatestFactor);
        }else{
            System.out.println("Please enter an integer greater than 1");
        }
    }
}
