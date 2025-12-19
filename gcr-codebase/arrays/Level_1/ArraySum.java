import java.util.Scanner;
	public class ArraySum{
		public static void main(String[] args){
		     
			//Scanner class and object 
			Scanner input=new Scanner(System.in);
			//Taking user input
			double[] numbers=new double[10];
			double total=0.0;
			int index=0;
			
			//loop for printing and conditional checking
			while(true){
				System.out.print("Enter a number: ");
				double num=input.nextDouble();
					if(num<=0 || index==10){
						break;
					}
				numbers[index]=num;
				index++;
				}
				
			System.out.println("Numbers entered:");
			
			for(int i=0;i<index;i++){
				System.out.println(numbers[i]);
				total+=numbers[i];
			}
			
			System.out.println("Sum of all numbers: "+total);
		}
}
