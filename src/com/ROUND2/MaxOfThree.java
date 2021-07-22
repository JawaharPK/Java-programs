package com.ROUND2;
import java.util.Scanner;
public class MaxOfThree
{
    /*
     input:
     1 1 5 2 6 2 4 8 9

     output:
     5 5 6 6 6 8 1
     */

    public static void printmax(int arr[],int k,int n)
    {
     for(int i=0;i<=n-k;i++)
     {
         int max=0;
        for(int j=i;j<i+k;j++)
         {
             if(max<arr[j])
             {
                 max=arr[j];
             }
         }
         System.out.print(max+" ");
     }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int k=3;
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        printmax(a,k,n);
    }
}
