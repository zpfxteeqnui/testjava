package com.jtr;

public class fornestdemo {

    public  static  void  main (String[] args) {

        int row=6;
        int cloumn=0;

        for(int i=1;i<row;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.print("\n");

        for (int i = 0;i<row; i++)
        {
            for(int j=row;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
