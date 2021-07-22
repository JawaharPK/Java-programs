package com.telegramzoho;
import java.util.*;
public class problem12 {
    /*
       input:
            5
            1 2 3 6 9
            4
            2 4 5 10

7
4 7 8 10 12 30 35
9
1 3 4 5 7 8 11 13 22



       output:
             1 2 3 4 5 6 9 10
     */
    public static void alternatesort(int arr[],int brr[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
             hs.add(arr[i]);
        }
        for(int i=0;i<brr.length;i++)
        {
             hs.add(brr[i]);
        }
        Object []res=hs.toArray();
        Arrays.sort(res);
        for(int i=0;i< res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n1= input.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<n1;arr[i++]= input.nextInt());
        int n2= input.nextInt();
        int brr[]=new int[n2];
        for(int i=0;i<n2;brr[i++]= input.nextInt());
        alternatesort(arr,brr);
    }
}
