package com.HARISH;
import java.util.*;
public class movies {
    public static void check(String arr[],String brr[])
    {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            hs.add(arr[i]);
        }
        System.out.println("Movies liked by both are ");
        for (int i = 0; i < brr.length; i++)
        {
            if (hs.contains(brr[i]))
            {
                System.out.print(brr[i] + " ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Number of movies");
        int n= input.nextInt();
        String arr[]=new String[n];
        String brr[]=new String[n];
        System.out.println("Movies which Janu likes");
        for(int i=0;i<n;i++)
        {
            arr[i]= input.next();
        }
        System.out.println("Movies which Ramu likes");
        for(int i=0;i<n;i++)
        {
            brr[i]= input.next();
        }
        check(arr,brr);
    }
}
