package com.company;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("max is: "+ findMax(a)+" min is: "+ findMin(a));
    }
    static int findMax(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max) max = a[i];

        }
        return max;
    }
    static int findMin(int[] a){
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min) min = a[i];

        }
        return min;
    }
}
