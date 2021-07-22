package com.ROUND2;
import java.util.*;
public class ContinousRange {
  /*  Ex.  INPUT  :

    Enter array size  :  8
    Enter arryay elements  :  1 3 10 7 9 2 4 6

    OUTPUT  :
            1 2 3 4

    Ex.  INPUT  :

    Enter array size  :  8
    Enter arryay elements  :  1 3 9 7 8 2 4 6

    OUTPUT  :

            1 2 3 4
            6 7 8 9

   */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=input.nextInt();
        System.out.println("Enter the given elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= input.nextInt();
        }
        Arrays.sort(arr);   // 1 2 3 4 6 7 9 10
        int count=1;
        for(int i=0;i<n;i++)
        {
            count=arr[i];
            while(arr[i+1]==count+1 && i+1<n)
            {
                System.out.print(arr[i]);
                count++;
                i++;
            }
        }
    }
}
