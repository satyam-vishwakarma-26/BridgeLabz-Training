import java.util.Scanner;
public class ArrayIndexOutOfBoundsException{

    //method to generate Exception
    public static void generateException(String names[]){
        //accessing index beyond array length
        System.out.println(names[names.length]);
    }
    
    //method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String names[]){
        try{
            System.out.println(names[names.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled: Index is out of range");
        }catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n=sc.nextInt();
        
        String names[]=new String[n];
        
        System.out.println("Enter names:");
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        
        //calling method to generate exception
        try{
            generateException(names);
        }catch(Exception e){
            System.out.println("Exception occurred while generating ArrayIndexOutOfBoundsException");
        }
        
        //calling method to handle exception
        handleException(names);
    }
}
