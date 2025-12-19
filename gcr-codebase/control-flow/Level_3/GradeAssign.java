import java.util.Scanner;
public class GradeAssign{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner inputs=new Scanner(System.in);
        
        //Taking user input
		System.out.print("Enter Marks of Physics, Chemistry, Maths: ");
		int physics=inputs.nextInt();
		int chemistry=inputs.nextInt();
		int math=inputs.nextInt();
		
		//Calculating percentage
		int percentage=(physics+chemistry+math)/3;
		
		//Printing the remarks based on the percentage
		if(percentage>=80){
		    System.out.println("Grade - A");
			System.out.println("Level 4, above agency-normalized standard");
			System.out.println("Marks = "+percentage);
			
	    }else if(percentage>=70 && percentage<=79){
			System.out.println("Grade - B");
			System.out.println("Level 3, at agency-normalized");
			System.out.println("Marks = "+percentage);
			
		}else if(percentage>=60 && percentage<=69){
			System.out.println("Grade - C");
			System.out.println("Level 2, below, but approaching agency-normalized");
			System.out.println("Marks = "+percentage);
			
		}else if(percentage>=50 && percentage < 59){
			System.out.println("Grade - D");
			System.out.println("Remark- Level 1, well below agency-normalized");
			System.out.println("Marks = "+percentage);
			
		}else if(percentage>=40 && percentage < 49){
			System.out.println("Grade - E");
			System.out.println("Remark- Level 1, too below agency-normalized");
			System.out.println("Marks = "+percentage);
			
		}
		else{
			System.out.println("Grade - R");
			System.out.println("Remark- Remendial standards");
			System.out.println("Marks = "+percentage);
        }		 
   }
}
