package com.NEW;
import java.util.*;
public class numberOfPaths {
    public static long numberOfPath(int m, int n)
    {
      long path=1;
      for(int i=n;i<(m+n-1);i++)
      {
          path*=i;
          path/=(i-n+1);
      }
      return path;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("N:");
        int n= input.nextInt();
        System.out.print("M:");
        int m= input.nextInt();
        long res=numberOfPath(m,n);
        System.out.println(res);
    }
}
