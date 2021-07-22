package com.ROUND2;

import java.util.Arrays;
import java.util.Scanner;

public class oddrearr {
    public static void sortOddEven(int a[])
    {
        Arrays.sort(a);
        int n=a.length;
        /*
input:
     3 4 5 2 1 7 8 6 9  // 1 2 3 4 5 6 7 8 9

output:
     9 1 8 2 7 3 6 4 5

*/
        for(int i=0;i<=n/2;i++)
        {
            if(i<n/2)
            {
                System.out.print(a[n-i-1]+" "+a[i]+" ");
            }
            if(i==n/2)
            {
                System.out.print(a[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        sortOddEven(a);
    }
}
