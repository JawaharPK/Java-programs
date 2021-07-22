package com.NEW;
import java.util.*;
public class twoArrays {
    /*
       input:
            {1,2,3}
            {3,2,1}
       output:
             123+321=444
     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("N:");
        int n= input.nextInt();
        char []a=new char[n];
        String s1="",s2="";
        for(int i=0;i<n;i++)
        {
            a[i]=input.next().charAt(0);
            s1+=a[i];                            //  123
        }
        System.out.print("M:");
        int m=input.nextInt();
        char []b=new char[m];
        for(int i=0;i<m;i++)
        {
            b[i]=input.next().charAt(0);
            s2+=b[i];                            //  321
        }
        int a1=Integer.valueOf(s1);
        int a2=Integer.valueOf(s2);
        System.out.println(a1+a2);               //  123+321
    }
}
