import java.util.Scanner;

public class VolumeOfACylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        int height=sc.nextInt();
        double volume= Math.PI*radius*radius*height;
        System.out.println("Volume of a cylinder is : "+volume);
    }
}
