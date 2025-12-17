import java.util.Scanner;
public class StudentFee{
 public static void main(String [] args){
 
//Scanner class for user inputs
 Scanner inputs=new Scanner (System.in);
// Student Fee
System.out.print("Enter Student fee: ");
 double fee=inputs.nextDouble();
//DiscountPercent 
System.out.print("Enter Fee Discount Percent: ");
 double DiscountPercent=inputs.nextDouble();


// Discount Computation
  double Discount=(fee*DiscountPercent)/100;
//Remaining fee that needs to be paid
 double Remaining_Fee=fee-Discount;

//Printing Discount and Remaining fees
 System.out.println("The discount amount is INR: " +Discount+ ",  and final discounted fee is INR: "+Remaining_Fee);


  }
}