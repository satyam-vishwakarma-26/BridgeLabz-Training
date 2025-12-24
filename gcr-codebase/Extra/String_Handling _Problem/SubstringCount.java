import java.util.Scanner;
public class SubstringCount{
    public static void main(String[] args){
        //Creating scanner class and taking user inputs   	
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str=sc.nextLine();
        System.out.print("Enter substring: ");
        String sub=sc.nextLine();
		
        int count=0;
        //count substring occurrences
        for(int i=0;i<=str.length()-sub.length();i++){
            if(str.substring(i,i+sub.length()).equals(sub)){
                count++;
            }
        }
        System.out.println("Substring occurs "+count+" times");
    }
}
