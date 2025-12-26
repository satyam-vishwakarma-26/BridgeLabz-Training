import java.util.Scanner;
public class ResultGenerator{
    
	//calculate average marks
    public static double calculateAverage(int[] marks){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        return sum/(double)marks.length;
    }
	
    //assign grade using switch
    public static void assignGrade(double avg){
        int grade=(int)(avg/10);
        switch(grade){
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
    }
    public static void main(String[] args){
	
		//Creating scanner class, object and taking user inputs
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        //input marks
        for(int i=0;i<5;i++){
            System.out.print("Enter marks of subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
        }
        double avg=calculateAverage(marks);
        System.out.println("Average: "+avg);
        assignGrade(avg);
    }
}
