import java.util.Scanner;
public class YoungestAndTallest{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking age inputs
        System.out.print("Enter Amar age: ");
        int amarAge=sc.nextInt();
        System.out.print("Enter Akbar age: ");
        int akbarAge=sc.nextInt();
        System.out.print("Enter Anthony age: ");
        int anthonyAge=sc.nextInt();
        
        //Taking height inputs
        System.out.print("Enter Amar height: ");
        int amarHeight=sc.nextInt();
        System.out.print("Enter Akbar height: ");
        int akbarHeight=sc.nextInt();
        System.out.print("Enter Anthony height: ");
        int anthonyHeight=sc.nextInt();
        
        //finding youngest friend
        if(amarAge<akbarAge&&amarAge<anthonyAge){
            System.out.println("Amar is the youngest");
        }else if(akbarAge<amarAge&&akbarAge<anthonyAge){
            System.out.println("Akbar is the youngest");
        }else{
            System.out.println("Anthony is the youngest");
        }
        
        //finding tallest friend
        if(amarHeight>akbarHeight&&amarHeight>anthonyHeight){
            System.out.println("Amar is the tallest");
        }else if(akbarHeight>amarHeight&&akbarHeight>anthonyHeight){
            System.out.println("Akbar is the tallest");
        }else{
            System.out.println("Anthony is the tallest");
        }
    }
}
