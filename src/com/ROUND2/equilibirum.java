package com.ROUND2;
import java.util.*;

public class equilibirum {

    /*
       Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
       Output: 3

       Input: A[] = {1, 2, 3}
       Output: -1 //no equilibrium
     */
    public static int checkSum(int arr[],int n)
    {
       int i,j;
       int left,right;
       for(i=0;i<n;++i)
       {
           left=0;
           for(j=0;j<i;j++)
           {
               left+=arr[j];
           }
           right=0;
           for(j=i+1;j<n;j++)
           {
               right+=arr[j];
           }
           if(left==right)
           {
               return i;
           }
       }
       return -1;
    }
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<7;i++)
        {
            arr[i]=input.nextInt();
        }
        int m=checkSum(arr,arr.length);
        System.out.println(m);
    }
}
