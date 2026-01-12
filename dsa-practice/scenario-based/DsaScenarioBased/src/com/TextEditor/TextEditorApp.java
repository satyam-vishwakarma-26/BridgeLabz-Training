package com.TextEditor;
import java.util.Scanner;

// Test class for text editor
public class TextEditorApp{
    public static void main(String[] args){
        //Creating Scanner class object 
    	Scanner sc=new Scanner(System.in);
        TextEditor editor=new TextEditor();
        int choice;

        // Menu driven text editor
        do{
            System.out.println("\n1.Insert Text\n2.Delete Text\n3.Undo\n4.Redo\n5.Show Content\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter text to insert: ");
                    String text=sc.nextLine();
                    editor.insert(text);
                    break;
                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int len=sc.nextInt();
                    editor.delete(len);
                    break;
                case 3:
                    editor.undo();
                    break;
                case 4:
                    editor.redo();
                    break;
                case 5:
                    editor.showContent();
                    break;
                case 0:
                    System.out.println("Editor closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
