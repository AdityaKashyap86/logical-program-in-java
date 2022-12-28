package com.sunglowsys.extraJava;

public class MaxSecodAr {
    public static void main(String[] args) {

        MaxSecodAr maxSecodAr = new MaxSecodAr();
        int a[] ={28,342,234,2344,2};
        int b[] = {2, 3, 4, 5, 6};
        System.out.println(maxSecodAr.secondLarge(a,5));
        System.out.println(maxSecodAr.secondLarge(b,5));
    }
    public int secondLarge (int arr[], int total) {
        int max;
        for (int i=0; i< total; i++) {
            for (int j=i + 1; j<total; j++) {
                if (arr[i]>arr[j]) {
                    max= arr[i];
                    arr[i]=arr[j];
                    arr[j]= max;
                }
            }
        }
        return arr[total-2];
    }
}

