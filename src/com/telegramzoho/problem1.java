package com.telegramzoho;
import java.util.*;
public class problem1
{
    /*
      input:
          8
          1 3 5 2 1 8 6 9
          3
      output:
          5 5 5 8 8 9

     */
    public static void maxOfThree(int n,int arr[],int k)
    {
     for(int i=0;i<=n-k;i++)
     {
         int max=0;
         for(int j=i;j<i+k;j++)
         {
             if(arr[j]>max)
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
     int n= input.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]= input.nextInt();
     }
     int k= input.nextInt();
     maxOfThree(n,arr,k);
    }
}
