import java.util.Scanner;
public class AbundantNumber{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        int sum=0;
        
        //finding sum of divisors
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        
        //checking abundant number
        if(sum>number){
            System.out.println(number+" is an Abundant Number");
        }else{
            System.out.println(number+" is not an Abundant Number");
        }
    }
}
