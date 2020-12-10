package com.jtr;

public class fornestdemo1 {

    public  static  void  main (String[] args) {

        int row = 6;
         for(int i = 0; i< row; i++)
         {
            //空白
             for (int j=row; j>i;j--)
             {
                 System.out.print(" ");
             }

             //
             for(int j=0;j<=i;j++)
             {
                 System.out.print("*");
             }

             for(int j=0;j<i;j++)
             {
                 System.out.print("*");
             }

             System.out.println();
         }
    }

}
