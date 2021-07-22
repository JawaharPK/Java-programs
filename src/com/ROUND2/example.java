package com.ROUND2;
import java.util.*;
public class example {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Size of Array:");
        int n=input.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second largest number is:"+" "+arr[n-2]);
    }
}

