import java.util.Scanner;
	public class FactorsOfArray{
		public static void main(String[] args){ 
			//Scanner class and object 
			Scanner input=new Scanner(System.in);
			
			//Taking user input
			System.out.print("Enter a number: ");
			int number=input.nextInt();
			
			//array size
			int maxFactor=10;
			int[] factors=new int[maxFactor];
			int index=0;
			
			//Loop for factors
			for(int i=1;i<=number;i++){
				if(number%i==0){
					
					//Check array size
					if(index==maxFactor){
						maxFactor=maxFactor*2;
						int[] temp=new int[maxFactor];
						
						for(int j=0;j<factors.length;j++){
							temp[j]=factors[j];
						}
						factors=temp;
					}
					
					factors[index]=i;
					index++;
				}
			}
			
			//Displaying factors
			System.out.println("Factors of "+number+":");
			for(int i=0;i<index;i++){
				System.out.println(factors[i]);
			}
		}
}
