package com.addressbooksystem;
import java.util.Scanner;

// Test class for Address Book System
public class AddressBookApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AddressBook book=new AddressBook();
        int choice;

        // Menu driven address book system
        do{
            System.out.println("\n1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Search by City/State\n5.Display All Contacts\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("First name: ");
                    String fn=sc.nextLine();
                    System.out.print("Last name: ");
                    String ln=sc.nextLine();
                    System.out.print("Phone: ");
                    String phone=sc.nextLine();
                    System.out.print("Email: ");
                    String email=sc.nextLine();
                    System.out.print("City: ");
                    String city=sc.nextLine();
                    System.out.print("State: ");
                    String state=sc.nextLine();
                    System.out.print("Zip: ");
                    String zip=sc.nextLine();
                    book.addContact(new Contact(fn,ln,phone,email,new Address(city,state,zip)));
                    break;
                case 2:
                    System.out.print("First name: ");
                    String efn=sc.nextLine();
                    System.out.print("Last name: ");
                    String eln=sc.nextLine();
                    System.out.print("New phone: ");
                    String nphone=sc.nextLine();
                    System.out.print("New email: ");
                    String nemail=sc.nextLine();
                    System.out.print("City: ");
                    String ncity=sc.nextLine();
                    System.out.print("State: ");
                    String nstate=sc.nextLine();
                    System.out.print("Zip: ");
                    String nzip=sc.nextLine();
                    book.editContact(efn,eln,nphone,nemail,new Address(ncity,nstate,nzip));
                    break;
                case 3:
                    System.out.print("First name: ");
                    String dfn=sc.nextLine();
                    System.out.print("Last name: ");
                    String dln=sc.nextLine();
                    book.deleteContact(dfn,dln);
                    break;
                case 4:
                    System.out.print("Enter city or state: ");
                    book.searchByCityOrState(sc.nextLine());
                    break;
                case 5:
                    book.displayAll();
                    break;
                case 0:
                    System.out.println("Address book closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
