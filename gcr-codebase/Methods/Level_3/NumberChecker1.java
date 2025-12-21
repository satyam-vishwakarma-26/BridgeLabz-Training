public class NumberChecker1{
    public static int countDigits(int number){
        int count=0;
        while(number!=0){
            number/=10;
            count++;
        }
        return count;
    }
    
    public static int[] storeDigits(int number){
        int count=countDigits(number);
        int digits[]=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=number%10;
            number/=10;
        }
        return digits;
    }
    
    public static boolean isDuckNumber(int digits[]){
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isArmstrong(int number,int digits[]){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum+=Math.pow(digits[i],digits.length);
        }
        return sum==number;
    }
    
    public static int[] largestSecondLargest(int digits[]){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int d:digits){
            if(d>largest){
                second=largest;
                largest=d;
            }else if(d>second&&d!=largest){
                second=d;
            }
        }
        return new int[]{largest,second};
    }
    
    public static int[] smallestSecondSmallest(int digits[]){
        int smallest=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int d:digits){
            if(d<smallest){
                second=smallest;
                smallest=d;
            }else if(d<second&&d!=smallest){
                second=d;
            }
        }
        return new int[]{smallest,second};
    }
}
