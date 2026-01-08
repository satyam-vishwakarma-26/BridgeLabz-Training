package com.MediStore;
import java.time.LocalDate;
import java.util.*;

public class MediStoreApp{
	//Created Scanner object for taking user inputs 
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Medicine> store=new ArrayList<>();

    public static void main(String[] args){
        while(true){
            System.out.println("\n1.Admin  2.User  3.Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:adminMenu();break;
                case 2:userMenu();break;
                case 3:System.exit(0);
                default:System.out.println("Invalid choice");
            }
        }
    }

    //ADMIN MENU
    static void adminMenu(){
        System.out.println("\n1.Add Medicine 2.Update Stock 3.Update Price 4.View");
        int ch=sc.nextInt();
        switch(ch){
            case 1:addMedicine();break;
            case 2:updateStock();break;
            case 3:updatePrice();break;
            case 4:viewMedicines();break;
        }
    }

    //USER MENU
    static void userMenu(){
        viewMedicines();
        System.out.print("Select medicine index: ");
        int i=sc.nextInt();
        System.out.print("Enter quantity: ");
        int q=sc.nextInt();
        store.get(i).sell(q);
    }

    static void addMedicine(){
        System.out.print("1.Tablet 2.Syrup 3.Injection: ");
        int t=sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String n=sc.nextLine();
        System.out.print("Price: ");
        double p=sc.nextDouble();
        System.out.print("Qty: ");
        int q=sc.nextInt();
        System.out.print("Expiry(YYYY-MM-DD): ");
        LocalDate d=LocalDate.parse(sc.next());
        Medicine m=null;
        if(t==1)m=new Tablet(n,p,d,q);
        else if(t==2)m=new Syrup(n,p,d,q);
        else m=new Injection(n,p,d,q);
        store.add(m);
        System.out.println("✔ Medicine added");
    }

    static void updateStock(){
        viewMedicines();
        System.out.print("Index: ");
        int i=sc.nextInt();
        System.out.print("Add qty: ");
        store.get(i).addStock(sc.nextInt());
    }

    static void updatePrice(){
        viewMedicines();
        System.out.print("Index: ");
        int i=sc.nextInt();
        System.out.print("New price: ");
        store.get(i).updatePrice(sc.nextDouble());
    }

    static void viewMedicines(){
        System.out.println("\n--- Inventory ---");
        for(int i=0;i<store.size();i++){
            System.out.print(i+". ");
            store.get(i).display();
        }
    }
}
