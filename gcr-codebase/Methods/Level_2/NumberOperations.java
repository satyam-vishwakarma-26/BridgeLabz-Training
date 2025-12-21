
import java.util.Scanner;
public class NumberOperations{

    //method to check positive or negative
    public static boolean isPositive(int num){
        return num>0;
    }
    
    //method to check even or odd
    public static boolean isEven(int num){
        return num%2==0;
    }
    
    //method to compare two numbers
    public static int compare(int num1,int num2){
        if(num1>num2){
            return 1;
        }else if(num1==num2){
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        int numbers[]=new int[5];
        
        //Taking user input
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        
        //checking numbers
        for(int i=0;i<numbers.length;i++){
            if(isPositive(numbers[i])){
                if(isEven(numbers[i])){
                    System.out.println(numbers[i]+" is positive and even");
                }else{
                    System.out.println(numbers[i]+" is positive and odd");
                }
            }else{
                System.out.println(numbers[i]+" is negative");
            }
        }       
        //comparing first and last element
        int result=compare(numbers[0],numbers[numbers.length-1]);
        
        if(result==1){
            System.out.println("First element is greater than last element");
        }else if(result==0){
            System.out.println("First and last elements are equal");
        }else{
            System.out.println("First element is less than last element");
        }
    }
}
