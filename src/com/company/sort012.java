package com.company;

public class sort012 {
    public static void sort012(int a[], int n)
    {
        int c0=0, c1=0, c2=0;
        for(int i: a){
            if(i==0) c0++;
            if(i==1) c1++;
            if(i==2) c2++;
        }
        int i=0;
        while(c0>0){
            a[i] = 0;
            i++;
            c0--;
        }
        while(c1>0){
            a[i] =1;
            i++;
            c1--;
        }
        while(c2>0){
            a[i] = 2;
            i++;
            c2--;
        }
    }
}
