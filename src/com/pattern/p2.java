package com.pattern;
import java.util.*;
public class p2 {
    public static void main(String args[])
    {
     Scanner input =new Scanner(System.in);
     int n= input.nextInt();
     for(int i=0;i<n;i++)
     {
         for(int blank=0;blank<(n-i-1);blank++)
         {
             System.out.print(" ");
         }
         for(int j=0;j<(i+1);j++)
         {
             System.out.print("*"+" ");
         }
         System.out.println();
     }
     for(int x=n;x>1;x--)
     {
         for(int blank=0;blank<(n-x+1);blank++)
         {
             System.out.print(" ");
         }
         for(int y=0;y<(x-1);y++)
         {
             System.out.print("*"+" ");
         }
         System.out.println();
     }
    }
}
