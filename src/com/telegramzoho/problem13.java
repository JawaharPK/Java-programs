package com.telegramzoho;
import java.util.*;
public class problem13 {
    public static int maxcount(int a[])
    {
        int count=1,tempcount;
        int max=a[0];
        int temp=0;
        for(int i=0;i<(a.length-1);i++)
        {
            temp=a[i];
            tempcount=0;
            for(int j=1;j<a.length;j++)
            {
                if(temp==a[j])
                {
                    tempcount++;
                }
            }
            if(tempcount>count)
            {
                max=temp;
                count=tempcount;
            }
        }
        return max;
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
         System.out.println(maxcount(arr));
     }
}
