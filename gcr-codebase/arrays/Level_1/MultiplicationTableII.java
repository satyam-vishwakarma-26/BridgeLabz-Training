import java.util.Scanner;
	public class MultiplicationTableII{
		public static void main(String[] args){  
			//Scanner class and object 
			Scanner input=new Scanner(System.in);
			
			//Taking user input
			System.out.print("Enter a number: ");
			int number=input.nextInt();
			
			//Array to store result
			int[] multiplicationResult=new int[4];
			
			//loop for calculation multiplication
			for(int i=6;i<=9;i++){
				multiplicationResult[i-6]=number*i;
			}
			
			//printing result
			for(int i=6;i<=9;i++){
				System.out.println(number+" * "+i+" = "+multiplicationResult[i-6]);
			}
		}
}
