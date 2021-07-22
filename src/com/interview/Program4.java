package com.interview;
import java.util.*;
public class Program4 {
    public static int minMax(int arr[])
    {
        int min=0,max=0,res;
        min=arr[0];
        max=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        res=(min+max)*(max-min);
        return res;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= input.nextInt();
        }
        System.out.println(minMax(arr));
    }
}
