import java.util.Scanner;
public class CountVowelConsonent{
	
	public static void main(String [] args){
		
		//taking user inputs 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		int vowelCount=0;
		int consonentCount=0;
		
		//counting the total of vowel and consonent
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
			   str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
			   
			     vowelCount+=1;
				} else{
				      consonentCount+=1;
					}
			}
		//printing the result
        System.out.println("Vowel present in the String "+vowelCount);
        System.out.println("Consonent present in the String "+consonentCount);
    }
}	

			