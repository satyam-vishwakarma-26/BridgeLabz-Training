import java.util.Scanner;
public class LexicographicalCompare{
    public static void main(String[] args){
	
        //Creating Scanner class and taking user inputs 		
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1=sc.nextLine();
        System.out.print("Enter second string: ");
        String s2=sc.nextLine();
        int i=0;
        boolean isCompared=false;
		
        //compare character by character
        while(i<s1.length()&&i<s2.length()){
		
            if(s1.charAt(i)<s2.charAt(i)){
                System.out.println("\""+s1+"\" comes before \""+s2+"\" in lexicographical order");
                isCompared=true;
                break;
            }else if(s1.charAt(i)>s2.charAt(i)){
                System.out.println("\""+s2+"\" comes before \""+s1+"\" in lexicographical order");
                isCompared=true;
                break;
            }
            i++;
        }
		
        //if all characters same till one string ends
        if(!isCompared){
		
            if(s1.length()<s2.length()){
                System.out.println("\""+s1+"\" comes before \""+s2+"\" in lexicographical order");
            }else if(s1.length()>s2.length()){
                System.out.println("\""+s2+"\" comes before \""+s1+"\" in lexicographical order");
            }else{
                System.out.println("Both strings are equal");
            }
        }
    }
}
