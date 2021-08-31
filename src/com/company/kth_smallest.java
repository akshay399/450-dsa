package com.company;

import java.util.Arrays;

public class kth_smallest {
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
