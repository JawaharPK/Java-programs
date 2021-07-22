package com.ROUND2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rearrange {
    /*
    Ex input  3 4 3 4 1 2 3 1 2

    Output 2 2 3 2
     */

    public static void max(int b[],int n) {
        ArrayList a = new ArrayList();
        for(int i=0;i<n;i++)
        {
            a.add(b[i]);
        }
        Object arr1[] = a.toArray();
        Arrays.sort(arr1);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++)
        {
            sb.append(arr1[i]);
        }
        String str=sb.toString();
        for(int i=0;i<n;i++)
        {
            int count=1;
            while(i+1<n&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            System.out.print(count+" ");
        }

    }
    public static void main(String args[])
    {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=input.nextInt();
       }
       max(a,n);
    }

}
