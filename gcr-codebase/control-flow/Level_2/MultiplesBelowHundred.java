import java.util.Scanner;
public class MultiplesBelowHundred{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        //check for positive integer and less than 100
        if(number>0&&number<100){
            System.out.println("Multiples of "+number+" below 100 are:");
            
            for(int i=100;i>=1;i--){
                if(i%number==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Please enter a positive integer less than 100");
        }
    }
}
