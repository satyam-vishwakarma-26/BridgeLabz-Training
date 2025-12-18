import java.util.Scanner;
public class FizzBuzzII{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        //Taking user inputs
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        
        //check for positive integer
        if(n>0){
            int i=1;
            while(i<=n){
                if(i%3==0&&i%5==0){
                    System.out.println("FizzBuzz");
                }else if(i%3==0){
                    System.out.println("Fizz");
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
                i++;
            }
        }else{
            System.out.println("Please enter a positive integer");
        }
    }
}
