import java.util.Scanner;
public class LibraryFineCalculator{

    //calculate fine
    public static int calculateFine(int dueDate,int returnDate){
        if(returnDate>dueDate){
            int lateDays=returnDate-dueDate;
            return lateDays*5;
        }
        return 0;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int totalFine=0;

        //loop for 5 books
        for(int i=1;i<=5;i++){
            System.out.println("\nBook "+i);
            System.out.print("Enter due date (day number): ");
            int dueDate=sc.nextInt();
            System.out.print("Enter return date (day number): ");
            int returnDate=sc.nextInt();

            int fine=calculateFine(dueDate,returnDate);
            totalFine=totalFine+fine;

            if(fine>0){
                System.out.println("Late return! Fine: ₹"+fine);
            }else{
                System.out.println("Returned on time. No fine.");
            }
        }

        System.out.println("\nTotal Fine for all books: ₹"+totalFine);
    }
}