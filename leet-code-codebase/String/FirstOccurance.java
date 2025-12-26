import java.util.Scanner;
public class FirstOccurance{

    //find first occurrence of substring
    public static int strStr(String haystack,String needle){
        int index=haystack.indexOf(needle);
        if(index!=-1){
            return index;
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
	
		//Creating Scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter main string: ");
        String haystack=sc.nextLine();
        System.out.print("Enter substring to search: ");
        String needle=sc.nextLine();
        int result=strStr(haystack,needle);
        System.out.println("Index: "+result);
    }
}
