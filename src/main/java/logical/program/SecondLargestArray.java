package com.sunglowsys.extraJava;

import java.util.Arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int [] a ={23,123,12,321};
        int size = a.length;
        Arrays.sort(a);
      //  System.out.println(Arrays.toString(a));
        int res = a[size-2];
        System.out.println("second largest element is:"+ res);
    }
}
