package com.ROUND2;
import java.util.*;
public class numberPattern2 {
    /*
       input:
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Rows:");
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=0;j<(n-i);j++)
            {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
