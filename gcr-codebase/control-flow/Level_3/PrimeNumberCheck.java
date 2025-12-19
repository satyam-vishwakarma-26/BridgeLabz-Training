import java.util.Scanner;
public class PrimeNumberCheck{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner inputs=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=inputs.nextInt();
        
        //prime number check
        if(number>1){
            boolean isPrime=true;
            
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
            //Printing prime or not 
            if(isPrime){
                System.out.println(number+" is a Prime Number");
            }else{
                System.out.println(number+" is not a Prime Number");
            }
        }else{
            System.out.println("Prime numbers are greater than 1");
        }
    }
}
