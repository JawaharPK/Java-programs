package com.ROUND2;
import java.util.*;
public class CharsP {
    /*
    input : aaabbcc
    output : abc

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String str="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            str+=s.charAt(i);
            while(i+1<n && s.charAt(i)==s.charAt(i+1))
            {
                i++;
            }
        }
        System.out.println(str);
    }

}
