package com.ROUND2;

import java.util.Scanner;
/*
input:
    iluvcar
output:

      i            r
        l        a
          u    c
            v
          u   c
        l       a
      i            r
 */

public class CrossString
{
    public void cross(String s)
    {
        int n= s.length();
       for(int row=0;row<n;row++)
       {
           for(int col=0;col<n;col++)
           {
               if(row==col||(row+col)==n-1)
               {
                   System.out.print(s.charAt(col));
               }
               else
               {
                   System.out.print(" ");
               }
           }
           System.out.println(" ");
       }

    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str="geeksforgeeks";
        CrossString c=new CrossString();
        c.cross(str);

    }
}
