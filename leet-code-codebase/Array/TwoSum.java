import java.util.Scanner;
import java.util.HashMap;
public class TwoSum{

    //find two sum indices by Method 
    public static int[] twoSum(int[] nums,int target){
	
        HashMap<Integer,Integer> map=new HashMap<>();
		
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
	
    public static void main(String[] args){
	
		//Creating scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
		
		//Taking target value 
        System.out.print("Enter target value: ");
        int target=sc.nextInt();
        int[] result=twoSum(nums,target);
		
		//Printing the result 
        if(result.length==2){
            System.out.println("Indices: "+result[0]+" "+result[1]);
        }else{
            System.out.println("No valid pair found");
        }
    }
}
