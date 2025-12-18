import java.util.Scanner;
public class FactorsOfNumberII{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.println("Enter a number which need to check: ");
        int number=sc.nextInt();
        
        //check for positive integer
        if(number>0){
            System.out.println("Factors of: "+number+" are:");
            int i=1;
            while(i<=number){
                if(number%i==0){
                    System.out.println(i);
                }
                i++;
            }
        }else{
            System.out.print("Please enter a positive integer");
        }
    }
}
