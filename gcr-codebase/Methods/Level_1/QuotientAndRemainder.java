import java.util.Scanner;
public class QuotientAndRemainder{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor=sc.nextInt();
        
        //method calling and storing in an array the result 
        int result[]=findRemainderAndQuotient(number,divisor);
        
        //display result by array index
        System.out.println("Quotient: "+result[0]);
        System.out.println("Remainder: "+result[1]);
    }
    
    //method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};
    }
}
