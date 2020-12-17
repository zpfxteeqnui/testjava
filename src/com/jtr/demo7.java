package com.jtr;

public class demo7 {

    public  static  void  main (String[] args) {
    int[] arr = {12, 33, 23, 2, 45, 31, 66, 77};

    int max = arr[0];
    int min = arr[0];
    int temp=0;

    for(int i=1;i<arr.length;i++)
    {
        temp=arr[i];
        if(max < temp)
        {
            max=temp;
        }
    }

        System.out.println("最大的："+max);

    for (int i=1;i<arr.length;i++)
    {
        temp=arr[i];

        if(min>temp)
        {
            min=temp;
        }
    }

        System.out.println("最小值："+min);
}
}
