package com.sunglowsys.extraJava;

public class MinArray {
    public static void main(String[] args) {
        int[] a = {8,9,7,2};
        int min = a[0];
        for (int i=1; i<a.length; i++) {
            if (min>a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
