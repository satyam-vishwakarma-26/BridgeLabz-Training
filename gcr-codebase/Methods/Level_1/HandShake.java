import java.util.Scanner;
public class HandShake{
	public static void main(String [] args){
	
		//making scanner object
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of Students: ");
		int students=sc.nextInt();
		
		int handshakes=maxHandShakeCalculation(students);
		 
		 System.out.println("Maximum number of handshake: "+handshakes);
		
		}
		
		
		public static int maxHandShakeCalculation(int n){
			//calculating maxHandShake
		int maxHandShake=(n*(n-1))/2;
		
	    return maxHandShake;
		}
		
	}