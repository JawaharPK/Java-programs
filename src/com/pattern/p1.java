package com.pattern;
import java.util.*;
public class p1 {
    /*
    6
* * * * * *
*       *
*     *
*   *
* *
*
     */


    public static void main(String args[])
    {
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<n-i;j++)
         {
             if(i==0 || j==0 ||j==n-i-1)
             {
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
