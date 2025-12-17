public class ProfitCalculation{
 public static void main(String [] args){
 
// Cost Price
 double Cost_Price=129;
//Selling Price
 double Selling_Price=191;


// Profit Calculation
 double Profit=Selling_Price-Cost_Price;
//profit percentage calculation
 double Profit_Percentage= Profit/Cost_Price*100;

//Printing Profit and Profit Percentage 
 System.out.println("The Cost Price is INR " +Cost_Price+ ", and Selling Price is INR "+Selling_Price);
System.out.println("The Profit is INR " +Profit+ ", and the Profit Percentage is "+Profit_Percentage);


}
}