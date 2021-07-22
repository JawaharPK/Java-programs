package com.telegramzoho;
import java.util.*;
public class problem10 {
        public static void sortOddEven(int a[])
        {
            Arrays.sort(a);
            int n=a.length;
            /*
input:
15
5 15 10 25 55 35 75 45 95 50 70 40 60 90 3

output:
95 3 90 5 75 10 70 15 60 25 55 35 50 40 45

*/
            for(int i=0;i<=n/2;i++)
            {
                if(i<n/2)
                {
                    System.out.print(a[n-i-1]+" "+a[i]+" ");
                }
                if(i==n/2 && n%2!=0)
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
            for (int i = 0; i < n; i++)
            {
                a[i] = input.nextInt();
            }
            sortOddEven(a);
        }
}

