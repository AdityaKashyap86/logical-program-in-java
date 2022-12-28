package com.sunglowsys.extraJava;

public class RevString {
    public static void main(String[] args) {
        RevString string = new RevString();
        System.out.println(string.reverseString("hello hello"));
    }


    public String reverseString(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i=str.length()-1; i>=0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}
