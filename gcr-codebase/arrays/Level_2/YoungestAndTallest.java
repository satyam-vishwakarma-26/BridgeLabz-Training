import java.util.Scanner;
public class YoungestAndTallest{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        String names[]={"Amar","Akbar","Anthony"};
        int age[]=new int[3];
        int height[]=new int[3];
        
        //Taking age inputs
        for(int i=0;i<3;i++){
            System.out.print("Enter age of "+names[i]+": ");
            age[i]=sc.nextInt();
        }
        
          //Taking height inputs
        for(int i=0;i<3;i++){
            System.out.print("Enter height of "+names[i]+": ");
            height[i]=sc.nextInt();
        }
        
         int youngestIndex=0;
        int tallestIndex=0;
        
        //finding youngest friend
        for(int i=1;i<3;i++){
            if(age[i]<age[youngestIndex]){
             youngestIndex=i;
            }
        }
        
        //finding tallest friend
        for(int i=1;i<3;i++){
            if(height[i]>height[tallestIndex]){
                tallestIndex=i;
            }
        }
        
        //display result
           System.out.println(names[youngestIndex]+" is the youngest");
           System.out.println(names[tallestIndex]+" is the tallest");
    }
}
