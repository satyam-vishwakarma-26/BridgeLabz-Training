import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class IntersectionII{
    
	//find intersection with frequency
    public static int[] intersect(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> map=new HashMap<>();
       
	   //count elements of first array
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       
	   List<Integer> result=new ArrayList<>();
        
		//check elements in second array
        for(int num:nums2){
            if(map.containsKey(num)&&map.get(num)>0){
                result.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        //convert list to array
        int[] resArray=new int[result.size()];
        for(int i=0;i<result.size();i++){
            resArray[i]=result.get(i);
        }
        return resArray;
    }
    public static void main(String[] args){
	
		//Creating Scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1=sc.nextInt();
        int[] nums1=new int[n1];
        System.out.println("Enter first array elements:");
        for(int i=0;i<n1;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int n2=sc.nextInt();
        int[] nums2=new int[n2];
        System.out.println("Enter second array elements:");
        for(int i=0;i<n2;i++){
            nums2[i]=sc.nextInt();
        }
        int[] res=intersect(nums1,nums2);
        System.out.println("Intersection with frequency:");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
