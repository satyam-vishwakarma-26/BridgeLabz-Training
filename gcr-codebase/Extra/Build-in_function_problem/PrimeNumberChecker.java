import java.util.Scanner;
public class PrimeNumberChecker{

    //check prime number
    public static boolean isPrime(int num){
       
	   if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
	
	    //Creating Scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a Prime Number");
        }else{
            System.out.println(num+" is not a Prime Number");
        }
    }
}
