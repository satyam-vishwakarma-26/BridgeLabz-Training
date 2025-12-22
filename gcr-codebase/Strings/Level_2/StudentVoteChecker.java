import java.util.Scanner;
public class StudentVoteChecker{

    //method to generate Random Ages
    public static int[] generateRandomAges(int n){
        int ages[]=new int[n];
        for(int i=0;i<n;i++){
            ages[i]=(int)(Math.random()*90)+10;
        }
        return ages;
    }
    
    //method to check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int ages[]){
        String result[][]=new String[ages.length][2];
        
        for(int i=0;i<ages.length;i++){
            result[i][0]=String.valueOf(ages[i]);
            
            if(ages[i]<0){
                result[i][1]="false";
            }else if(ages[i]>=18){
                result[i][1]="true";
            }else{
                result[i][1]="false";
            }
        }
        return result;
    }
    
    //method to display result in tabular format
    public static void displayResult(String data[][]){
        System.out.println("Age\tCan Vote");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t"+data[i][1]);
        }
    }
    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking number of students
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        
        //generating random ages
        int ages[]=generateRandomAges(n);
        
        //checking voting eligibility
        String result[][]=checkVotingEligibility(ages);
        
        //displaying result
        displayResult(result);
    }
}
