package com.BirdSanctuary;
import java.util.Scanner;
// CLI application for EcoWing Sanctuary
public class EcoWingApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BirdSanctuary sanctuary=new BirdSanctuary();
        int choice;
       
        // Show annotation info using reflection
        ReflectionUtil.showDeveloperInfo(Bird.class);
        // Menu driven system
        do{
            System.out.println("\n1.Add Bird\n2.Display All Birds\n3.Display Flying Birds\n4.Display Swimming Birds\n5.Display Both\n6.Delete Bird by ID\n7.Sanctuary Report\n8.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    String id=sc.nextLine();
                    System.out.print("Enter name: ");
                    String name=sc.nextLine();
                    System.out.print("Type (Eagle/Duck/Penguin/Kiwi): ");
                    String type=sc.nextLine();
                    if(type.equalsIgnoreCase("Eagle"))sanctuary.addBird(new Eagle(id,name));
                    else if(type.equalsIgnoreCase("Duck"))sanctuary.addBird(new Duck(id,name));
                    else if(type.equalsIgnoreCase("Penguin"))sanctuary.addBird(new Penguin(id,name));
                    else if(type.equalsIgnoreCase("Kiwi"))sanctuary.addBird(new Kiwi(id,name));
                    else System.out.println("Invalid bird type");
                    break;
                case 2:
                    sanctuary.displayAll();
                    break;
                case 3:
                    sanctuary.displayFlying();
                    break;
                case 4:
                    sanctuary.displaySwimming();
                    break;
                case 5:
                    sanctuary.displayBoth();
                    break;
                case 6:
                    System.out.print("Enter ID to delete: ");
                    sanctuary.removeById(sc.nextLine());
                    break;
                case 7:
                    sanctuary.report();
                    break;
                case 8:
                    System.out.println("Goodbye from EcoWing");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=8);
        sc.close();
    }
}
