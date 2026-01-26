package com.regax.replaceandmodify;
public class SpaceNormalizer {

    public static void main(String[] args) {

        String input = "This   is   an   example    which contain so much spaces .";

        // Replace multiple spaces with single space from the String 
        String output = input.replaceAll("\\s+", " ");

        System.out.println(output);
    }
}