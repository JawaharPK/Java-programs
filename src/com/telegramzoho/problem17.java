package com.telegramzoho;
import java.util.*;
public class problem17 {
    /*
Input:
Welcome
Output:
w               e
   e         m
      l   o
        c
      l   o
   e         m
w               e

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s= input.next();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i==j || i+j==s.length()-1)
                {
                    System.out.print(s.charAt(j)+"");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
