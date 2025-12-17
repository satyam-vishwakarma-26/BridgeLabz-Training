public class FindDiscount{
 public static void main(String [] args){
 
// Student Fee
 double fee=125000;
//DiscountPercent 
 double DiscountPercent=10;


// Discount Computation
  double Discount=(fee*DiscountPercent)/100;
//Remaining fee that needs to be paid
 double Remaining_Fee=fee-Discount;

//Printing Pen distribution 
 System.out.println("The discount amount is INR: " +Discount+ ",  and final discounted fee is INR: "+Remaining_Fee);


  }
}