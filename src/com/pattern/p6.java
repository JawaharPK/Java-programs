package com.pattern;
import java.util.*;
public class p6 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int blank=0;blank<(n-i-1);blank++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)+1;j++)
            {
                if(j<=i)
                {
                    System.out.print(++count);
                }
                else
                {
                    System.out.print(--count);
                }
            }
            count+=i;
            System.out.println();
        }
    }
}
