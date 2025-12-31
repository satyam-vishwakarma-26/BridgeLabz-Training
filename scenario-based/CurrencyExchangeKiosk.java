import java.util.Scanner;
public class CurrencyExchangeKiosk{

    //convert INR to target currency
    public static double convertCurrency(double inr,String currency){
        switch(currency){
            case "usd": return inr*0.012;   // INR to US Dollar
            case "eur": return inr*0.011;   // INR to Euro
            case "gbp": return inr*0.0095;  // INR to British Pound
            case "jpy": return inr*1.80;    // INR to Japanese Yen
            default: return -1;
        }
    }

    public static void main(String[] args){

		//Creating Scanner class object 
        Scanner sc=new Scanner(System.in);
        char choice;

        do{
            System.out.print("Enter amount in INR: ");
            double inr=sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter target currency (usd/eur/gbp/jpy): ");
            String currency=sc.nextLine().toLowerCase();

            double result=convertCurrency(inr,currency);

            if(result==-1){
                System.out.println("Invalid currency selected");
            }else{
                System.out.println("Converted Amount: "+result+" "+currency.toUpperCase());
            }

            System.out.print("Do you want another conversion? (y/n): ");
            choice=sc.next().charAt(0);
            sc.nextLine();

        }while(choice=='y'||choice=='Y');

        System.out.println("Thank you for using Currency Exchange Kiosk");
    }
}