import java.util.Scanner;
public class StudentScoreCard{

    //method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int n){
        int scores[][]=new int[n][3];
        
        for(int i=0;i<n;i++){
            scores[i][0]=(int)(Math.random()*90)+10; //Physics
            scores[i][1]=(int)(Math.random()*90)+10; //Chemistry
            scores[i][2]=(int)(Math.random()*90)+10; //Maths
        }
        return scores;
    }
    
    //method to calculate total, average and percentage
    public static double[][] calculateResults(int scores[][]){
        int n=scores.length;
        double result[][]=new double[n][3]; //total, average, percentage
        
        for(int i=0;i<n;i++){
            double total=scores[i][0]+scores[i][1]+scores[i][2];
            double average=total/3;
            double percentage=average;
            
            //rounding to 2 digits
            total=Math.round(total*100.0)/100.0;
            average=Math.round(average*100.0)/100.0;
            percentage=Math.round(percentage*100.0)/100.0;
            
            result[i][0]=total;
            result[i][1]=average;
            result[i][2]=percentage;
        }
        return result;
    }
    
    //method to calculate grades
    public static String[] calculateGrades(double percentage[]){
        String grade[]=new String[percentage.length];
        
        for(int i=0;i<percentage.length;i++){
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
        return grade;
    }
    
    //method to display scorecard
    public static void displayScoreCard(int scores[][],double result[][],String grade[]){
        System.out.println("Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        
        for(int i=0;i<scores.length;i++){
            System.out.println(
                scores[i][0]+"\t"+
                scores[i][1]+"\t\t"+
                scores[i][2]+"\t"+
                result[i][0]+"\t"+
                result[i][1]+"\t"+
                result[i][2]+"\t\t"+
                grade[i]
            );
        }
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking number of students
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        
        //generating scores
        int scores[][]=generatePCMScores(n);
        
        //calculating results
        double result[][]=calculateResults(scores);
        
        //extracting percentage
        double percentage[]=new double[n];
        for(int i=0;i<n;i++){
            percentage[i]=result[i][2];
        }
        
        //calculating grades
        String grade[]=calculateGrades(percentage);
        
        //displaying scorecard
        displayScoreCard(scores,result,grade);
    }
}
