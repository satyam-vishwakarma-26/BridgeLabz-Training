package com.Searching.linearsearch;


import java.util.Scanner;

public class SearchWordInSentences{

    //method to search word in sentences
    public static String searchSentence(String[] sentences,String word){
        for(int i=0;i<sentences.length;i++){
            if(sentences[i].contains(word)){
                return sentences[i];
            }
        }
        return "Not Found";
    }

    //main method
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n=sc.nextInt();
        sc.nextLine();

        String[] sentences=new String[n];

        System.out.println("Enter sentences:");
        for(int i=0;i<n;i++){
            sentences[i]=sc.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word=sc.nextLine();

        String result=searchSentence(sentences,word);

        System.out.println("\nSearch Result:");
        System.out.println(result);
    }
}
