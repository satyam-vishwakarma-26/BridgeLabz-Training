package com.BookBazaar;
import java.util.Scanner;

public class BookBazaarApp{
    public static void main(String[] args){

    	//Creating the scanner object 
        Scanner sc=new Scanner(System.in);
        BookStore store=new BookStore();

        while(true){
            System.out.println("\n--- Welcome to BookBazaar ---");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.print("Choose role: ");
            int role=sc.nextInt();

            if(role==1){
                //ADMIN
                System.out.println("\n--- Admin Panel ---");
                System.out.println("1. Add Book");
                System.out.println("2. View Books");
                int choice=sc.nextInt();
                sc.nextLine();

                if(choice==1){
                    System.out.print("Enter title: ");
                    String title=sc.nextLine();

                    System.out.print("Enter author: ");
                    String author=sc.nextLine();

                    System.out.print("Enter price: ");
                    double price=sc.nextDouble();

                    System.out.print("Enter stock: ");
                    int stock=sc.nextInt();

                    System.out.print("Enter discount %: ");
                    double discount=sc.nextDouble();

                    System.out.println("1. EBook\n2. PrintedBook");
                    int type=sc.nextInt();

                    Book book;
                    if(type==1){
                        book=new EBook(title,author,price,stock,discount);
                    }else{
                        book=new PrintedBook(title,author,price,stock,discount);
                    }
                    store.addBook(book);
                }else{
                    store.showBooks();
                }
            }

            else if(role==2){
                //USER
                sc.nextLine();
                System.out.print("Enter your name: ");
                String name=sc.nextLine();

                Order order=new Order(name);

                store.showBooks();

                System.out.print("\nEnter Book ID to buy: ");
                int id=sc.nextInt();

                System.out.print("Enter quantity: ");
                int qty=sc.nextInt();

                Book book=store.getBook(id);
                if(book!=null){
                    order.placeOrder(book,qty);
                    order.showOrder();
                }else{
                    System.out.println("Invalid Book ID");
                }
            }

            else{
                System.out.println("Thank you for using BookBazaar 📚");
                break;
            }
        }
    }
}
