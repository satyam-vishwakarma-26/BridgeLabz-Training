import java.util.Scanner;
public class MultiplicationTable{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        int table[]=new int[10];
        
        //Calculating table 
        for(int i=1;i<=10;i++){
            table[i-1]=number*i;
        }
        
        //displaying multiplication table
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+table[i-1]);
        }
    }
}
