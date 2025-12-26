import java.util.Scanner;
public class Rotate{
    
	//rotate array by k steps
    public static void rotate(int[] arr,int k){
        if(arr==null||arr.length==0){
            return;
        }
        int n=arr.length;
        int[] brr=new int[n];
        int j=0;
        
		//normalize k
        k=k%n;
        if(k<0){
            k+=n;
        }
       
	   //copy last k elements
        for(int i=n-k;i<n;i++){
            brr[j++]=arr[i];
        }
        
		//copy remaining elements
        for(int i=0;i<n-k;i++){
            brr[j++]=arr[i];
        }
        
		//copy back to original array
        for(int i=0;i<n;i++){
            arr[i]=brr[i];
        }
    }
   
   public static void main(String[] args){
        
		//Creating the scanner class, object and taking user inputs 
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter rotation value k: ");
        int k=sc.nextInt();
        rotate(arr,k);
        System.out.println("Array after rotation:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
