import java.util.Scanner;
public class FactorsAndOperations{
    public static void main(String[]args){
        //Create Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input which need to compute
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        
        int factors[]=findFactors(number);
        
        //displaying factors
        System.out.print("Factors are: ");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+" ");
        }
		
        System.out.println();
        
        //method calling for calculating sum, product, and sumofsquares
        int sum=findSum(factors);
        int product=findProduct(factors);
        double sumOfSquares=findSumOfSquares(factors);
        
        //display result of factors
        System.out.println("Sum of factors: "+sum);
        System.out.println("Product of factors: "+product);
        System.out.println("Sum of squares of factors: "+sumOfSquares);
    }
    
    //method to find factors and return array
		public static int[] findFactors(int number){
        int count=0;
        
        //finding count of factors
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        
        int factors[]=new int[count];
        int index=0;
        
        //storing factors
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors[index]=i;
                index++;
            }
        }
        return factors;
    }
    
    //method to find sum of factors
    public static int findSum(int factors[]){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum=sum+factors[i];
        }
        return sum;
    }
    
    //method to find product of factors
    public static int findProduct(int factors[]){
        int product=1;
        for(int i=0;i<factors.length;i++){
            product=product*factors[i];
        }
        return product;
    }
    
    //method to find sum of squares of factors
    public static double findSumOfSquares(int factors[]){
        double sum=0;
        for(int i=0;i<factors.length;i++){
            sum=sum+Math.pow(factors[i],2);
        }
        return sum;
    }
}
