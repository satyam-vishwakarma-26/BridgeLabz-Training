import java.util.Scanner;
public class LargestAndSecondLargestDigitII{

    public static void main(String[]args){ 
        //Scanner class and object
        Scanner sc=new Scanner(System.in);

        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
			int maxDigit=10;
			int digits[]=new int[maxDigit];
			int index=0;
        
        //storing digits of the number in array
        while(number!=0){
            
            //increase array size if index reaches maxDigit
            if(index==maxDigit){
                maxDigit=maxDigit+10;
                int temp[]=new int[maxDigit];
                for(int i=0;i<digits.length;i++){
                    temp[i]=digits[i];
                }
                digits=temp;
            }
            
            digits[index]=number%10;
            number=number/10;
            index++;
        }
        
        int largest=0;
        int secondLargest=0;
        
        //finding largest and second largest digit
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondLargest&&digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
        
        //printing result
        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+secondLargest);
    }
}
