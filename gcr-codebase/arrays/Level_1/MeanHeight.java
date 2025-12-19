import java.util.Scanner;
	public class MeanHeight{
		public static void main(String[] args){  
			//Scanner class and object 
			Scanner input=new Scanner(System.in);
			
			//Array to store heights
			double[] heights=new double[11];
			double sum=0.0;
			
			//Taking user input and calculating sum
			for(int i=0;i<11;i++){
				System.out.print("Enter height of player "+(i+1)+": ");
				heights[i]=input.nextDouble();
				sum+=heights[i];
			}
		//Calculating mean
			double mean=sum/11;
			
		//Displaying mean height
			System.out.println("Mean height of the football team: "+mean);
		}
}
