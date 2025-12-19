import java.util.Scanner;
public class CountDigits{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        int count=0;
        
        //counting digits
        while(number!=0){
            number=number/10;
            count++;
        }
        
        //display result
        System.out.println("Number of digits: "+count);
    }
}
