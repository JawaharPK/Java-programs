package com.telegramzoho;
import java.util.*;
public class problem24 {
    /*
       input:5

       output:
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int max;
        for(int i=1;i<=n;i++)
        {
            //upper left
            for(int j=1;j<=n;j++)
            {
                max=(i<j)?i:j;
                System.out.print(n-max+1+" ");
            }
            //upper right
            for(int j=n-1;j>=1;j--)
            {
                max=(i<j)?i:j;
                System.out.print(n-max+1+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            //down left
            for(int j=1;j<=n;j++)
            {
                max=(i<j)?i:j;
                System.out.print(n-max+1+" ");
            }
            //down right
            for(int j=n-1;j>=1;j--)
            {
                max=(i<j)?i:j;
                System.out.print(n-max+1+" ");
            }
            System.out.println();
        }
    }
}
