package com.NEW;
import java.util.*;
public class sortInWave {
    /*
       input:
             10,90,49,2,1,5,23        1,2,5,10,23,49,90
       output:
             2,1,10,5,49,23,90
     */
    void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    void sortInwave(int arr[],int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n-1;i+=2)
        {
            swap(arr,i,i+1);
        }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[7];
        sortInWave s=new sortInWave();
        for(int i=0;i<7;i++)
        {
            arr[i]= input.nextInt();
        }
        s.sortInwave(arr,7);
        for(int i=0;i<7;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
