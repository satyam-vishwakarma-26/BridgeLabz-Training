import java.util.Scanner;
public class ToggleCase{
    public static void main(String[] args){
	    
		//creating scanner class and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String result="";
		
        //toggle case of characters
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                result=result+(char)(ch+32);
            }else if(ch>='a'&&ch<='z'){
                result=result+(char)(ch-32);
            }else{
                result=result+ch;
            }
        }
        System.out.println("Toggled string: "+result);
    }
}
