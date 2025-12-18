import java.util.Scanner;
public class FactorsOfNumber{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        //check for positive integer
        if(number>0){
            System.out.println("Factors of "+number+" are:");
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Please enter a positive integer");
        }
    }
}
