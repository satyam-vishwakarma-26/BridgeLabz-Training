package com.GeoMeasure;
// Utility class for comparing two lines
public class LineComparator{
    // Compare two line lengths
    public static void compare(Line l1,Line l2){
        double len1=l1.calculateLength();
        double len2=l2.calculateLength();
        System.out.println("Line 1 Length: "+len1);
        System.out.println("Line 2 Length: "+len2);
        if(len1==len2){
            System.out.println("Both lines are equal in length");
        }else if(len1>len2){
            System.out.println("Line 1 is longer");
        }else{
            System.out.println("Line 2 is longer");
        }
    }
}
