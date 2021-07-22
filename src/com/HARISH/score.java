package com.HARISH;
import java.util.*;
public class score {
    public static int HighScore(int arr[])
    {
        int hs=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]>hs)
            {
                hs=arr[i];
            }
        }
        return hs;
    }
    public static int LowestScore(int arr[])
    {
        int ls=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<ls)
            {
                ls=arr[i];
            }
        }
        return ls;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of players:");
        int n= input.nextInt();
        int arr[]=new int[n];
        int hs=0,ls=0,sum=0;
        System.out.println("Enter the scores of the players:");
        for(int i=0;i<n;i++)
        {
            arr[i]= input.nextInt();
            sum+=arr[i];
        }
        System.out.println("Hghest Score:"+HighScore(arr));
        System.out.println("Lowest Score:"+LowestScore(arr));
        System.out.println("Median:"+arr[n/2]+" and Average:"+(sum));
    }
}
