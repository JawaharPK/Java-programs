package com.telegramzoho;
import java.util.*;
public class problem4 {
    /*
       input:
            6
            5 8 10 13 6 2
            3
       output:
            17

            5         3,2              2
            8         3,3,2            3
            10        3,3,3,1          4
            13        3,3,3,3,1        5
            6         3,3              2
            2         2                1

     */
    public static void main(String args[])
    {
     Scanner input=new Scanner(System.in);
     int n= input.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;arr[i++]= input.nextInt());
     int th= input.nextInt();
     int count=0;
     for(int i=0;i<n;i++)
     {
         count+=(arr[i]/th)+(arr[i]%th==0?0:1);
     }
     System.out.println(count);
    }
}
