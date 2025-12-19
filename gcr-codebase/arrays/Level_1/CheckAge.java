import java.util.Scanner;
public class CheckAge{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner inputs=new Scanner(System.in);
        
       int age[]=new int [10];
	   
	   //Taking user inputs
	   System.out.println("Enter age to check:");
	   
	   for(int i=0;i<10;i++){
			age[i]=inputs.nextInt();
	   }
	   
	   // checking and printing the voting eligibility 
	   for(int i=0;i<10;i++){
		if(age[i]>=18){
			System.out.println("The Student with age: "+age[i]+" can vote");
		}else if(age[i]>=0 && age[i]<18){
			System.out.println("The Student with age: "+age[i]+" can not vote");
		}else{
			System.out.println("Invalid Age");
	}
	
   }
}
}
