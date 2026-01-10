package com.BrowserBuddy;
import java.util.Scanner;
public class BrowserBuddyApp{
    public static void main(String[] args){
    	
    	//Creating Scanner class object 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter homepage URL: ");
        String home=sc.nextLine();
        BrowserHistory history=new BrowserHistory(home);
        ClosedTabManager tabManager=new ClosedTabManager();
        int choice;
        do{
            System.out.println("\n1.Visit Page\n2.Back\n3.Forward\n4.Close Tab\n5.Reopen Tab\n6.Current Page\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter URL: ");
                    String url=sc.nextLine();
                    history.visit(url);
                    break;
                case 2:
                    history.back();
                    break;
                case 3:
                    history.forward();
                    break;
                case 4:
                    tabManager.closeTab(history.getCurrentPage());
                    break;
                case 5:
                    String reopened=tabManager.reopenTab();
                    if(reopened!=null){
                        history.visit(reopened);
                    }
                    break;
                case 6:
                    System.out.println("Current Page: "+history.getCurrentPage());
                    break;
                case 0:
                    System.out.println("Browser closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
