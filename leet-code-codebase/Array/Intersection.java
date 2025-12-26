import java.util.Scanner;
import java.util.HashSet;
public class Intersection{
   
   //find intersection of two arrays
    public static int[] intersection(int[] nums1,int[] nums2){
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        
		//add elements of first array
        for(int num:nums1){
            hs.add(num);
        }
       
	   //check intersection
        for(int num:nums2){
            if(hs.contains(num)){
                result.add(num);
                hs.remove(num);
            }
        }
       
	   //convert set to array
        int[] res=new int[result.size()];
        int i=0;
        for(int num:result){
            res[i++]=num;
        }
        return res;
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
        int[] res=intersection(nums1,nums2);
        System.out.println("Intersection of arrays:");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
