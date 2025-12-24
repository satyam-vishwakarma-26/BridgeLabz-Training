import java.util.Scanner;
public class FibonacciGenerator{
    
	//print fibonacci sequence
    public static void printFibonacci(int n){
        int a=0,b=1;
        //generate terms
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        //Creating Scanner class and object and taking user inputs
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        printFibonacci(n);
    }
}
