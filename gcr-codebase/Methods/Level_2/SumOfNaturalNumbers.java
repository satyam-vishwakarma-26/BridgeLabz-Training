import java.util.Scanner;
public class SumOfNaturalNumbers{
    public static void main(String[]args){
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input one natural number
        System.out.print("Enter a natural number: ");
        int n=sc.nextInt();
        
        if(n>0){
            int recursiveSum=findSumRecursive(n);
            int formulaSum=findSumFormula(n);
            
            //display result of comparing sums
            System.out.println("Sum using recursion: "+recursiveSum);
            System.out.println("Sum using formula: "+formulaSum);
            
            if(recursiveSum==formulaSum){
                System.out.println("Both results are correct");
            }else{
                System.out.println("Results are not equal");
            }
        }else{
            System.out.println("Please enter a natural number");
        }
    }
    
    //method to find sum using recursion
    public static int findSumRecursive(int n){
        if(n==1){
            return 1;
        }
        return n+findSumRecursive(n-1);
    }
    
    //method to find sum using formula
    public static int findSumFormula(int n){
        return n*(n+1)/2;
    }
}