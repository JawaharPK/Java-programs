package com.ROUND2;
import java.util.*;
public class pattern {
    /*
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
     */

    public static void main(String args[])
    {
        Scanner imnput=new Scanner(System.in);
        System.out.println("Input:");
        int n= imnput.nextInt();
        int count=0;
        for(int row=0;row<n;row++)
        {
            for(int blank=0;blank<(n-row-1);blank++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<(row+1);col++)
            {
                if(col==0 || col==row)
                {
                    System.out.print("1"+" ");
                }
                else if(row+1==n && col==n/2)
                {
                    System.out.print(count+2+" ");
                }
                else
                {
                    System.out.print(count+" ");
                }
            }
            count++;
            System.out.println();
        }
    }
}
