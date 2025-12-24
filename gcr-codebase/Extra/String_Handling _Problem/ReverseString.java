import java.util.Scanner; 
	public class ReverseString{
		public static void main(String [] args){
			
			// Taking user imputs
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.next();
		
		String reverse="";
		
		// String reversing 
		for(int i=str.length()-1;i>=0;i--){
		   reverse+=str.charAt(i);
		  }
		System.out.println("Reverse String is: "+reverse);
		
	}	
}			
		