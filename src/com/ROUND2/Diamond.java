package com.ROUND2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Diamond{

    /*

    input :
           4

    output:

              *
             * *
            * * *
           * * * *
            * * *
             * *
              *
     */



    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int row=0;row<n;row++)
        {
            for(int blank=0;blank<(n-row-1);blank++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<(row+1);col++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int row=n;row>1;row--)
        {
            for(int blank=0;blank<(n-row+1);blank++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<(row-1);col++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}
