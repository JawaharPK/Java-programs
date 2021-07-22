package com.ROUND2;
import java.util.*;
public class reverseAllStrings {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=input.next();
        }
        String s="";
        for(int i= str.length-1;i>=0;i--)
        {
            s=s+str[i]+" ";
        }
        System.out.println(s);
    }
}
