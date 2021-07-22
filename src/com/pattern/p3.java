package com.pattern;
import java.util.*;
public class p3 {
    /*
     3
* * * * * *
*         *
* * * * * *
     */
    public static void main(String args[])
    {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<2*n;j++)
          {
              if(i==0 || j==0 || i==n-1 || j==(2*n)-1)
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
