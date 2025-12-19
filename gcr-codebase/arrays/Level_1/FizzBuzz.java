import java.util.Scanner;
	public class FizzBuzz{
		public static void main(String[] args){
			//Scanner class and object 
			Scanner input=new Scanner(System.in);
			
			//Taking user input
			System.out.print("Enter a number: ");
			int number=input.nextInt();
			
			//Check for positive integer
			if(number<=0){
				System.out.println("It is not a positive number");
				return;
			}
			
			//String array to store result
			String[] result=new String[number+1];
			
			//Loop for FizzBuzz storing 
			for(int i=0;i<=number;i++){
				if(i==0){
					result[i]="0";
				}
				else if(i%3==0 && i%5==0){
					result[i]="FizzBuzz";
				}
				else if(i%3==0){
					result[i]="Fizz";
				}
				else if(i%5==0){
					result[i]="Buzz";
				}
				else{
					result[i]=String.valueOf(i);
				}
			}
			
			//Displaying result of fizzbuzz 
			for(int i=0;i<=number;i++){
				System.out.println("Position "+i+" = "+result[i]);
			}
		}
}
