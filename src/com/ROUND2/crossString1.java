package com.ROUND2;
import java.util.*;
public class
crossString1 {
    /*
      program

      g
     gr
    gra
   gram
  gramp
 grampr
grampro
     */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int n=str.length();
        int mid=n/2;
        for(int i=0;i<n;i++)
        {
           for(int blank=0;blank<(n-i-1);blank++)
           {
               System.out.print(" ");
           }
            for(int j=0,k=mid;j<(i+1);j++,k++)
            {
                if(k==n)
                {
                    k = 0;
                }
                System.out.print(str.charAt(k));
            }
            System.out.println();
        }
    }
}
