import java.util.Scanner;
public class RemoveDuplicates{

    //Method for removing duplicates
    public static int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
	
    public static void main(String[] args){
	
		//Creating Scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
		
        int[] nums=new int[n];
        System.out.println("Enter sorted array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
		
		//printing array after removing duplicates
        int newLength=removeDuplicates(nums);
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<newLength;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
