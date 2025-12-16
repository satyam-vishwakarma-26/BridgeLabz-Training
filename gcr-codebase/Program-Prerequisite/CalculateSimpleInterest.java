import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      int principal=sc.nextInt();
      int rate=sc.nextInt();
      int time=sc.nextInt();

      int simpleInterest=(principal*rate*time)/100;

      System.out.println("simple interest is: "+simpleInterest);
    }
}
