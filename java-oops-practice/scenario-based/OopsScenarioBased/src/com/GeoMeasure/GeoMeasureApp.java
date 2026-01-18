package com.GeoMeasure;
import java.util.*;
// Test class for GeoMeasure Solutions
public class GeoMeasureApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Line[]> comparisons=new ArrayList<>();
        int choice;
        // Menu driven blueprint comparison system
        do{
            System.out.println("\n1.Compare Two Lines\n2.Show Total Comparisons\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
                    Line l1=new Line(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
                    System.out.print("Enter x1 y1 x2 y2 for Line 2: ");
                    Line l2=new Line(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
                    LineComparator.compare(l1,l2);
                    comparisons.add(new Line[]{l1,l2});
                    break;
                case 2:
                    System.out.println("Total comparisons done: "+comparisons.size());
                    break;
                case 0:
                    System.out.println("GeoMeasure system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
