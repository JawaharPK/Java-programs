package com.telegramzoho;
import java.util.*;
public class problem14 {
    /*
        input:
            10
            4 7 18 16 14 16 7 13 10 2
        output:
4-1
7-2
18-1
16-2
14-1
13-1
10-1
2-1

     */
    public static void countArray(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            int count=1;
            for(int j=0;j< arr.length;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    count++;
                }
            }
            System.out.println(arr[i]+"-"+count);
        }
    }
    public static void main(String args[])
    {
     Scanner input=new Scanner(System.in);
     int n= input.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;arr[i++]= input.nextInt());
     countArray(arr);
    }
}
