package com.ROUND2;
import java.util.*;
public class Anagram
{
    /*
      input:
            silent
            listen
       output:
            are anagaram

     */

    static boolean Anagram(String a,String b)
    {
      char []arr=a.toCharArray();
      char []brr=b.toCharArray();
      int n=arr.length;
      int m=brr.length;
      if(n!=m)
      {
          return false;
      }
      Arrays.sort(arr);
      Arrays.sort(brr);
      for(int i=0;i<n;i++)
      {
          if(arr[i]!=brr[i])
          {
              return false;
          }
      }
      return true;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String a=input.next();
        String b=input.next();
        if(Anagram(a,b))
        {
            System.out.println("The given strings are anagram of each other");
        }
        else
        {
            System.out.println("The given strings are not anagaram of each other");
        }
    }

}
