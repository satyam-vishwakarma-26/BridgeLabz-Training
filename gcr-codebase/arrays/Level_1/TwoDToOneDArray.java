import java.util.Scanner;
	public class TwoDToOneDArray{
		public static void main(String[] args){
		     
			//Scanner class and object 
			Scanner input=new Scanner(System.in);
			
			//Taking rows and columns input
			System.out.print("Enter number of rows: ");
			int rows=input.nextInt();
			System.out.print("Enter number of columns: ");
			int columns=input.nextInt();
			
			//Creating 2D array
			int[][] matrix=new int[rows][columns];
			
			//Taking matrix input
			for(int i=0;i<rows;i++){
				for(int j=0;j<columns;j++){
					System.out.print("Enter element ["+i+"]["+j+"]: ");
					matrix[i][j]=input.nextInt();
				}
			}			
			//Creating 1D array to store values
			int[] array=new int[rows*columns];
			int index=0;
			
			//Copying to 1D array
			for(int i=0;i<rows;i++){
				for(int j=0;j<columns;j++){
					array[index]=matrix[i][j];
					index++;
			 }
			}			
			//Displaying 1D array
			System.out.println("1D Array elements:");
			for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
		}
}
