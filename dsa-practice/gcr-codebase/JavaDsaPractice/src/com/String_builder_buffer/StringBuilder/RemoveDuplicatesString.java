package com.String_builder_buffer.StringBuilder;


import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesString{

    //method to remove duplicates
    public static String removeDuplicates(String str){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();

        //iterate through string
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    //main method
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input=sc.nextLine();

        String result=removeDuplicates(input);

        System.out.println("String after removing duplicates:");
        System.out.println(result);
    }
}
