import java.util.Scanner;
public class YoungestAndTallest{
   //method to find youngest friend
    public static int findYoungest(int age[]){
        int minIndex=0;
        for(int i=1;i<age.length;i++){
            if(age[i]<age[minIndex]){
                minIndex=i;
         }
        }
        return minIndex;
    }
    //method to find tallest friend
    public static int findTallest(int height[]){
        int maxIndex=0;
        for(int i=1;i<height.length;i++){
            if(height[i]>height[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        String names[]={"Amar","Akbar","Anthony"};
        int age[]=new int[3];
        int height[]=new int[3];
        
        //Taking age input
        for(int i=0;i<3;i++){
            System.out.print("Enter age of "+names[i]+": ");
            age[i]=sc.nextInt();
        }
        
        //Taking height input
        for(int i=0;i<3;i++){
            System.out.print("Enter height of "+names[i]+": ");
            height[i]=sc.nextInt();
        }
        
        int youngestIndex=findYoungest(age);
        int tallestIndex=findTallest(height);
        
        //display result
        System.out.println(names[youngestIndex]+" is the youngest");
        System.out.println(names[tallestIndex]+" is the tallest");
    }
}