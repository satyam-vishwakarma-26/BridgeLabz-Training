import java.util.Scanner;
public class NumberChecker{

    //method to find sum of proper divisors
    public static int sumOfProperDivisors(int number){
        int sum=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    
    //method to check perfect number
    public static boolean isPerfect(int number){
        return sumOfProperDivisors(number)==number;
    }
    
    //method to check abundant number
    public static boolean isAbundant(int number){
        return sumOfProperDivisors(number)>number;
    }
    
    //method to check deficient number
    public static boolean isDeficient(int number){
        return sumOfProperDivisors(number)<number;
    }
    
    //method to find factorial
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    //method to check strong number
    public static boolean isStrong(int number){
        int temp=number;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+factorial(digit);
            temp=temp/10;
        }
        return sum==number;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        System.out.println("Perfect Number: "+isPerfect(number));
        System.out.println("Abundant Number: "+isAbundant(number));
        System.out.println("Deficient Number: "+isDeficient(number));
        System.out.println("Strong Number: "+isStrong(number));
    }
}
