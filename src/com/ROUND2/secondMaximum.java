package com.ROUND2;
import java.util.*;
public class secondMaximum {
    /*
      INPUT  :

    Size of Array    :  8
    Enter the elements  :  2 5 1 6 2 6 7 10

    OUTPUT  :
    7
     */
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
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=arr[n-1])
            {
                System.out.print("Second largest number is"+" ");
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.println("there is no second largest number");
    }
}
