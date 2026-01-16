package com.CropMonitor;
import java.util.Scanner;
// Test class for CropMonitor system
public class CropMonitorApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CropMonitorManager manager=new CropMonitorManager();
        int choice;
        // Menu driven crop monitoring system
        do{
            System.out.println("\n1.Add Sensor Data\n2.Display Data\n3.Sort by Timestamp\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter timestamp: ");
                    long ts=sc.nextLong();
                    System.out.print("Enter temperature: ");
                    double temp=sc.nextDouble();
                    manager.addData(ts,temp);
                    break;
                case 2:
                    manager.displayData();
                    break;
                case 3:
                    manager.sortByTimestamp();
                    break;
                case 0:
                    System.out.println("Crop monitoring stopped");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
