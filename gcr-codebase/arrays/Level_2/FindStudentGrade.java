import java.util.Scanner;
public class FindStudentGrade{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        //Taking number of students
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        
        int physics[]=new int[n];
        int chemistry[]=new int[n];
        int maths[]=new int[n];
        int percentage[]=new int[n];
        String grade[]=new String[n];
        
        //Taking marks input
        for(int i=0;i<n;i++){
				System.out.println("Enter marks for student "+(i+1));
            
            System.out.print("Physics: ");
            physics[i]=sc.nextInt();
            if(physics[i]<0){
                System.out.println("Enter positive marks");
                 i--;
                 continue;
            }
            
            System.out.print("Chemistry: ");
            chemistry[i]=sc.nextInt();
            if(chemistry[i]<0){
                System.out.println("Enter positive marks");
                i--;
                continue;
            }
            
            System.out.print("Maths: ");
            maths[i]=sc.nextInt();
            if(maths[i]<0){
                System.out.println("Enter positive marks");
                i--;
                continue;
            }
        }
        
        //Calculating percentage and grade
        for(int i=0;i<n;i++){
            percentage[i]=(physics[i]+chemistry[i]+maths[i])/3;
            
            if(percentage[i]>=80){
                grade[i]="Grade - A (Level 4)";
            }else if(percentage[i]>=70&&percentage[i]<=79){
                grade[i]="Grade - B (Level 3)";
            }else if(percentage[i]>=60&&percentage[i]<=69){
                grade[i]="Grade - C (Level 2)";
            }else if(percentage[i]>=50&&percentage[i]<59){
                grade[i]="Grade - D (Level 1)";
            }else if(percentage[i]>=40&&percentage[i]<49){
                grade[i]="Grade - E (Below Level 1)";
            }else{
                grade[i]="Grade - R (Remedial)";
            }
        }
        
        //Displaying result
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for(int i=0;i<n;i++){
            System.out.println(physics[i]+"\t"+chemistry[i]+"\t\t"+maths[i]+"\t"+percentage[i]+"\t\t"+grade[i]);
        }
    }
}
