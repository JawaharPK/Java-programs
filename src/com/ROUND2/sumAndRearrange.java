package com.ROUND2;
import java.util.*;

public class sumAndRearrange{
   /*
   Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0
    */

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i = 0; i <n-1; i++)
        {
            if ((arr[i] != 0) && (arr[i] == arr[i + 1]))
            {
                arr[i] = 2 * arr[i];
                arr[i + 1] = 0;
                i++;
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while(count<n)
        {
            arr[count]=0;
            count++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
