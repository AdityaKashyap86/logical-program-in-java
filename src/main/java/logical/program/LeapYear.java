package com.sunglowsys.extraJava;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 4 == 0) {
            System.out.println("leap Year");
        }
        else {
            System.out.println("Common Year");
        }
    }
}
