import java.util.Scanner;
public class CoffeeCounter{

    //get price based on coffee type
    public static double getPrice(String coffee){
        switch(coffee){
		
            case "espresso": return 120;
            case "latte": return 150;
            case "cappuccino": return 140;
            case "americano": return 130;
            default: return -1;
        }
    }
    //calculate bill with GST
    public static double calculateBill(double price,int qty){
        double total=price*qty;
        double gst=total*0.05; 
        return total+gst;
    }
    public static void main(String[] args){
	
		//Creating Scanner class and object 
        Scanner sc=new Scanner(System.in);
		
		//Calculating price and pringting the total amount 
        while(true){
            System.out.print("Enter coffee type (espresso/latte/cappuccino/americano) or exit: ");
            String coffee=sc.nextLine().toLowerCase();
            if(coffee.equals("exit")){
                System.out.println("Cafe closed. Thank you!");
                break;
            }
            double price=getPrice(coffee);
            if(price==-1){
                System.out.println("Invalid coffee type");
                continue;
            }
            System.out.print("Enter quantity: ");
            int qty=Integer.parseInt(sc.nextLine());
            double bill=calculateBill(price,qty);
            System.out.println("Total Bill (with GST): "+bill);
        }
    }
}
