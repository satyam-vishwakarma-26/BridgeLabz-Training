import java.util.Scanner;
public class CollinearPoints{

    //method to check collinearity using slope formula
    public static boolean isCollinearBySlope(int x1,int y1,int x2,int y2,int x3,int y3){
        //using cross multiplication to avoid division
        return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1)
            &&(y3-y1)*(x2-x1)==(y2-y1)*(x3-x1);
    }
    
    //method to check collinearity using area of triangle formula
    public static boolean isCollinearByArea(int x1,int y1,int x2,int y2,int x3,int y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs
        System.out.print("Enter x1 y1: ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        
        System.out.print("Enter x2 y2: ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        
        System.out.print("Enter x3 y3: ");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        
        //checking collinearity using slope method
        if(isCollinearBySlope(x1,y1,x2,y2,x3,y3)){
            System.out.println("Points are collinear using slope formula");
        }else{
            System.out.println("Points are not collinear using slope formula");
        }
        
        //checking collinearity using area method
        if(isCollinearByArea(x1,y1,x2,y2,x3,y3)){
            System.out.println("Points are collinear using area of triangle formula");
        }else{
            System.out.println("Points are not collinear using area of triangle formula");
        }
    }
}
