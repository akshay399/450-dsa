package com.company;

import java.util.Scanner;

public class move_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        moveNegative(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    static int[] moveNegative(int arr[]) {
        int j = 0;
        int temp;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                if(i!=j){
                    temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}
