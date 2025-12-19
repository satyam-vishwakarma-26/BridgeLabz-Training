import java.util.Scanner;
	public class OddEvenArray{
		public static void main(String[] args){    
			//Scanner class and object 
			Scanner input=new Scanner(System.in);
			
			//Taking user input
			System.out.print("Enter a number: ");
			int number=input.nextInt();
			
			//Check for number
			if(number<=0){
				System.out.println("Please enter a valid natural number");
				return;
			}
			
			//Arrays for odd and even numbers
			int[] evenNumbers=new int[number/2+1];
			int[] oddNumbers=new int[number/2+1];
			
			//Index variables
			int evenIndex=0;
			int oddIndex=0;
			
			//Loop for storing odd and even numbers
			for(int i=1;i<=number;i++){
				if(i%2==0){
					 evenNumbers[evenIndex]=i;
					evenIndex++;
				}else{
					 oddNumbers[oddIndex]=i;
					oddIndex++;
				}
			}
			
			//Printing even numbers
			System.out.println("Even numbers:");
			
			for(int i=0;i<evenIndex;i++){
				System.out.println(evenNumbers[i]);
			}
			
			//Printing odd numbers
			 System.out.println("Odd numbers:");
			for(int i=0;i<oddIndex;i++){
				System.out.println(oddNumbers[i]);
			}
		}
}
