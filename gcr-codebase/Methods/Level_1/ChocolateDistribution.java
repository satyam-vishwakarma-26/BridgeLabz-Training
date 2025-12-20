import java.util.Scanner;
public class ChocolateDistribution{
	
	//method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int chocolatesPerChild=number/divisor;
        int remainingChocolates=number%divisor;
        return new int[]{chocolatesPerChild,remainingChocolates};
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs for calculations
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates=sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren=sc.nextInt();
        
        //method call
        int result[]=findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
        
        //display result
        System.out.println("Each child gets: "+result[0]+" chocolates");
        System.out.println("Remaining chocolates: "+result[1]);
    }
}