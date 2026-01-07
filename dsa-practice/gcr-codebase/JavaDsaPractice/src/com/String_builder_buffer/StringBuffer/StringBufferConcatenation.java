package com.String_builder_buffer.StringBuffer;


import java.util.Scanner;

public class StringBufferConcatenation{

    //method to concatenate strings
    public static String concatenateStrings(String[] arr){
        StringBuffer sb=new StringBuffer();

        //append each string
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    //main method
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n=sc.nextInt();
        sc.nextLine();

        String[] arr=new String[n];

        System.out.println("Enter strings:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }

        String result=concatenateStrings(arr);

        System.out.println("\nConcatenated String:");
        System.out.println(result);
    }
}
