package com.ROUND2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.lang.*;


public class NumDiamond{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int noOfRows = input.nextInt();
        /*
        input:4
        output:
             2
            4 6
          8 10 12
         14 16 18 20

         */
        for(int row=0;row<noOfRows;row++)
        {
            int count=1;
            for(int blank=0;blank<(noOfRows-row)-1;blank++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<(row+1);col++)
            {

                System.out.print(count+" ");
                count++;

            }
            System.out.println();
        }
        for(int row=noOfRows;row>1;row--)
        {
            int count=1;
            for(int blank=0;blank<(noOfRows-row)+1;blank++)
            {
                System.out.print(" ");
            }
            for(int col=row-1;col>0;col--)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
}

