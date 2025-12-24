import java.util.Scanner;
public class GCDLCMCalculator{
    
	//taking user input
    public static int takeInput(Scanner sc,String msg){
        System.out.print(msg);
        return sc.nextInt();
    }
    
	//calculate gcd
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
	//calculate lcm
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
   
   //display result
    public static void displayResult(int a,int b,int g,int l){
        System.out.println("GCD of "+a+" and "+b+" is: "+g);
        System.out.println("LCM of "+a+" and "+b+" is: "+l);
    }
    public static void main(String[] args){
		
		//Creating Scanner class, Object and taking user inputs
        Scanner sc=new Scanner(System.in);
        int a=takeInput(sc,"Enter first number: ");
        int b=takeInput(sc,"Enter second number: ");
		
        int g=gcd(a,b);
        int l=lcm(a,b);
        displayResult(a,b,g,l);
    }
}
