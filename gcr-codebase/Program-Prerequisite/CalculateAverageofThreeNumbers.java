import java.util.Scanner;

public class CalculateAverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double avg=(a+b+c)/3;

        System.out.println("Average of 3 number is: "+avg);
    }
}
