package com.DataStructures;
import java.util.*;
public class CrossString {
    public static void isCrossString(String s)
    {
        int n=s.length();
      for(int i=0;i<s.length();i++)
      {
          for(int j=0;j<s.length();j++)
          {
              if(i==j || i+j==n-1)
              {
                  System.out.print(s.charAt(j));
              }
              else
              {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        isCrossString(s);
    }
}
