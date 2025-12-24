import java.util.Scanner;
public class MaxOfThree{
	
    //take input
    public static int takeInput(Scanner sc,String msg){
        System.out.print(msg);
        return sc.nextInt();
    }
    //find maximum
    public static int findMax(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    public static void main(String[] args){
	    //Creating Scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        int a=takeInput(sc,"Enter first number: ");
        int b=takeInput(sc,"Enter second number: ");
        int c=takeInput(sc,"Enter third number: ");
        int max=findMax(a,b,c);
        System.out.println("Maximum number is: "+max);
    }
}
