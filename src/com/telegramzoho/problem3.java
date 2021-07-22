package com.telegramzoho;
import java.util.*;
public class problem3 {
    /*
      input:
          9
          23 7 8 30 18 12 6 28 16
                            n-2 n-1
      output:
          23 7 18 12 16 28 8 30 6

     */
    public static void ASC_bubbleSort(int arr[],int n,int start) {
        {
            int i,flag,temp;
            do {
                for (i=start,flag=0;i<n-2;i+=2)
                {                                                                                       // runs 4 times
                    if (arr[i]>arr[i+ 2])
                    {
                        flag=1;
                        temp=arr[i];
                        arr[i]=arr[i+2];
                        arr[i+2]=temp;
                    }
                }
            } while(flag==1);
        }
    }
    public static void DEC_bubbleSort(int arr[],int n,int start) {
        {
            int i,flag,temp;
            do {
                for (i=start,flag=0;i<n-2;i+=2)
                {                                                                                     // 3 times
                    if (arr[i]<arr[i+2]) {
                        flag=1;
                        temp=arr[i];
                        arr[i]=arr[i+2];
                        arr[i+2]=temp;
                    }
                }
            }while(flag==1);
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;arr[i++]=input.nextInt());
        ASC_bubbleSort(arr, n - 1, 1);
        DEC_bubbleSort(arr, n, 0);
        for(int i=0;i<n; System.out.print(arr[i++]+" "));
    }
}