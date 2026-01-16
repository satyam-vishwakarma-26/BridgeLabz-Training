package com.ZipZipMart;
import java.util.Scanner;
import java.time.LocalDate;
public class ZipZipMartApp{
    public static void main(String[] args){
    	
    	//Created Scanner class object 
        Scanner sc=new Scanner(System.in);
        ZipZipMartReport report=new ZipZipMartReport();
        int choice;
        do{
            System.out.println("\n1.Add Sale\n2.Display Sales\n3.Sort Sales\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    LocalDate date=LocalDate.parse(sc.nextLine());
                    System.out.print("Enter amount: ");
                    double amount=sc.nextDouble();
                    report.addRecord(date,amount);
                    break;
                case 2:
                    report.displayRecords();
                    break;
                case 3:
                    report.sortRecords();
                    break;
                case 0:
                    System.out.println("System closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
