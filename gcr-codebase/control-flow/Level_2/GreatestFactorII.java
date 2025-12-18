import java.util.Scanner;
public class GreatestFactorII{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        //check for positive integer
        if(number>1){
            int greatestFactor=1;
            int counter=number-1;
            
            //finding greatest factor other than the number itself
            while(counter>=1){
                if(number%counter==0){
                    greatestFactor=counter;
                    break;
                }
                counter--;
            }
            
            //display result
            System.out.println("Greatest factor of "+number+" beside itself is: "+greatestFactor);
        }else{
            System.out.println("Please enter an integer greater than 1");
        }
    }
}
