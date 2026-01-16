package com.HospitalQueue;
import java.util.Scanner;

// Test class for HospitalQueue system
public class HospitalQueueApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HospitalQueue queue=new HospitalQueue();
        int choice;

        // Menu driven ER system
        do{
            System.out.println("\n1.Add Patient\n2.Display Patients\n3.Sort by Criticality\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter patient name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter criticality (1-10): ");
                    int crit=sc.nextInt();
                    queue.addPatient(name,crit);
                    break;
                case 2:
                    queue.displayPatients();
                    break;
                case 3:
                    queue.sortByCriticality();
                    break;
                case 0:
                    System.out.println("ER system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
