import java.util.Scanner;
public class FestivalLuckyDraw{

    //check winning condition
    public static boolean isWinner(int number){
        if(number%3==0 && number%5==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.print("Enter a number (or -1 to exit): ");
            int num=sc.nextInt();

            if(num==-1){
                System.out.println("Lucky Draw Closed. Happy Diwali!");
                break;
            }

            if(num<=0){
                System.out.println("Invalid number. Try again.");
                continue;
            }

            if(isWinner(num)){
                System.out.println("Congratulations! You won a gift!");
            }else{
                System.out.println("Better luck next time!");
            }
        }
    }
}
