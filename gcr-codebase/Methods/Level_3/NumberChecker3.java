public class NumberChecker3{
    public static int[] reverseDigits(int digits[]){
        int rev[]=new int[digits.length];
        for(int i=0;i<digits.length;i++){
            rev[i]=digits[digits.length-1-i];
        }
        return rev;
    }
    
    public static boolean compareArrays(int a[],int b[]){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(int digits[]){
        return compareArrays(digits,reverseDigits(digits));
    }
    
    public static boolean isDuckNumber(int digits[]){
        for(int d:digits){
            if(d==0){
                return true;
            }
        }
        return false;
    }
}
