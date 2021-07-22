package com.ROUND2;
import java.util.Scanner;
public class Snake
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=1;
        int a[][]=new int[n][n];
        /*
        intput:
             5

        output:
          5 6 15 16 25
          4 7 14 17 24
          3 8 13 18 23
          2 9 12 19 22
          1 10 11 20 21
         */

        for(int col=0;col<n;col++)
        {
            if(col%2==0)
            {
                for(int row=n-1;row>=0;row--)
                {
                    a[row][col]=count++;
                }
            }
            else
            {
                for(int row=0;row<n;row++)
                {
                    a[row][col]=count++;
                }
            }
        }
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print(a[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
