public class RandomNumbers{

    //method to generate 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size){
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*9000)+1000;
        }
        return arr;
    }
    
    //method to find average, min and max
    public static double[] findAverageMinMax(int numbers[]){
        int min=numbers[0];
        int max=numbers[0];
        int sum=0;
        
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
            min=Math.min(min,numbers[i]);
            max=Math.max(max,numbers[i]);
        }
        
        double average=(double)sum/numbers.length;
        return new double[]{average,min,max};
    }

    public static void main(String[]args){
        
        int numbers[]=generate4DigitRandomArray(5);
        
        System.out.print("Random Numbers: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        
        double result[]=findAverageMinMax(numbers);
        
        //display result
        System.out.println("Average: "+result[0]);
        System.out.println("Minimum: "+result[1]);
        System.out.println("Maximum: "+result[2]);
    }
}
