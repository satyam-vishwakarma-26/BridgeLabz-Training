import java.util.Scanner;
public class ReverseNumberUsingArray{

    public static void main(String[]args){
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
			int tempNumber=number;
			int count=0;
        
        //finding count of digits
        while(tempNumber!=0){
				tempNumber=tempNumber/10;
				count++;
        }
        
        int digits[]=new int[count];
        int index=0;
        tempNumber=number;
        
        //storing digits in array
        while(tempNumber!=0){
            digits[index]=tempNumber%10;
            tempNumber=tempNumber/10;
            index++;
        }
        
        int reverseDigits[]=new int[count];
        
        //storing digits in reverse order
        for(int i=0;i<count;i++){
            reverseDigits[i]=digits[i];
        }
        
        //displaying reversed number
        System.out.print("Reversed number: ");
        for(int i=0;i<count;i++){
            System.out.print(reverseDigits[i]);
        }
    }
}
