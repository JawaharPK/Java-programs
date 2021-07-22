package com.ROUND2;
import java.util.*;
public class numberPattern5 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int blank=n-i;blank>0;blank--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
