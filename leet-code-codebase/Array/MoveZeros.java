import java.util.Scanner;
public class MoveZeros{
   
   //move all zeroes to end
    public static void moveZeroes(int[] nums){
        int n=nums.length;
        int index=0;
       
	   //move non-zero elements forward
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
       
	   //fill remaining with zeroes
        while(index<n){
            nums[index++]=0;
        }
    }
    public static void main(String[] args){
	
		//Creating the scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println("Array after moving zeroes:");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
