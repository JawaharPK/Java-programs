package com.telegramzoho;
import java.util.*;
public class problem16 {
    /*
        input:
              7

        output:
7 7 7 7 7 7 7 7 7 7 7 7 7
7 6 6 6 6 6 6 6 6 6 6 6 7
7 6 5 5 5 5 5 5 5 5 5 6 7
7 6 5 4 4 4 4 4 4 4 5 6 7
7 6 5 4 3 3 3 3 3 4 5 6 7
7 6 5 4 3 2 2 2 3 4 5 6 7
7 6 5 4 3 2 1 2 3 4 5 6 7
7 6 5 4 3 2 2 2 3 4 5 6 7
7 6 5 4 3 3 3 3 3 4 5 6 7
7 6 5 4 4 4 4 4 4 4 5 6 7
7 6 5 5 5 5 5 5 5 5 5 6 7
7 6 6 6 6 6 6 6 6 6 6 6 7
7 7 7 7 7 7 7 7 7 7 7 7 7
     */
    public static void main(String args[])
    {
        int i, j, min, n; //n is the number up to you want to print
        System.out.print("Enter the value of n: ");
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        for( i=1;i<=n;i++)
        {
            //upper left
            for(j=1;j<=n;j++)
            {
                min=(i<j)?i:j;
                System.out.print(n-min+1+" ");
            }
            //upper right
            for(j=n-1;j>=1;j--)
            {
                min=(i<j)?i:j;
                System.out.print(n-min+1+" ");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            //lower right
            for(j=1;j<=n;j++)
            {
                min=(i<j)?i:j;
                System.out.print(n-min+1+" ");
            }
            //lower left
            for(j=n-1;j>=1;j--)
            {
                min=(i<j)?i:j;
                System.out.print(n-min+1+" ");
            }
            System.out.println();
        }
    }
}

