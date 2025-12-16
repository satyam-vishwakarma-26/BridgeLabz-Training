import java.util.Scanner;

public class ConvertKilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kilometer=sc.nextInt();
        double miles=kilometer*0.621371;
        System.out.println("Miles : "+miles);
    }
}
