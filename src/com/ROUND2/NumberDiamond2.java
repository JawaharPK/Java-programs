package com.ROUND2;
import java.util.*;
public class NumberDiamond2 {
    /*

   1
  3 2
 6 5 4
10 9 8 7
10 9 8 7
 6 5 4
  3 2
   1

   */

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[][]=new int[n][n];
        int sum=0;
        int count=0;
        for(int row=0;row<n;row++)
        {
            for(int blank=0;blank<(n-row-1);blank++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<(row+1);col++)
            {
                System.out.print( " ");
            }
            sum+=row;
            System.out.println();
        }
    }
}