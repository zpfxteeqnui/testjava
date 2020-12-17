package com.jtr;

public class demo8 {

    public static void main(String[] args) {
        int[] arr = {10, 20,30, 40,50};

        for (int min=0, max=arr.length-1;min<max;min++,max--)
        {
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }

        for (int ar : arr)
        {
            System.out.println(ar);
        }
    }
}
