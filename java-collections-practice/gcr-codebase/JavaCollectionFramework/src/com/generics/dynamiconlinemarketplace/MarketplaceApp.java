package com.generics.dynamiconlinemarketplace;
import java.util.Scanner;
// Test class for Dynamic Online Marketplace with user input
public class MarketplaceApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MarketplaceCatalog catalog=new MarketplaceCatalog();
        int choice;
        do{
            System.out.println("\n1.Add Book\n2.Add Clothing\n3.Add Gadget\n4.Apply Discount\n5.Display Catalog\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter book name: ");
                    String bname=sc.nextLine();
                    System.out.print("Enter price: ");
                    double bprice=sc.nextDouble();
                    Product<BookCategory> book=new Product<>(bname,bprice,new BookCategory());
                    catalog.addProduct(book);
                    break;
                case 2:
                    System.out.print("Enter clothing name: ");
                    String cname=sc.nextLine();
                    System.out.print("Enter price: ");
                    double cprice=sc.nextDouble();
                    Product<ClothingCategory> cloth=new Product<>(cname,cprice,new ClothingCategory());
                    catalog.addProduct(cloth);
                    break;
                case 3:
                    System.out.print("Enter gadget name: ");
                    String gname=sc.nextLine();
                    System.out.print("Enter price: ");
                    double gprice=sc.nextDouble();
                    Product<GadgetCategory> gadget=new Product<>(gname,gprice,new GadgetCategory());
                    catalog.addProduct(gadget);
                    break;
                case 4:
                    System.out.print("Discount feature applies to last added product only in demo");
                    System.out.print("\nEnter discount percentage: ");
                    double percent=sc.nextDouble();
                    if(!catalog.isEmpty()){
                        DiscountUtil.applyDiscount(catalog.getLastProduct(),percent);
                    }else{
                        System.out.println("Catalog is empty");
                    }
                    break;
                case 5:
                    System.out.println("--- Marketplace Catalog ---");
                    catalog.displayCatalog();
                    break;
                case 0:
                    System.out.println("Marketplace closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
