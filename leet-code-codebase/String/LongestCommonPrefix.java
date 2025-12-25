import java.util.Scanner;
import java.util.Arrays;
public class LongestCommonPrefix{

    //find longest common prefix
    public static String longestCommonPrefix(String[] strs){
        if(strs==null||strs.length==0){
            return "";
        }
		
		//Array sort using sort method 
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
		
		//Storing string builder results 
        StringBuilder result=new StringBuilder();
        for(int i=0;i<first.length;i++){
            if(i>=last.length||first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
	
    public static void main(String[] args){
	
		//Creating Scanner class, object and taking user inputs
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] strs=new String[n];
        System.out.println("Enter strings:");
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }
        String prefix=longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: "+prefix);
    }
}
