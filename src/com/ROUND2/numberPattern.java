package com.ROUND2;
import java.util.*;
public class numberPattern {
    /*
       input:4
       output:
             2
             4 8
             16 32 64


     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=input.nextInt();
        int mul=2;
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(i+1);j++)
            {
                System.out.print(mul+" ");
                mul=mul*2;
            }
            System.out.println();
        }
    }
}
