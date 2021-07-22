package com.pattern;
import java.util.*;
public class p4 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int blank=0;blank<n-i-1;blank++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++)
            {
                if(j==0 || i==n-1 || j==i) {
                    System.out.print("*" + " ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

}
