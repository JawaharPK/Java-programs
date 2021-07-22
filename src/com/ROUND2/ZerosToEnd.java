package com.ROUND2;
 import java.util.Scanner;

public class ZerosToEnd{
    public static void main(String args[]) {
        /*
        input={1,2,0,4,3,0,5,0}
        output={1,2,4,3,5,0,0,0}
         */

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        int count = 0;
        for (int row = 0; row < n; row++)
        {
            a[row] = input.nextInt();
        }
        for (int row = 0; row < n; row++)
        {
            if (a[row] != 0)
            {
                a[count++] = a[row];
            }
        }
        while (count < n)
        {
             a[count++]=0;
        }
        for(int row=0;row<n;row++)
        {
            System.out.print(a[row]);
            System.out.print(" ");
        }
    }
}
